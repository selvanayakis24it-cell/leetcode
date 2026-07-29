class Solution {
    public int[] sumZero(int n) {
        int index=0;
        int[] ans=new int[n];
        for(int i=1;i<=n/2;i++){
            ans[index++]=i;
            ans[index++]=i*(-1);
        }
        if(n%2==1){
            ans[index]=0;
        }
        return ans;
    }
}