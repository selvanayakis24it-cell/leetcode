class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder();
        int partlen=part.length();
        for(char ch:s.toCharArray()){
            sb.append(ch);
            if(sb.length()>=partlen){
                if(sb.substring(sb.length()-partlen).equals(part)){
                    sb.delete((sb.length()-partlen),sb.length());
                }
            }
        }
        return sb.toString();
    }
}