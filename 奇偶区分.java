import java.util.LinkedList;
import java.util.List;
public class Solution {
    public void reOrderArray(int [] array) {
        List<Integer>list1=new LinkedList<Integer>();
        List<Integer>list2=new LinkedList<Integer>();
        for(int i=0;i<array.length;i++){
            if(array[i]%2==1){
                list1.add(array[i]);
            }
            else {
                list2.add(array[i]);
            }
        }
        list1.addAll(list2);
        for(int i=0;i<array.length;i++){
            array[i]=list1.get(i);
        }
    }
}