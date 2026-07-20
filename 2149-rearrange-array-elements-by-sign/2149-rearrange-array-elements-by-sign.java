class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans=new int[nums.length];
        int postive=0;
        int negative=1;
        for(int n:nums){
            if(n>0){
                ans[postive]=n;
                postive+=2;
            }
            else {
                ans[negative]=n;
                negative+=2;
            }
        }
        return ans;
    }
}