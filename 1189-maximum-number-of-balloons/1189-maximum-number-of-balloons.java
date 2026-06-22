class Solution {
    public int maxNumberOfBalloons(String text) {
        int count=0;
        int b=0,a=0,l=0,o=0,n=0;
        for(char ch:text.toCharArray()){
            if(ch=='b'){
                b++;
            }
            if(ch=='a'){
                a++;
            }
            if(ch=='l'){
                l++;
            }
            if(ch=='o'){
                o++;
            }
            if(ch=='n'){
                n++;
            }
        if(b>=1 && a>=1 && l>=2 && o>=2 && n>=1){
            count++;
        b--;
        a--;
        l-=2;
        o-=2;
        n--;
        }
        }
        return count;
    }
}