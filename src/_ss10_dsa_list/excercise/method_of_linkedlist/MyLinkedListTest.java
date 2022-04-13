package _ss10_dsa_list.excercise.method_of_linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList <Object> myLinkedList = new MyLinkedList<>(11);
        myLinkedList.addLast(22);
        myLinkedList.addLast(33);
        System.out.println("Current list:");
        myLinkedList.printList();
        System.out.println("\n" + "Current size of list: " + myLinkedList.size());
        System.out.println("***adding element 88 into index 2 of list***");
        myLinkedList.add(2, 88);
        //show list after adding
        System.out.println("Current list:");
        myLinkedList.printList();
        System.out.println("\n" +"Current size of list: " + myLinkedList.size());
        System.out.println("Index off element [100] in list: " + myLinkedList.indexOf(100));
        System.out.println("Index off element [33] in list: " + myLinkedList.indexOf(33));
        System.out.println("Checking if element [88] is in list: " + myLinkedList.contains(88));
        System.out.println("Checking if element [99] is in list: " + myLinkedList.contains(99));
        System.out.println("***removing the element at index 3***");
        myLinkedList.remove(3);
        System.out.println("Current list:");
        myLinkedList.printList();
        System.out.println("\n" +"Current size of list: " + myLinkedList.size());
        System.out.println("\n" +"***removing element [22] in list***");
        myLinkedList.removeElement(22);
        System.out.println("Current list:");
        myLinkedList.printList();
        System.out.println("\n" +"Current size of list: " + myLinkedList.size());
        System.out.println("\n" +"***cloning list into a new list***");
        MyLinkedList <Object> newList = myLinkedList.clone();
        System.out.println("\n" + "Current clone list:");
        newList.printList();
        System.out.println("\n" +"Current size of list: " + myLinkedList.size());

    }
}
