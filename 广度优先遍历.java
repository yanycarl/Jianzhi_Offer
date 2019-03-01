import java.util.ArrayList;
import java.util.LinkedList;
/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        TreeNode temp = null;
        if(root == null){
            return result;
        }
        else{
            result.add(root.val);
            if(root.left != null){
                queue.addLast(root.left);
            }
            if(root.right != null){
                queue.addLast(root.right);
            }
            while(queue.size()>0){
                temp = queue.getFirst();
                result.add(temp.val);
                queue.removeFirst();
                if(temp.left != null){
                    queue.addLast(temp.left);
                }
                if(temp.right != null){
                    queue.addLast(temp.right);
                }
            }
        }
        return result;
    }
}