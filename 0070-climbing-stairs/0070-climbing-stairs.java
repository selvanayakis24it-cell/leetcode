class Solution {
    public int climbStairs(int n) {
        if(n<1){
            return n;
        }
        int count=0;
        int prev1=1;
        int prev2=0;
        for(int i=0;i<n;i++){
            int curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
            count++;
        }
        return prev1;
    }
}