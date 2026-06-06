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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        if(root==null){
            return ans;
        }
        while(!q.isEmpty()){
            List<Integer> curr=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode s=q.poll();
            curr.add(s.val);
                if(s.left!=null){
                    q.add(s.left);
                }
                if(s.right!=null){
                    q.add(s.right);
                }
               
            }
        ans.add(curr);
            }    
        return ans;
    }
}