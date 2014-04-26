
public class UniqueBST {
    public int numTrees(int n) {
    	if(n <= 0){
    		return 0;
    	}
    	int[] record = new int[n+1];
    	record[1] = 1;
    	for(int i = 2; i <= n; ++i){
    		int num = 0;
    		num += 2 * record[i-1];
    		for(int j = 2; j <= i-1; ++j){
    			num += record[j-1] * record[i-j];
    		}
    		record[i] = num;
    	}
        return record[n];
    }
}
