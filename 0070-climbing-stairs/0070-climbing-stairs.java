class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return fun(n,dp);
    }
    public int fun(int n,int[] dp){
        if(n<=2){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int res=fun(n-1,dp)+fun(n-2,dp);
        dp[n]=res;
        return res;
    }
}//memoization method