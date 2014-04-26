
public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        for(int layer = 0; layer < n/2; ++layer){
        	int start = layer;
        	int end = n - 1 - layer;
        	for(int i = start; i < end; ++i){// last node is the first node of the other edge
        		int offset = i - start;
        		// tmp = top
        		int tmp = matrix[start][i];
        		// top = left
        		matrix[start][i] = matrix[end - offset][start];
        		// left = bottom
        		matrix[end - offset][start] = matrix[end][end - offset];
        		// bottom = right
        		matrix[end][end - offset] = matrix[i][end];
        		// right = top(tmp)
        		matrix[i][end] = tmp;
        	}
        }
    }
}
