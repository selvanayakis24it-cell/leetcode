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
    public int maxLevelSum(TreeNode root) {
        if(root==null){
            return 0;
        }
       Queue<TreeNode> q=new LinkedList<>();
       int level=1;
       int maxsum=Integer.MIN_VALUE;
       int current=0;
       q.add(root);
       while(!q.isEmpty()){
        current++;
        int sum=0;
        int size=q.size();
        for(int i=0;i<size;i++){
            TreeNode s=q.poll();
            sum+=s.val;
            if(s.left!=null){
                q.add(s.left);
            }
            if(s.right!=null){
                q.add(s.right);
            }
        }
        if(sum>maxsum){
            maxsum=sum;
            level=current;
        }
       }
       return level;
    }
}