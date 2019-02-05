/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root = new TreeNode(pre[0]);
        root = reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }
    
    public TreeNode reConstructBinaryTree(int [] pre, int pre_start, int pre_end, int [] in, int in_start, int in_end) {
        if(pre_start>pre_end || in_start>in_end){
            return null;
        }
        else{
            TreeNode root = new TreeNode(pre[pre_start]);
            for(int i=in_start; i<=in_end;i++){
                if(in[i] == pre[pre_start]){
                    root.left = reConstructBinaryTree(pre,pre_start+1,i-in_start+pre_start,in,in_start,i-1);
                    root.right = reConstructBinaryTree(pre,i-in_start+pre_start+1,pre_end,in,i+1,in_end);
                    break;
                }
            }
            return root;
        }
    }
}