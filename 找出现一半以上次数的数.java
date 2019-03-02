import java.util.Random;

public class Solution {
    
    private boolean checkValid(int[] array, int a){
        int counter = 0;
        for(int item:array){
            if(item == a){
                counter++;
            }
        }
        if(counter > array.length/2){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array != null && array.length != 0){
            int current = array[0];
            int time = 1;
            for(int i=1; i<array.length;i++){
                if(time == 0){
                    current = array[i];
                    time = 1;
                }
                else if(current == array[i]){
                    time++;
                }
                else{
                    time--;
                }
            }
            if(checkValid(array, current)){
                return current;
            }
            else{
                return 0;
            }
        }
        else{
            return 0;
        }
    }
}


