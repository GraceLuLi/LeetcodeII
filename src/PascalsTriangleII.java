import java.util.ArrayList;

public class PascalsTriangleII {
    public ArrayList<Integer> getRow(int rowIndex) {
    	ArrayList<Integer> cur = new ArrayList<Integer>();
    	if(rowIndex < 0){
    		return cur;
    	}
    	cur.add(1);
    	ArrayList<Integer>pre = cur;
        int level = 0;
    	while(level < rowIndex){
    		cur = new ArrayList<Integer>();
    		cur.add(1);
    		for(int i = 0; i < pre.size()-1; ++i){
    			cur.add(pre.get(i)+pre.get(i+1));
    		}
    		cur.add(1);
    		pre = cur;
    		++level;
    	}
    	return cur;
    }
}
