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
    
    public void subConvert(TreeNode pRootOfTree){

        if(pRootOfTree.left != null || pRootOfTree.right != null){
        
            TreeNode tempLeft = null;
            TreeNode tempRight = null;

            if(pRootOfTree.left != null){
                tempLeft = pRootOfTree.left;
                while(tempLeft.right != null){
                    tempLeft = tempLeft.right;
                }
            }

            if(pRootOfTree.right != null){
                tempRight = pRootOfTree.right;
                while(tempRight.left != null){
                    tempRight = tempRight.left;
                }
            }

            if(tempLeft != null){
                pRootOfTree.left = tempLeft;
                tempLeft.right = pRootOfTree;
            }

            if(tempRight != null){
                pRootOfTree.right = tempRight;
                tempRight.left = pRootOfTree;
            }

            if(pRootOfTree.left != null){
                subConvert(pRootOfTree.left);
            }

            if(pRootOfTree.right != null){
                subConvert(pRootOfTree.right);
            }
        }
        return;
    }
    
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree != null){
            subConvert(pRootOfTree);
        }
        return pRootOfTree;
    }
}












