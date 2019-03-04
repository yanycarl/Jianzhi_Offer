public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array == null || array.length == 0){
            return 0;
        }
        
        int left = 0;
        int right = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        boolean direction = false;
        
        for(left = 0; left < array.length; left++){
            if(direction == false){
                sum = 0;
                for(right = left; right < array.length; right++){
                    sum += array[right];
                    if(sum > max){
                        max = sum;
                    }
                }
                direction = true;
            }
            else if(direction == true){
                sum -= array[left-1];
                if(sum > max){
                    max = sum;
                }
                for(right = array.length-1 ;right > left; right--){
                    sum -= array[right];
                    if(sum > max){
                        max = sum;
                    }
                }
                direction = false;
            }
        }
        return max;
    }
}
