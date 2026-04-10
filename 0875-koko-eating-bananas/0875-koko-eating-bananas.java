class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>r){
                r=piles[i];
            }
        }
        int mid=0;
        int ans=0;
        while(l<=r){
            mid=l+(r-l)/2;
            if(canEat(piles,h,mid)){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public static boolean canEat(int [] piles,int h,int k){
        int hours=0;
        for(int p:piles)
            {
                hours+=p/k;
                if(p % k !=0){
                    hours++;
                }
                if(hours>h)
                return false;
            }
            return true;
    }
}