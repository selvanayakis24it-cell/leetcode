class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int[] freq=new int[101];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
            if(min>nums[i]){
                min=nums[i];
            }
            if(max<nums[i]){
                max=nums[i];
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(freq[i]==0){
                ans.add(i);
            }
        }
        return ans;
    }
}