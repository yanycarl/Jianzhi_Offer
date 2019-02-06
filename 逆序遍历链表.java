/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
        ListNode last= null;
        ListNode newList = null;
        while(head != null){
            newList = new ListNode(head.val);
            head = head.next;
            newList.next = last;
            last = newList;
        }
        return newList;
    }
}