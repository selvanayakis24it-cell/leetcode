class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> ans=new ArrayList<>();
        int row=grid.length;
        int col=grid[0].length;
        for(int r=0;r<row;r++){
            if(r%2==0){
                for(int c=0;c<col;c++){
                    if((r+c)%2==0){
                    ans.add(grid[r][c]);
                }
                }
            }
            else{
                for(int c=col-1;c>=0;c--){
                    if((r+c)%2==0){
                        ans.add(grid[r][c]);
                    }
                }
            }
        }
        return ans;
    }
}