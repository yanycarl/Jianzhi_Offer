public class Solution {
    public boolean Find(int target, int [][] array) {
        int x=0;
        int y=array[0].length-1;
        while(y>=0 && x<array.length){
            if(array[x][y]==target){
                return true;
            }
            else if(array[x][y]<target){
                x += 1;
            }
            else if(array[x][y]>target){
                y -= 1;
            }
        }
        return false;
    }
}