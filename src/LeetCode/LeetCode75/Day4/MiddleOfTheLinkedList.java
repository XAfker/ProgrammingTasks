package LeetCode.LeetCode75.Day4;



public class MiddleOfTheLinkedList {
    public static void main(String[] args) {

    }
    public ListNode middleNode(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null) {
            return head;
        }

        ListNode secondNode = head;
        int count = 0;

        while (secondNode!=null){
            secondNode = secondNode.next;
            count++;
        }

        count/=2;

        secondNode=head;
        while (count>0){
            secondNode = secondNode.next;
            count--;
        }
     return secondNode;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val,  ListNode next) { this.val = val; this.next = next; }
}
