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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        path(root,ans,curr,targetSum);
        return ans;
    }
    public void path(TreeNode root,List<List<Integer>> ans,List<Integer> curr,int target){
        if(root==null){
            return;
        }
        curr.add(root.val);
        if(root.left==null && root.right==null){
            if(target==root.val){
                ans.add(new ArrayList<>(curr));
            }
        }
        path(root.left,ans,curr,target-root.val);
        path(root.right,ans,curr,target-root.val);
        curr.remove(curr.size()-1);
    }
}