class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
      int[] indegree=new int[numCourses];
      Queue<Integer> q=new LinkedList<>();
      ArrayList<Integer> res=new ArrayList<>();


      List<List<Integer>> adj = new ArrayList<>();
      for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
      // 2. Build the graph and populate the indegrees array
        for (int[] edge : prerequisites) {
            int course = edge[0];
            int prereq = edge[1];
            adj.get(prereq).add(course);
            indegree[course]++;
        }
      for(int i=0;i<numCourses;i++){
      if(indegree[i]==0){
        q.add(i);
      } 
    }
    while(!q.isEmpty()){
        int top=q.poll();
        res.add(top);
        for(int next:adj.get(top)){
            indegree[next]--;
            if(indegree[next]==0){
                q.add(next);
            }
        }
    }
    if (res.size() != numCourses) {
            return new int[0];
        }
        
        int[] order = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            order[i] = res.get(i);
        }
        return order;
    }
}