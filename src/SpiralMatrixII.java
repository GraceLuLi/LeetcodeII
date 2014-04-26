
public class SpiralMatrixII {
	/*
    public int[][] generateMatrix(int n) {
    	int[][] res = new int[n][n];
    	int val = 1;
        for(int layer = 0; layer < n/2; ++layer){
        	int start = layer;
        	int end = n - 1 - layer;
        	// fill top
        	for(int i = start; i < end; ++i){
        		res[start][i] = val;
        		++val;
        	}
        	// fill right
        	for(int i = start; i < end; ++i){
        		res[i][end] = val;
        		++val;
        	}
        	// fill bottom
        	for(int i = start; i < end; ++i){
        		int offset = i - start;
        		res[end][end - offset] = val;
        		++val;
        	}
        	// fill left
        	for(int i = start; i < end; ++i){
        		int offset = i - start;
        		res[end - offset][start] = val;
        		++val;
        	}
        }
        if(n % 2 == 1){
        	res[n/2][n/2] = val;
        }
        return res;
    }*/
	
    // unify above
    public static int[][] generateMatrix(int n) {
    	int[][] res = new int[n][n];
    	int val = 1;
    	int gap;
        for(int layer = 0; layer < n/2; ++layer){
        	int start = layer;
        	int end = n - 1 - layer;
        	gap = n - 1 - layer*2;
        	// fill top
        	for(int i = start; i < end; ++i){
        		int offset = i - start;
        		res[start][i] = val;
        		res[i][end] = val + gap;
        		res[end][end - offset] = val + gap*2;
        		res[end - offset][start] = val + gap*3;
        		++val;
        	}
        	val = val + 3*gap;
        }
        if(n % 2 == 1){
        	res[n/2][n/2] = val;
        }
        return res;
    }
    public static void main(String[] args){
    	int[][] res = generateMatrix(3);
    }
}
