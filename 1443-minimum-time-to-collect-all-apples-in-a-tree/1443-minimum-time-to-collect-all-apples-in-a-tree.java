class Solution {
    int dfs(int curr,int parent,List<List<Integer>> adj,List<Boolean> hasApple){
        int sum =0;
        for(int neigh:adj.get(curr)){
            if(neigh==parent){
                continue;
            }
            sum+=dfs(neigh,curr,adj,hasApple);
        }
        if(sum > 0 || hasApple.get(curr)==true){
            if(parent!=-1){
                sum+=2;
            }
        }
        return sum;
    }
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
           int u=edges[i][0];
           int v=edges[i][1];
           adj.get(u).add(v);
           adj.get(v).add(u);
        }
        int parent=-1;
        int curr=0;
        return dfs(curr,parent,adj,hasApple);
    }
}