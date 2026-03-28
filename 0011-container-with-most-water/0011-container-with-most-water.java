class Solution { 
    public int maxArea(int[] height) {
       int maxA=0;
       int left=0;
       int right=height.length-1;
       while(left<right){
        maxA=Math.max(maxA,(right-left)*Math.min(height[left],height[right]));
        if(height[left]<height[right]){
            left++;
        }
        else{
            right--;
        }
       }    
       return maxA;
    }
}
  