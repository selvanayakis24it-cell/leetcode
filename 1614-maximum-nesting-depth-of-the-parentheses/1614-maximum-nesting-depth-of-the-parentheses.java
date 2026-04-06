class Solution {
    public int maxDepth(String s) {
        int count=0;
         int maxc=0;
        for(char ch : s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){
                count++;
                maxc=Math.max(maxc,count);
            }
            else if(ch==')' || ch==']' || ch=='}'){
                count--;
            }
        }
        return maxc;
    }
}