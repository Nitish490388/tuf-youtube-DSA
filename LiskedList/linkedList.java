package LiskedList;

/**
 * linkedList
 */
public class linkedList {

    public static void main(String[] args) {
        Node n = new Node(1);
    Node n1 = new Node(2);
    Node n2 = new Node(3);

    n.next = n1;
    n1.next = n2;


    Node curr = n;
     while(curr != null) {
        
            System.out.print(curr.value);
            curr = curr.next;

     }
    }
    
}

class Node {
    int value;
    Node next;

    Node (int n) {
        this.value = n;
        next = null;
    }
}