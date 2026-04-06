class Solution {
    public int maxDepth(String s) {
    Stack <Character> stack=new Stack<>();
         int maxc=0;
        for(char ch : s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
                maxc=Math.max(maxc,stack.size());
            }
            else if(ch==')' || ch==']' || ch=='}'){
                stack.pop();
            }
        }
        return maxc;
    }
}