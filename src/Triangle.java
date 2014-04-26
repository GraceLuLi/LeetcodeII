import java.util.ArrayList;

public class Triangle {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
    	int m = triangle.size();
    	int n = triangle.get(m-1).size();
    	int[] records = new int[n];
        for(int i = m-1; i >= 0; --i) {   	
        	for(int j = 0; j < triangle.get(i).size(); ++j) {
        		if(i == m-1) {
        			records[j] = triangle.get(i).get(j);
        			continue;
        		}
        		records[j] = triangle.get(i).get(j) + Math.min(records[j], records[j+1]);
        	}
        }
        return records[0];
    }
}
