/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode x = null;
    public void flatten(TreeNode root) {
        if(root==null)
        return;
        flatten(root.right);
        flatten(root.left);
        root.right=x;
        root.left = null;
        x=root;
    }
    // public TreeNode inorder(TreeNode root){
    //     if(root==null)
    //     return null;
    //     TreeNode n=new TreeNode(root.val);
    //     n.left=null;
    //     TreeNode left=inorder(root.left);
    //     TreeNode right=inorder(root.right);
    //     return n;
    // }
}