class Solution {
    public String processStr(String s) {
        StringBuilder res=new StringBuilder();
        char [] m=s.toCharArray();
        for(char ch:m){
            if(ch!='*' && ch!='#' && ch!='%'){
                res.append(ch);
            }
            else if(ch=='%'){
                res.reverse();
            }
            else if(ch=='*'){
                if(res.length()>0){
                    res.deleteCharAt(res.length()-1);
                }
            }
            else if(ch=='#'){
                res.append(res.toString());
            }

        }
        return res.toString();
    }
}