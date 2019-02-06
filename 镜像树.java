
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class Solution {
    public TreeNode reverse(TreeNode root){
        TreeNode right = null;
        TreeNode left = null;

        if(root.left == null && root.right == null){
            return root;
        }
        else{
            if(root.left != null){
                right = reverse(root.left);
            }
            if(root.right != null){
                left = reverse(root.right);
            }
        }
        root.left = left;
        root.right = right;
        return root;
    }
    
    public void Mirror(TreeNode root) {
        if(root != null){
            root = reverse(root);
        }
        return;
    }
}






