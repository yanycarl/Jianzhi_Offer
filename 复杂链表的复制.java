/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/

import java.util.LinkedList;
import java.util.LinkedHashMap;

public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null){
            return null;
        }
        LinkedHashMap<RandomListNode, Integer> oldList = new LinkedHashMap<RandomListNode, Integer>();
        LinkedHashMap<Integer, RandomListNode> newList = new LinkedHashMap<Integer, RandomListNode>();
        LinkedHashMap<Integer, RandomListNode> randomIndex = new LinkedHashMap<Integer, RandomListNode>();
        RandomListNode temp = pHead;
        RandomListNode newHead = new RandomListNode(pHead.label);
        RandomListNode tempTail = newHead;
        int i = 0;
        oldList.put(pHead, i);
        newList.put(i, newHead);
        randomIndex.put(i, pHead.random);
        while(temp.next != null){
            i++;
            temp = temp.next;
            tempTail.next = new RandomListNode(temp.label);
            tempTail = tempTail.next;
            newList.put(i, tempTail);
            oldList.put(temp, i);
            randomIndex.put(i, temp.random);
        }
        i = 0;
        temp = newHead;
        if(!oldList.containsKey(randomIndex.get(i))){
            temp.random = null;
        }
        else{
            temp.random = newList.get((int)oldList.get(randomIndex.get(i)));
        }
       while(temp.next != null){
            i++;
            temp = temp.next;
            if(!oldList.containsKey(randomIndex.get(i))){
                temp.random = null;
            }
            else{
                temp.random = newList.get((int)oldList.get(randomIndex.get(i)));
            }
        }
        return newHead;
    }
}