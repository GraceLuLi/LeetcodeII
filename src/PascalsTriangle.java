import java.util.ArrayList;

public class PascalsTriangle {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    	if(numRows <= 0){
    		return result;
    	}
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	result.add(list);
    	int level = 1;
    	ArrayList<Integer> pre;
    	ArrayList<Integer> cur;
    	while(level < numRows){
    		pre = result.get(result.size()-1);
    		cur = new ArrayList<Integer>();
    		cur.add(1);
    		for(int i = 0; i < pre.size()-1; ++i){
    			cur.add(pre.get(i)+pre.get(i+1));
    		}
    		cur.add(1);
    		result.add(new ArrayList<Integer>(cur));
    		level++;
    	}
    	return result;
    }
}
