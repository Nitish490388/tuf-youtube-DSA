package LinkedList;

public class findMiddleElement {
    
    public static ListNode middleNode(ListNode head) {
        ListNode first = head;
        ListNode second = head;

        while(first != null && first.next != null && second != null) {
            first = first.next.next;
            second = second.next;
        }
        if(first.next != null) {
            second = second.next;
        }
        return second;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println(middleNode(head).val);
    }
}
