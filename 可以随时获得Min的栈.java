import java.util.Stack;

public class Solution {
    Stack<Integer> before = new Stack<Integer>();
    Stack<Integer> after = new Stack<Integer>();
    Stack<Integer> temp = new Stack<Integer>();
    int currentMin = Integer.MAX_VALUE;
    
    public void push(int node) {
        if(node < currentMin){
            if(currentMin != Integer.MAX_VALUE){
                before.push(currentMin);
            }
            while(!after.isEmpty()){
                temp.push(after.pop());
            }
            while(!temp.isEmpty()){
                before.push(temp.pop());
            }
            currentMin = node;
        }
        else if(node >= currentMin){
            after.push(node);
        }
    }
    
    public void pop() {
        if(!after.isEmpty()){
            after.pop();
        }
        else{
            if(before.isEmpty()){
                currentMin = Integer.MAX_VALUE;
            }
            else{
                int size = before.size();
                int position = 0;
                int i=0;
                currentMin = Integer.MAX_VALUE;
                while(!before.isEmpty()){
                    i++;
                    int tempNode=before.pop();
                    if( tempNode < currentMin){
                        currentMin = tempNode;
                        position = i;
                    }
                    temp.push(tempNode);
                }
                for(int j=0; j<size-position; j++){
                    before.push(temp.pop());
                }
                int currentMin = temp.pop();
                while(!temp.isEmpty()){
                    after.push(temp.pop());
                }
            }
        }
    }
    
    public int top() {
        if(!after.isEmpty()){
            return after.peek();
        }
        else return currentMin;
    }
    
    public int min() {
        return currentMin;
    }
}