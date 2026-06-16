// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int j=0;
//         for(int i=m;i<m+n;i++){
//             nums1[i]=nums2[j++];
//         }
//         Arrays.sort(nums1);
//     }
// }
//has O((n+m)log(n+m))
//need to optimize the solution using 3 pointers  we are using  nums1 la oru pointer adhu m-1 and nums2 la oru pointer n-1 aproo n+m-1 nu onu vekkuro num1 la edhukkuna naga thana namma second array la irukka elements a kondu vandhu add panna porom
class Solution{
    public void merge(int[] nums1,int m,int[] nums2,int n){
        int ptr1=m-1;
        int ptr2=n-1;
        int writer=n+m-1;
        while(ptr1>=0 && ptr2>=0){
            if(nums1[ptr1]<nums2[ptr2]){
                nums1[writer]=nums2[ptr2];
                writer--;
                ptr2--;
            }
            else{
                nums1[writer]=nums1[ptr1];
                writer--;
                ptr1--;
            }
        }
        while(ptr2>=0){
            nums1[writer]=nums2[ptr2];
            ptr2--;
            writer--;
        }
    }
}