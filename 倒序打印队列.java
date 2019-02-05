/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> tempStack = new Stack<>();
        ArrayList<Integer> tempList = new ArrayList<>();
        while(listNode != null){
            tempStack.add(listNode.val);
            listNode = listNode.next;
        }
        while(!tempStack.isEmpty()){
            tempList.add(tempStack.pop());
        }
        return tempList;
    }
}