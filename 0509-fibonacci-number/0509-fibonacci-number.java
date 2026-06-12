class Solution {
    public int fib(int n) {
        if(n<2){
            return n;
        }
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return fibb(n,dp);
        
    }
    public int fibb(int n,int[] dp){
        if(n<2){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int res=fibb(n-1,dp)+fibb(n-2,dp);
        dp[n]=res;
        return res;
    }

}