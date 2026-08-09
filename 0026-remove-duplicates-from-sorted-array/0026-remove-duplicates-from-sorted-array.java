class Solution {
    public int removeDuplicates(int[] nums) {
        int noduplicate=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[noduplicate]=nums[i];
                noduplicate++;
            }
        }
        return noduplicate;
    }
}