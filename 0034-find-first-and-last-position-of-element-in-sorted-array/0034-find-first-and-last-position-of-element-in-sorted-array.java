

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findBound(nums, target, true);
        int last = findBound(nums, target, false);
        return new int[]{first, last};
    }

    private int findBound(int[] nums, int target, boolean isFirst) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;// this condition is used when overflows 
            
            if (nums[mid] == target) {
                ans = mid;
                if (isFirst) {
                    right = mid - 1;
                } else {
                    left = mid + 1;  // Look right for last appearance
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}