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
 class Pair{
    TreeNode node;
    int index;
 Pair(TreeNode node,int index){
    this.node=node;
    this.index=index;
 }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
       Queue<Pair> q=new LinkedList<>();
       q.add(new Pair(root,0));
       int maxwidth=0;
       while(!q.isEmpty()){
        int size=q.size();
        int first=q.peek().index;
        int last=first;
        for(int i=0;i<size;i++){
       Pair p=q.poll();
       TreeNode node=p.node;
       int indx=p.index;
       if(i==0){
        first=indx;
       }
       if(i==size-1){
        last=indx;
       }
       if(node.left!=null){
        q.add(new Pair(node.left,2*indx+1));
       }
       if(node.right!=null){
        q.add(new Pair(node.right,2*indx+2));
       }
        }
maxwidth=Math.max(maxwidth,(last-first)+1);
    }
     return maxwidth;
}
}