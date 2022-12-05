class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] output=new int[r][c];
        int rows=mat.length;
        int column=mat[0].length;
        int orow=0;
        int ocol=0;
        if(r*c!=rows*column){
            return mat;
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                output[orow][ocol]=mat[i][j];
                ocol++;
                if(ocol==c){
                    ocol=0;
                    orow++;
                }
            }
        }
        
        return output;
    }
}