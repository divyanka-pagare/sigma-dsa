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

    public static Node remove(Node last, int key) {
        if(last == null)
            return null;
        if(last.data == key && last.next == last) {
            last = null;
            return last;
        }
        Node temp = last, d = new Node();
        if(last.data == key) {
            while(temp.next != last) {
                temp = temp.next;
            }
            temp.next = last.next;
            last = temp.next;
        }
        while(temp.next != last && temp.next.data != key) {
            temp = temp.next;
        }
        if(temp.next.data == key) {
            d = temp.next;
            temp.next = d.next;
        }
        return last;
    }

    public static void traverse(Node last) {
        Node p;
        if(last == null) {
            System.out.println("List is empty");
            return;
        }
        p = last.next;
        do{
            System.out.print(p.data + " ");
            p = p.next;
        } while(p != last.next);
    }
    

    public static void main(String args[]) {
        Node last = null;
        last = addFirst(last, 1);
        last = addLast(last, 2);
        last = addFront(last, 3);
        last = addAfter(last, 10, 2);
        traverse(last);
        remove(last, 8);
        traverse(last);
    }
}
