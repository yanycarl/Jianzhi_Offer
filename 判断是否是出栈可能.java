import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int pushIndex = 1;
        int popIndex = 0;
        Stack<Integer> pop = new Stack<Integer>();
        pop.push(pushA[0]);
        while(true)
        {
            if(pushIndex < pushA.length){ //还没有全部进栈
                if(popA[popIndex] == pop.peek()){ //有对应的
                    pop.pop();
                    popIndex ++;
                }
                else{ //没有对应的
                    pop.push(pushA[pushIndex]);
                    pushIndex ++;
                }
            }
            else{ // 都已经进过栈了
                if(pop.size() == 0){
                    return true;
                }
                else if(popA[popIndex] != pop.peek()){
                    return false;
                }
                else{
                    pop.pop();
                    popIndex++;
                }
            }
        }
    }
}