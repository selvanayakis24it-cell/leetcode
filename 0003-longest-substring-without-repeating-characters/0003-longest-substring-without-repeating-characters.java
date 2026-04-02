class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set <Character> a=new HashSet<>();
        int l=0,r=0;
        int max=0;
        for(r=0;r<s.length();r++){
            while(a.contains(s.charAt(r))){
            a.remove(s.charAt(l));
            l++;
        }
        a.add(s.charAt(r));
        max=Math.max(max,r-l+1);
        }
return max;
    }
}