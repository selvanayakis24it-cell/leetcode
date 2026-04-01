class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int [] ans=new int[n];
        for(int i=0;i<bookings.length;i++) {
            int l=bookings[i][0]-1;
            int r=bookings[i][1]-1;
            int seats=bookings[i][2];
            ans[l]+=seats;
            if(r+1<n){
                ans[r+1]-=seats;
            }
        }    
        for(int i=1;i<n;i++){
            ans[i]=ans[i]+ans[i-1];
        }
        return ans;
    }
}