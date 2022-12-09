package LeetCode.LeetCode75.Day3;

public class reverseList {
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        if (head == null)
            return null;
        ListNode headReverse = null;
        while (head != null){
            ListNode next = head.next;
            head.next = headReverse;
            headReverse = head;
            head = next;
        }
        return headReverse;
    }
}

