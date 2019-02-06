/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode root = new ListNode(0);
        ListNode current = root;
        while(list1 != null && list2 != null){
            if(list1.val > list2.val){
                current.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            else{
                current.next = new ListNode(list1.val);
                list1 = list1.next;
            }
            current = current.next;
        }
        
        if(list2 == null){
            current.next = list1;
        }
        else{
            current.next = list2;
        }
        root = root.next;
        return root;
    }
}