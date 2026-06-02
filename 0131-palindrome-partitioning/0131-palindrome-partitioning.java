class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> curr=new ArrayList<>();
        backtrack(ans,curr,s,0);
        return ans;
    }
    public static void backtrack(List<List<String>> ans,List<String> curr,String s,int start){
        if(start==s.length()){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int end=start;end<s.length();end++){
            if(isPalindrome(s,start,end)){
                curr.add(s.substring(start,end+1));
                backtrack(ans,curr,s,end+1);
                curr.remove(curr.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}