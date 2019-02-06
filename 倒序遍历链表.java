/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode temp = head;
        int counter=0;
        while(null != temp){
            counter += 1;
            temp=temp.next;
        }
        
        if(k > counter){
            return null;
        }
        else{
            temp = head;
            counter = counter-k;
            for(int i=0; i<counter && null != temp;i++){
                temp = temp.next;
            }
            return temp;
        }
    }
}