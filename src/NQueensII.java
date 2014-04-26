
public class NQueensII {
	
    public int totalNQueens(int n) {
        int[] cols = new int[n];
        return totalNQueens(n, 0, cols);
    }
    public int totalNQueens(int n, int row, int[] cols) {
    	if(row == n){
    		return 1;
    	}
    	int sum = 0;
    	for(int val = 0; val < n; ++val){
    		cols[row] = val;
    		if(checkValid(row, val, cols)){
    			sum += totalNQueens(n, row+1, cols);
    		}
    	}
    	return sum;
    }
    
    public boolean checkValid(int row, int col, int[] cols) {
    	for(int i = 0; i < row; i++){
    		if(cols[i] == col || Math.abs(row - i) == Math.abs(cols[i] - col)){
    			return false;
    		}
    	}
    	return true;
    }
}
