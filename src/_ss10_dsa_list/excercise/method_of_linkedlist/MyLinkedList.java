package _ss10_dsa_list.excercise.method_of_linkedlist;

public class MyLinkedList <E> {

    private Node head;
    private int numNodes;


    public MyLinkedList(Object data) {
        head = new Node(data);
        this.numNodes = 1;
    }

    public MyLinkedList() {

    }

    public void add(int index, E element){
        Node temp = head;
        Node holder;
        for (int i = 0; i < index-1 ; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E element){
            Node temp = head;
            head = new Node(element);
            head.next = temp;
            numNodes++;
    }

    public void addLast(Object element){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    public Object remove(int index){
        Node temp = head;
        Object data;
        if (index == 0){
            data = head.data;
            head = head.next;
        } else{
            for (int i = 0; i < index -1 && temp.next != null ; i++) {
                temp = temp.next;
            }
            data = temp.next;
            temp.next = temp.next.next;
        }
        numNodes--;
        return data;
    }

    public boolean removeElement(Object element){
        if (head.data.equals(element)){
            remove(0);
            return true;
        }else{
            Node temp = head;
            while(temp.next != null){
                if (temp.next.data.equals(element)){
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
                temp = temp.next;
            }
        }
        numNodes--;
        return false;
    }

    public Object getFirst(){
        return head;
    }

    public Object getLast(){
        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        return temp.data;
    }

    public Object get(int index){
        if(index==0){
            getFirst();
        }
        Node temp = head;
        for (int i = 0; i < index && temp.next != null; i++) {
                temp = temp.next;
            }
        return  temp.data;
    }


    public int size(){
        return numNodes;
    }

    public boolean contains(E element){
        if (head.data.equals(element)){
            return true;
        }else {
            Node temp = head;
            while (temp.next!=null){
                if (temp.next.data.equals(element)){
                    return true;
                }
                temp=temp.next;
            }
            return false;
        }
    }

    public int indexOf(E element){
        if (head.data.equals(element)){
            return 0;
        }else {
            Node temp = head;
            for (int i = 0; i < size()-1 && temp.next != null ; i++) {
                if (temp.next.data.equals(element)){
                    return i;
                }
                temp = temp.next;
            }
            return -1;
        }
    }

    public MyLinkedList<E> clone(){
        if(numNodes==0){
            throw new NullPointerException();
        }
        MyLinkedList<E> tempList = new MyLinkedList<E>();
        Node tempNode = head;
        tempList.addFirst( (E)tempNode.data);
        tempNode = tempNode.next;
        while (tempNode!=null){
            tempList.addLast((E) tempNode.data);
            tempNode = tempNode.next;
        }
        return tempList;
    }

    public void printList(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    public class Node{
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }
        public Object getData(){
            return this.data;
        }
    }
}
