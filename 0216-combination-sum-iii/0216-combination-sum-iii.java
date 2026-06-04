class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        dfs(ans,curr,k,n,1);
        return ans;
    }
    public static void dfs(List<List<Integer>> ans,List<Integer> curr,int k,int n,int index){
        if(curr.size()==k){
            if(n==0){
            ans.add(new ArrayList<>(curr));
        }
        return;
        }
        if(n<0){
            return;
        }
        for(int i=index;i<10;i++){
            curr.add(i);
            dfs(ans,curr,k,n-i,i+1);
            curr.remove(curr.size()-1);
        }
    }
}