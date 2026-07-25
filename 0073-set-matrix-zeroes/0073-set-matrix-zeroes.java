class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        boolean firstrow=false;
        boolean firstcol=false;
            for(int j=0;j<col;j++){
                if(matrix[0][j]==0){
                    firstrow=true;
                    break;
             }
        }
        for(int i=0;i<row;i++){
            if(matrix[i][0]==0){
                firstcol=true;
                break;
            }
        }

        for(int i=1;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }

        if(firstcol){
            for(int i=0;i<row;i++){
                matrix[i][0]=0;
            }
        }

        if(firstrow){
            for(int j=0;j<col;j++){
                matrix[0][j]=0;
            }
        }
    }
}