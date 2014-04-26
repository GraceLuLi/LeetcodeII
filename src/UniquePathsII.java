
public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = m == 0 ? 0 : obstacleGrid[0].length;
        int[][] records = new int[m][n];
        for(int i = m-1; i >= 0; --i) {
        	if(obstacleGrid[i][n-1] == 1){
                 break;
        	}
        	records[i][n-1] = 1;
        }
        for(int i = n-1; i >= 0; --i) {
        	if(obstacleGrid[m-1][i] == 1){
                break;
       	    } 
       	    records[m-1][i] = 1;
        }
        for(int i = m-2; i >= 0; --i) {
        	for(int j = n-2; j >= 0; --j) {
        		if(obstacleGrid[i][j] == 1){
        			records[i][j] = 0;
        			continue;
        		}
        		records[i][j] += records[i+1][j];
        		records[i][j] += records[i][j+1];
        	}
        }
        return records[0][0];
    }
}
