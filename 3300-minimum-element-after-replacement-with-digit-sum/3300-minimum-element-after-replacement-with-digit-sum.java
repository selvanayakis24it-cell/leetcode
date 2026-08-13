class Solution {
    public int minElement(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int sum=0;
            if(nums[i]>=9){
            while(nums[i]!=0){
                int dig=nums[i]%10;
                sum+=dig;
                nums[i]=nums[i]/10;
            }
            ans[i]=sum;
            }
            else{
            ans[i]=nums[i];
        }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<ans.length;i++){
            if(min>ans[i]){
                min=ans[i];
            }
        }
        return min;
    }
}