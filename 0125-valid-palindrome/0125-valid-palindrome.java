class Solution {
    public boolean isPalindrome(String s) {
        String lower=s.toLowerCase();
        String rev=lower.replaceAll("[^0-9a-z]","");
        String ans=new StringBuilder(rev).reverse().toString();
        return rev.equals(ans);
    }
}