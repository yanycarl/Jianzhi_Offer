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
            if(pushIndex < pushA.length){ //��û��ȫ����ջ
                if(popA[popIndex] == pop.peek()){ //�ж�Ӧ��
                    pop.pop();
                    popIndex ++;
                }
                else{ //û�ж�Ӧ��
                    pop.push(pushA[pushIndex]);
                    pushIndex ++;
                }
            }
            else{ // ���Ѿ�����ջ��
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