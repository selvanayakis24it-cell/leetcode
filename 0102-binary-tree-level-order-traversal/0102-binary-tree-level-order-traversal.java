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
        List<List<Integer>> ans =new ArrayList<>();
        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        if(root==null){
            return ans;
        }
        while(!que.isEmpty()){
            int size=que.size();
            List<Integer> curr=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode s=que.poll();
                curr.add(s.val);
                if(s.left!=null){
                    que.add(s.left);
                }
                if(s.right!=null){
                    que.add(s.right);
                }
            }
            ans.add(curr);
        }
        return ans;
    }
}