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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> que=new LinkedList<>();
        boolean leftToright=true;
        que.add(root);
        if(root==null){
            return ans;
        }
        while(!que.isEmpty()){
            int size=que.size();
            List<Integer> curr=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode s=que.poll();
                if(!leftToright){
                    curr.addFirst(s.val);
                }
                else{
                    curr.addLast(s.val);
                }
                if(s.left!=null){
                    que.add(s.left);
                }
                if(s.right!=null){
                    que.add(s.right);
                }
            }
            ans.add(curr);
            leftToright=!leftToright;
        }
        return ans;
    }
}