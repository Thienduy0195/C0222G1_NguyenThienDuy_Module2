package _ss10_dsa_list.excercise.method_of_arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object elements[];


    public MyList() {
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, Object element) {
        ensureCapacity();
        elements[index] = element;
        size++;
    }

    public Object remove(int index) {
        Object element = elements[index];
        for (int i = index; i < size ; i++) {
            elements[i] = elements[i+1];
        }
        size--;
        return element;
    }

    public int size() {
        return size;
    }

    public Object clone(Object[] newArray){
        elements = newArray;
        return (Object) elements;
    }
    public boolean contains(Object value) {
        boolean check = true;
        for (Object item: elements) {
            if (item==value){
                check = true;
                break;
            }else {
                check = false;
            }
        }
        return check;
    }

    public int indexOf(E value) {
        for (int i = 0; i < size ; i++) {
            if (elements[i] == value){
                return i;
            }
        }
        return -1;
    }

    public void ensureCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, (elements.length * 2));
        }
    }

    public E get(int index) {
        if (index>= size || index <0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size );
        }
        return (E) elements[index];
    }

    public void clear() {
        elements = Arrays.copyOf(elements,0);
        size = 0;
    }

    public void print(){
        String str ="";
        for (int i = 0; i < size; i++) {
            str += get(i) + " ";
        }
        System.out.print("List: [ " + str +"]");
    }

}
