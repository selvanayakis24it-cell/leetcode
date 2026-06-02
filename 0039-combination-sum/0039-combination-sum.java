class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        backtrack(ans,curr,candidates,target,0);
        return ans;
    }
    public static void backtrack(List<List<Integer>> ans,List<Integer> curr,int[] candidates,int target,int start){
if(target==0){
    ans.add(new ArrayList<>(curr));
    return;
}
if(target<0){
    return;
}
        for(int i=start;i<candidates.length;i++){

            curr.add(candidates[i]);
            backtrack(ans,curr,candidates,target-candidates[i],i);
            curr.remove(curr.size()-1);
        }
    }
}