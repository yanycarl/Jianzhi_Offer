import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
       int left = 0;
       int right = matrix[0].length-1;
       int top = 0;
       int bottom = matrix.length-1;
       int amount = matrix.length * matrix[0].length; 
       ArrayList <Integer> array = new ArrayList<>();
       int current = 0;
       while(current < amount){
           for(int i=left; i<=right && current < amount; i++){
               array.add(matrix[top][i]);
               current += 1;
           }
           top += 1;
        
           for(int j=top; j<=bottom && current < amount; j++){
               array.add(matrix[j][right]);
               current += 1;
           }
           right -= 1;
        
           for(int i=right; i>=left && current < amount; i--){
               array.add(matrix[bottom][i]);
               current += 1;
           }
           bottom -= 1;
        
           for(int j=bottom; j>=top && current < amount; j--){
               array.add(matrix[j][left]);
               current += 1;
           }
           left += 1;
       }
       return array;
    }
}