class Solution {
    public long minimumRemoval(int[] beans) {
        Arrays.sort(beans);
        int n=beans.length;
        long sum=0;
       for(int i:beans){
        sum+=i;
       }
        long ans=Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            long a=(long)beans[i]*(n-i);
            long b=sum-a;
            ans=Math.min(ans,b);
        }
        return ans;
    }
}