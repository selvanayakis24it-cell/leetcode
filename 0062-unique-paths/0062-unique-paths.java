// class Solution {
//     public int uniquePaths(int m, int n) {
//         int dr=n-1;
//         int dc=m-1;
//        return fun(0,0,dr,dc,"");
//     }
//     public static int fun(int row,int col,int dr,int dc,String path){
//         if(row >dr || col> dc){
//             return 0;
//         }
//         if(row==dr && col==dc){
//             System.out.print(path);
//             return 1;
//         }
//         int h=fun(row,col+1,dr,dc,path+"h");
//        int v =fun(row+1,col,dr,dc,path+"v");
//        return v+h;

//     }
// }
//recurion method
class Solution{
     public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            dp[i][0]=1;
        }
        for(int j=0;j<n;j++){
            dp[0][j]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
     }
}
