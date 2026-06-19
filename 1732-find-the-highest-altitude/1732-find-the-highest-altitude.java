class Solution {
    public int largestAltitude(int[] gain) {
        int []presum=new int[gain.length+1];
        presum[0]=0;
        for(int i=1;i<=gain.length;i++){
            presum[i]=presum[i-1]+gain[i-1];
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<presum.length;i++){
            if(max<presum[i]){
                max=presum[i];
            }
        }
        return max;

    }
}