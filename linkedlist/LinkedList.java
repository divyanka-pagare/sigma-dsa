package linkedlist;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        //constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    //add first - O(1) constant time
    public void addFirst(int data) {
        //step1 - creat new node
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        //step2 - newNode next = head
        newNode.next = head; //link

        //step3 - head = newNode
        head = newNode;
    }
        
    //add last - O(1) constant time
    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() { //O(n) linear time
        // if(head == null) {
        //     System.out.println("LL is empty");
        //     return;
        // }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //add in the middle 
    //linking - O(1)
    //where to link - O(n)
    public void add(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i=0;

        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        //i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList(); //obj
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 9);

        ll.print();
    }
}
