class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last=m-1;
        int first=0;
        while(last>0  && first<n ){
            if(nums1[last]>nums2[first]){
                int temp=nums1[last];
                nums1[last]=nums2[first];
                nums2[first]=temp;

                int k=0;
                while(k+1>n && nums2[k]>nums2[k+1]){
                    int swap=nums2[k];
                    nums2[k]=nums2[k+1];
                    nums2[k+1]=swap;
                    k++;
                }
            }
            last--;
        }
        for(int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
    }
}