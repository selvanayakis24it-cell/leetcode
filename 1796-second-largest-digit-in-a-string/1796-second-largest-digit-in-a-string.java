class Solution {
    public int secondHighest(String s) {
        List<Integer> ans=new ArrayList<>();
        char[] m=s.toCharArray();
        for(char ch:m){
            if(Character.isDigit(ch)){
                ans.add(ch-'0');
            }
        }
        int[] arr=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i]=ans.get(i);
        }
        int firstmax=0;
        for(int i=0;i<arr.length;i++){
            if(firstmax<arr[i]){
                firstmax=arr[i];
            }
        }
        int secondmax=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]< firstmax && arr[i]> secondmax){
                secondmax=arr[i];
            }
        }
        return secondmax;
    }
}