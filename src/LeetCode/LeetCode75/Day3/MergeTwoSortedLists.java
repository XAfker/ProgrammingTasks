package LeetCode.LeetCode75.Day3;

public class MergeTwoSortedLists {


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode head;
        if(list1.val <= list2.val){
            head = list1;
            list1 = list1.next;
        }
        else{
            head = list2;
            list2 = list2.next;
        }
        ListNode tmp = head;
        while (list1 != null && list2 != null){
            if (list1.val <= list2.val){
                tmp.next = list1;
                list1 = list1.next;
            }
            else {
                tmp.next = list2;
                list2 = list2.next;
            }
            tmp = tmp.next;
        }

        if(list2==null)
            tmp.next = list1;
        else
            tmp.next = list2;

        return head;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }