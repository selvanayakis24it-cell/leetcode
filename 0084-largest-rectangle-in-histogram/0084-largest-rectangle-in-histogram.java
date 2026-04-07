class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack <Integer> st=new Stack<>();
        int n=heights.length;
        int maxi=0;
        for(int i=0;i<=n;i++){
            int current=(i==n) ? 0 : heights[i];
            while(!st.isEmpty() && heights[st.peek()]>current){
                int height=heights[st.pop()];
            
            int width;
            if(st.isEmpty()){
                width=i;
            }
            else{
                width=i-st.peek()-1;
            }
maxi=Math.max(maxi,height*width);
        }
        st.push(i);
    }
        return maxi;
    }
}