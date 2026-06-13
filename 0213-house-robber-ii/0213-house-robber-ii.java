//recursion method
// class Solution {
//     public int rob(int[] nums) {
//         if(nums.length==1){
//             return nums[0];
//         }
//         return Math.max(fun(nums,0,nums.length-2),fun(nums,1,nums.length-1));
//     }
//     public int fun(int[] nums,int start,int end){
//         if(start>end){
//             return 0;
//         }
//         int rob=nums[start]+fun(nums,start+2,end);
//         int notrob=fun(nums,start+1,end);
//         return Math.max(rob,notrob);
//     }
// }
class Solution {
     public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
       return Math.max(fun(nums,0,n-2),fun(nums,1,n-1));
}
public int fun(int[] nums,int start,int end){
    if(start>end){
        return 0;
    }
    int prev1=0;
    int prev2=0;
    for(int i=start;i<=end;i++){
        int curr=Math.max(prev1,prev2+nums[i]);
        prev2=prev1;
        prev1=curr;
    }
    return prev1;
}
}