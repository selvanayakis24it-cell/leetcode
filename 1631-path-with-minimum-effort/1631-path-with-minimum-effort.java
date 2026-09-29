class Solution {
    class Node{
        int i,j,cost;
        Node(int i,int j,int cost){
            this.i=i;
            this.j=j;
            this.cost=cost;
        }
    }
    public int minimumEffortPath(int[][] heights) {
     int rows=heights.length;
     int cols=heights[0].length;
     //distance array of dijikstra
     int[][] efforts=new int[rows][cols];
     for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            efforts[i][j]=Integer.MAX_VALUE;
        }
     }
     PriorityQueue<Node> pq=new PriorityQueue<>((a,b)->Integer.compare(a.cost,b.cost));
     efforts[0][0]=0;
     pq.offer(new Node(0,0,0));
     while(pq.isEmpty()!=true){
        int i=pq.peek().i;
        int j=pq.peek().j;
        int max_so_far=pq.peek().cost;
        pq.poll();
        if(max_so_far > efforts[i][j])continue;
//up
        if(i-1>=0){
            int path_max=Math.max(max_so_far,Math.abs(heights[i][j]-heights[i-1][j]));
            if(path_max<efforts[i-1][j]){
                efforts[i-1][j]=path_max;
                pq.offer(new Node(i-1,j,path_max));
            }
        }
        //down
        if(i+1 < rows){
            int path_max = Math.max(max_so_far,Math.abs(heights[i][j]-heights[i+1][j]));
            if(path_max<efforts[i+1][j]){
                efforts[i+1][j]=path_max;
                pq.offer(new Node(i+1,j,path_max));
            }
     }
    //left
    if(j-1>=0){
            int path_max=Math.max(max_so_far,Math.abs(heights[i][j]-heights[i][j-1]));
            if(path_max<efforts[i][j-1]){
                efforts[i][j-1]=path_max;
                pq.offer(new Node(i,j-1,path_max));
            }
}
//right
if(j+1<cols){
            int path_max=Math.max(max_so_far,Math.abs(heights[i][j]-heights[i][j+1]));
            if(path_max<efforts[i][j+1]){
                efforts[i][j+1]=path_max;
                pq.offer(new Node(i,j+1,path_max));
            }
}
    }return efforts[rows - 1][cols - 1];
    }
}