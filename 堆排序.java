import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        if(input == null || input.length == 0){
            return result;
        }
        
        if(k > input.length){
            return result;
        }
        
        for (int i = (int)Math.pow(2, (int)Math.floor(Math.log(input.length)))-2; i>=0; i--){
            int a = Integer.MAX_VALUE;
            int b = Integer.MAX_VALUE;
            if(2*i+1 <= input.length-1){
                a = input[2*i+1];
            }
            if(2*i+2 <= input.length-1){
                b = input[2*i+2];
            }
            if(input[i] > a || input[i]>b) {
                if(a < b){
                    int temp = input[i];
                    input[i] = input[2*i+1];
                    input[2*i+1] = temp;
                }
                else if(b < a){
                    int temp = input[i];
                    input[i] = input[2*i+2];
                    input[2*i+2] = temp;
                }
            }
        }
        
        for(int j=0; j<k; j++){
            for(int i=0; i< (int)Math.pow(2, (int)Math.floor(Math.log(input.length-j)))-1; i++){
                if(2*i+2 > input.length-1-j){
                    if(2*i+1 > input.length-1-j){
                        continue;
                    }
                    else{
                        if(input[2*i+1] < input[i]){
                            int temp = input[2*i+1];
                            input[2*i+1] = input[i];
                            input[i] = temp;
                        }
                    }
                }
                else{
                    if(input[i] > input[2*i+1] || input[i] > input[2*i+2]){
                        if(input[2*i+1] < input[2*i+2]){
                            int temp = input[2*i+1];
                            input[2*i+1] = input[i];
                            input[i] = temp;
                        }
                        else{
                            int temp = input[2*i+2];
                            input[2*i+2] = input[i];
                            input[i] = temp;
                        }
                    }
                }
            }
            result.add(input[0]);
            input[0] = input[input.length-1-j];
        }
        return result;
    }
}