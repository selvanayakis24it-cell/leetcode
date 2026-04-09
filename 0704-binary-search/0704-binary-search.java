class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        int mid=0,ans=0;
       while(l<=r){
        mid=(l+r)/2;
        if(nums[mid]<target){
            l=mid+1;
        }
        else if(nums[mid]>target){
            r=mid-1;
        }
        else if(nums[mid]==target){
            return mid;
        }
       }
       return -1;
    }
}