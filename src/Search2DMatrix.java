
public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
    	int m = matrix.length;
    	int n = (m == 0? 0: matrix[0].length);
        int i = 0;
        int j = n-1;
        while(i < m && j >= 0){
        	if(matrix[i][j] == target){
        		return true;
        	}
        	if(matrix[i][j] < target){
        		++i;
        	}
        	else{
        		--j;
        	}
        }
        return false;
    }
}
