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
    public List<Integer> preorderTraversal(TreeNode root) {
     Stack<TreeNode> st=new Stack<>();
     List<Integer> ans=new ArrayList<>();
     if(root==null){
        return ans;
     }   
     st.push(root);
     while(!st.isEmpty()){
    TreeNode s=st.pop();
    ans.add(s.val);
    if(s.right!=null){
        st.push(s.right);
    }
if(s.left!=null){
        st.push(s.left);
    }
     }
     return ans;
    }
}