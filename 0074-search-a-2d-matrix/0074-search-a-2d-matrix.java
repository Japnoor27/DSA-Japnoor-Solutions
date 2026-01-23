class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        ArrayList <Integer> arr=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                arr.add(matrix[i][j]);
            }
        }
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==target){
                return true;
            }
        }
        return false;
    }
}