class Solution {
    public int minOperations(int[] nums, int x) {
        int tot=0;
        int n=nums.length;
        int k=0;
        for(int i=0;i<n;i++){
            tot+=nums[i];
        }
        k=tot-x;
        if(k==0) return n;
        if(k<0) return -1;
        int max=-1;
        int sum=0;
        int l=0,r=0;
        for(r=0;r<n;r++){
            sum+=nums[r];
        while(sum>k){
            sum-=nums[l++];
        }
        if(sum==k){
            max=Math.max(r-l+1,max);
        }
        }
        return max==-1 ? -1 : n-max;
    }
}