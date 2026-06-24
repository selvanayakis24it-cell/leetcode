class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea=0;
        Stack<Integer> st=new Stack<>();
        int n=heights.length;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[i]<heights[st.peek()]){
                int height=heights[st.pop()];
                int nse=i;
                int pse=st.isEmpty()? -1 : st.peek();
                int width=nse-pse-1;
                maxArea=Math.max(maxArea,width*height);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int height=heights[st.pop()];
            int nse=n;
            int pse=st.isEmpty() ?-1:st.peek();
            int width=nse-pse-1;
            maxArea=Math.max(maxArea,width*height);
        }
        return maxArea;
    }
}