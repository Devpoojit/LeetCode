package RemoveDuplicatesList;

public class RemoveDuplicatesMain {
    public static void main(String[] args) {
        RemoveDuplicates ob = new RemoveDuplicates();

        ListNode head = new ListNode(1); // First element
        head.next = new ListNode(1); // Second element
        head.next.next = new ListNode(2);

        ListNode test1 = ob.deleteDuplicates(head);
        System.out.println("[1, 1, 2]");
        while(test1 != null) {
            System.out.println(test1.val);
            test1 = test1.next;
        }
        System.out.println("--------------------------------");
        test1 = null;

        ListNode head2 = new ListNode(1); // First element
        head2.next = new ListNode(1); // Second element
        head2.next.next = new ListNode(2);
        head2.next.next.next = new ListNode(3);
        head2.next.next.next.next = new ListNode(3);

        test1 = ob.deleteDuplicates(head2);
        while(test1 != null) {
            System.out.println(test1.val);
            test1 = test1.next;
        }
    }
}
