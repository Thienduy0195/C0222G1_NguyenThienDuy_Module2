package _ss10_dsa_list.practice.simple_linked_list_in_java;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList();
        ll.addFirst(11);
        ll.addFirst(22);
        ll.addFirst(33);
        ll.addFirst(44);
        ll.add(3, 55);
        ll.printList();
    }
}
