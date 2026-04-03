class Solution {
    public boolean isHappy(int n) {
        Set <Integer> set= new HashSet<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            n= square(n);
        }
        if(n!=1){
            return false;
        }
        return true;
    }
    public int square(int n){
        int sum=0,dig=0,rem=0;
        while(n!=0){
            dig= n%10;
            rem=rem + (dig*dig);
            n=(int)n/10;
        }
        return rem;
    }
}