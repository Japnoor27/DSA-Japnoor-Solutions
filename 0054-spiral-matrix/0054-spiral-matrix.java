class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList <Integer> arr=new ArrayList<>();
        int rows=matrix.length;
        int col=matrix[0].length;
        int left=0,right=col-1;
        int top=0,bottom=rows-1;
        while(top<= bottom && left<=right){
            for(int i=left;i<=right;i++){
                arr.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    arr.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    arr.add(matrix[i][left]);
                }
                left++;
            }
        }
        return arr;
    }
}