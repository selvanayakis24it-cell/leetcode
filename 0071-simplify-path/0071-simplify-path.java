class Solution {
    public String simplifyPath(String path) {
        Stack <String> stack= new Stack<>();
        String [] str=path.split("/");
        for(String s : str){
            if(s.equals("") || s.equals(".")){
                continue;
            }
                else if(s.equals("..")){
                    if(!stack.isEmpty()){
                       stack.pop();
                    }
                }
            else {
            stack.push(s);
            }
        }
        
        String res="";
        for(String s:stack){
            res+="/"+s;
        }
        return stack.isEmpty() ? "/" : res;
    }
}