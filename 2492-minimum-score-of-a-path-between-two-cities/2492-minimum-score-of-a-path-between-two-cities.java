class Solution {
    class Pair{
        int node;
        int wt;
        Pair(int node,int wt){
            this.node=node;
            this.wt=wt;
        }
    }
    public int minScore(int n, int[][] roads) {
        List<List<Pair>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<roads.length;i++){
            int u=roads[i][0];
            int v=roads[i][1];
            int wt=roads[i][2];
            adj.get(u).add(new Pair(v,wt));
            adj.get(v).add(new Pair(u,wt));
        }
        boolean[] visited=new boolean[n+1];
        return dfs(adj,1,visited);
       
    }
    int dfs(List<List<Pair>> adj,int curr,boolean[] visited){
        int min=Integer.MAX_VALUE;
       if(visited[curr]==true) return min;
       visited[curr]=true;
       for(int i = 0; i < adj.get(curr).size(); i++){
            int wt = adj.get(curr).get(i).wt;
            int next = adj.get(curr).get(i).node;
            min = Math.min(min, wt);
             min = Math.min(min, dfs(adj, next, visited));
     }
    return min;
    }
}