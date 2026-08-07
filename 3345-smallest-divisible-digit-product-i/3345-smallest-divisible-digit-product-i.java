class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
        if(fun(n)%t==0) return n;
        n++;
        }
    }
    public int fun(int n){
        int pro=1;
        while(n!=0){
            pro*=(n%10);
            n=n/10;
        }
        return pro;
    }
}