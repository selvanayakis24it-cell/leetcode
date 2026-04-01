class Solution {
    public int maxVowels(String s, int k) {
        char [] a=String.valueOf(s).toCharArray();
        int count=0;
        for(int i=0;i<k;i++){
        if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'){
            count++;
        }}
        int max=count;
        for(int i=k;i<s.length();i++){
            if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'){
            count++;
        }
     if(a[i-k]=='a'||a[i-k]=='e'||a[i-k]=='i'||a[i-k]=='o'||a[i-k]=='u'){
               count--;
                
            }
            max=Math.max(count,max);
        }
        return max;
    }
}