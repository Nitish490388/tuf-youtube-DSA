package LinkedList;

/**
 * linkedList
 */

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;  
    }
}

public class linkedList {
    private Node head;

     void insert(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

    }

    void display() {
        if(head == null) {
            System.out.println("List is empty");
            return ;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    void delete(int data) {
        if(head == null) {
            System.out.println("List is empty");
            return ;
        }

        Node temp = head;
        if(temp.data == data) {
            head = temp.next;
            return;
        }
        while(temp.next != null && temp.next.data != data ) {
            temp = temp.next;
        }
        // Im at the node just before the target or next node is null possibly.
        if(temp.next != null) {
            // next node is target
            temp.next = temp.next.next; 
            return ;
        } else {
            System.out.println("Item not exists");
        }
    }

}
