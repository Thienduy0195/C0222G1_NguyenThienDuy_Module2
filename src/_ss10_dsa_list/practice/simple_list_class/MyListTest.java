package _ss10_dsa_list.practice.simple_list_class;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        //adding elements into listInteger
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);

        //displaying the elements in new added list
        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));

        //displaying the elements which is not in new added list
        System.out.println("element 6: "+listInteger.get(6));
        System.out.println("element -1: "+listInteger.get(-1));
    }
}
