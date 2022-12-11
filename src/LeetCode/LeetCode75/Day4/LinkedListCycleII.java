package LeetCode.LeetCode75.Day4;

public class LinkedListCycleII {
    public static void main(String[] args) {

    }
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                ListNode tmp = head;
                while (tmp!=slow){
                    tmp = tmp.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
