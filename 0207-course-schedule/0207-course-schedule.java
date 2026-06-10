class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n=prerequisites.length;
    List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        
        // 2. Build the graph and calculate indegrees using numCourses size
        int[] indegree = new int[numCourses];
        for (int[] edge : prerequisites) {
            int course = edge[0];
            int prerequisite = edge[1];
            adj.get(prerequisite).add(course);
            indegree[course]++;
        }
     Queue<Integer> q=new LinkedList<>();
     for(int i=0;i<numCourses;i++){
        if(indegree[i]==0){
            q.add(i);
        }
     }
     List<Integer> ans = new ArrayList<>();
     while(!q.isEmpty()){
        int top=q.poll();
        ans.add(top);
        for(int next: adj.get(top)){
            indegree[next]--;
            if(indegree[next]==0){
                q.add(next);
            }
        }
     }
     return ans.size()==numCourses;
    }
}