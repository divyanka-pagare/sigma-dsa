package linkedlist;

public class CircularLL {
    public static class Node {
        int data;
        Node next;
    }
    public static Node addFirst(Node last, int data) {
        if(last != null) 
            return last;
        Node newNode = new Node();
        newNode.data = data;
        last = newNode;
        newNode.next = last;
        return last;
    }

    public static Node addFront(Node last, int data) {
        if(last == null)
            return addFirst(last, data);
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next;
        last.next = newNode;
        return last;
    }

    public static Node addLast(Node last, int data) {
        if(last == null)
            return addFirst(last, data);
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
        return last;
    }

    public static Node addAfter(Node last, int data, int item) {
        if(last == null)
            return null;
        Node newNode, curr;
        curr = last.next;
        do{
            if(curr.data == item) {
                newNode = new Node();
                newNode.data = data;
                newNode.next = curr.next;
                curr.next = newNode;
                if(curr == last)
                    last = newNode;
                return last;
            }
            curr = curr.next;
        }while(curr != last.next);
        System.out.println(item + "Node is not present in the list");
        return last;
    }
    


    public static void main(String args[]) {
        Node last = null;
        last = addFirst(last, 1);
        last = addLast(last, 2);
        last = addFront(last, 3);

    }
}
