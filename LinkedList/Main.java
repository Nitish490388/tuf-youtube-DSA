package LinkedList;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.delete(3);
        list.display();

        // linkedList l = new linkedList();
        // l.insert(1);
        // l.insert(2);
        // l.insert(3);
        // l.delete(3);
        // l.display();
    }
}