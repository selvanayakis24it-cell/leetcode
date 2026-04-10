class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int right=0;
        for(int i=0;i<weights.length;i++){
            right+=weights[i];
        }
        int left=0;
        for(int i=0;i<weights.length;i++){
            if(left<weights[i]){
                left=weights[i];
            }
        }
        int mid=0;
        int ans=0;
        while(left<=right){
            mid=left+(right-left)/2;
            if(capacity(weights,days,mid)){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
    public static boolean capacity(int [] weights,int days,int k){
        int count=1;
        int sum=0;
       for(int w:weights){
        if(sum+w > k ){
            count++;
            sum=w;
        }
        else{
            sum+=w;
        }
       }
return count<=days;
    }
}