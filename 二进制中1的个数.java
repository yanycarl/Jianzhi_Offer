public class Solution {
    public int NumberOf1(int n) {
        if(n == 0) return 0;
        if(n > 0){
            int count = 0;
            int exp = (int)(Math.log((double)n)/Math.log(2.0)+1);
            if(exp == 1){
                return n;
            }
            else{
                for(int i=exp; i>0; i--){
                    if(n<Math.pow(2,i+1) && n>=Math.pow(2,i)){
                        n -= Math.pow(2,i);
                        count+=1;
                    }
                }
                return count+n;
            }
        }
        else{
            return NumberOf1((int)((double)n+2147483648.0))+1;
        }
    }
}