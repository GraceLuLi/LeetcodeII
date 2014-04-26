
public class UniquePaths {
    public int uniquePaths(int m, int n) {
    	if(m == 0 && n == 0) {
    		return 0;
    	}
    	if(m == 0 || n == 0) {
    		return 1;
    	}
        int[][] records = new int[m][n];
        for(int i = 0; i < m; ++i) {
        	records[i][0] = 1;
        }
        for(int i = 0; i < n; ++i) {
        	records[0][i] = 1;
        }
        for(int i = 1; i < m; ++i) {
        	for(int j = 1; j < n; ++j) {
        		records[i][j] = records[i-1][j] + records[i][j-1];
        	}
        }
        return records[m-1][n-1];
    }
}
