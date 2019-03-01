import java.util.ArrayList;

public class Solution {
    
    private boolean checkSubsequence(int [] sequence, int left, int right){
        int i = right-1;
        int mid = -1;
        boolean result = false;
        if(sequence.length == 0){
            return false;
        }
        if(right - left < 3){
            return true;
        }
        while(i>=left && sequence[i] > sequence[right]){
            i--;
        }
        if(i == left-1){
            return true;
        }
        else{
            mid = i;
            while(i>=left){
                if(sequence[i] > sequence[right]){
                    return false;
                }
                i--;
            }
            result = checkSubsequence(sequence,left,mid)&&checkSubsequence(sequence,mid+1,right-1);
        }
        return result;
    }
    
    public boolean VerifySquenceOfBST(int [] sequence) {
        return checkSubsequence(sequence, 0, sequence.length-1);
    }
}
