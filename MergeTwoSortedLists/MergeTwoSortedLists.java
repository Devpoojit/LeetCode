package MergeTwoSortedLists;
import AddTwoNum.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode iterator = result;

        if(list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        while (list1 != null && list2 != null) {
            int a = list1.val;
            int b = list2.val;
            if(a <= b) {
                iterator.next = list1;
                list1 = list1.next;
            } else {
                iterator.next = list2;
                list2 = list2.next;
            }
            iterator = iterator.next;
        }

        if (list1 != null) {
            iterator.next = list1;
        } else if (list2 != null) {
            iterator.next = list2;
        }
        
        return result.next;
    }
}
