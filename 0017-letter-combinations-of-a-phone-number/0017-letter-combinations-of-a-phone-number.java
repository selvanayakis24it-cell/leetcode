class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits.length()==0){
            return ans;
        }
        backtrack("",digits,ans,0);
        return ans;
    }
    public static void backtrack(String curr,String digits,List<String> ans,int index){
        String[] map={"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if(index==digits.length()){
            ans.add(curr);
            return;
        }
        String letters=map[digits.charAt(index)-'2'];
        for(char ch:letters.toCharArray()){
            String next=curr+ch;
            backtrack(next,digits,ans,index+1);

        }
    }
}