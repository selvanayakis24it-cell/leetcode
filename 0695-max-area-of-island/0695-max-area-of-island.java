class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxa=0;
        if(grid==null || grid.length==0 ){
            return 0;
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    maxa=Math.max(maxa,dfs(grid,i,j));
                }
            }
        }
        return maxa;
    }
    public int dfs(int[][] grid,int row,int col){
if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]==0){
    return 0;
}
grid[row][col]=0;
int area=1;
area+=dfs(grid,row-1,col);
area+=dfs(grid,row+1,col);
area+=dfs(grid,row,col+1);
area+=dfs(grid,row,col-1);
return area;
    }

}