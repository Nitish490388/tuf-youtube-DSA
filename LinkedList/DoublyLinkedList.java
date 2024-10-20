package LinkedList;


class Node2 {
    int data;
    Node2 prev;
    Node2 next;

    Node2(int data) {
        this.data = data;
        prev = next = null;
    }
}

public class DoublyLinkedList {
    private Node2 head;

    void insert(int data) {
        Node2 newNode = new Node2(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node2 temp = head;
        while(temp.next != null) {
            temp = temp.next; 
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    void display() {
        if(head == null) {
            System.out.println("List is empty");
        }
        Node2 temp = head;
        while(temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    void delete (int data) {
        if(head == null) {
            System.out.println("List is empty");
            return ;
        }

        Node2 temp = head;
        if (temp.data == data) {
            // If the list has only one node
            if (temp.next == null) {
                head = null; // List becomes empty
            } else {
                head = temp.next; // Move head to the next node
                head.prev = null; // Set the previous of new head to null
            }
            return;
        }
       
        while(temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }
         if(temp.next != null) {
            Node2 nodeToDelete = temp.next;
            temp.next = nodeToDelete.next;
            
            if (nodeToDelete.next != null) {
                nodeToDelete.next.prev = temp;
            }

         } else {
            System.out.println("Itme not exists");
         }
    }
}
