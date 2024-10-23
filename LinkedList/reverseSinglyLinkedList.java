package LinkedList;
import java.util.*;

public class reverseSinglyLinkedList {

    // brute force
    public static ListNode reverseList(ListNode head) {
        ListNode temp = head;
        Stack<Integer> st = new Stack<>();
        while(temp != null) {
            st.push(temp.val);
            temp = temp.next;
        }

        temp = head; 
        while(temp != null) {
            temp.val = st.pop();
            temp = temp.next;
        }
        return head;
    }
    
    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        list.display();
    }
}
