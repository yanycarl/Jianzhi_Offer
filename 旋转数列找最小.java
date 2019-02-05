import java.util.ArrayList;
public class Solution {
    public int findSmallest(int [] array, int start, int end){
        if(end-start<2)
        {
            if(array.length==0){
                return 0;
            }
            else if(array[start] == array[end]){
                return array[start];
            }
            else if(array[start] > array[end]){
                return array[end];
            }
            else{
                return array[start];
            }
        }
        else{
            int mid = (end+start)/2;
            int returnVal=0;
            if(array[end]>array[mid]){
                returnVal = findSmallest(array,start,mid);
            }
            else {
                returnVal = findSmallest(array,mid,end);
            }
            return returnVal;
        }
    }
    
    public int minNumberInRotateArray(int [] array) {
        return findSmallest(array, 0, array.length-1);
    }
}