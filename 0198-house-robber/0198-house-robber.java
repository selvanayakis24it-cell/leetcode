//optimization method
// class Solution {
//     public int rob(int[] nums) {
//         int prev1=0;
//         int prev2=0;
//         for(int num:nums){
//             int curr=Math.max(prev1,prev2+num);
//             prev2=prev1;
//             prev1=curr;
//         }
//         return prev1;
//     }
// }
//recursion method 
// class Solution{
//     public int rob(int[] nums){
//     return fun(0,nums);
//     }
//     public int fun(int pos,int[] nums){
//         if(pos>=nums.length){
//             return 0;
//         }
//         int rob=nums[pos]+fun(pos+2,nums);
//         int notrob=0+fun(pos+1,nums);
//         return Math.max(rob,notrob);
//     }
// }
class Solution{
    public int rob(int[] nums){
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return fun(nums,dp,nums.length-1);
    }
    public int fun(int[] nums,int[] dp,int n){
if(n<0){
    return 0;
}
if(dp[n]!=-1){
    return dp[n];
}
int rob=nums[n]+fun(nums,dp,n-2);
int notrob=0+fun(nums,dp,n-1);
return dp[n]=Math.max(rob,notrob);
    }
}