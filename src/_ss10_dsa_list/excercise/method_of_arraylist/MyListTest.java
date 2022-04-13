package _ss10_dsa_list.excercise.method_of_arraylist;

public class MyListTest {
    public static void main(String[] args) {
        MyList <Object> myList = new MyList<>(10);
        myList.add(0,66);
        myList.add(1,11);
        myList.add(2,22);
        myList.add(3,33);
        System.out.println("Current size of list: " + myList.size());
        myList.print();
        System.out.println("\n" + "***remove the element at index 3 in list***");
        myList.remove(3);
        myList.print();
        System.out.println("Checking if element [66] is in list?: " + myList.contains(66));
        System.out.println("Checking if element [67] is in list?: " + myList.contains(67));
        System.out.println("The index of element [22] in list: " + myList.indexOf(22));
        System.out.println("The index of element [23] in list: " + myList.indexOf(23));
        System.out.println("Getting the element at index 2: " + myList.get(2));
        System.out.println("***CLEAR LIST***");
        myList.clear();
        myList.print();
    }
}