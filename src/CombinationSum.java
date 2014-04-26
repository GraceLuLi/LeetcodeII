import java.util.ArrayList;
import java.util.HashSet;

public class CombinationSum {
    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
    	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    	ArrayList<Integer> tmpList = new ArrayList<Integer>();
    	getCombinations(candidates, target, tmpList, res);
    	return res;
    }
    public void getCombinations(int[] candidates, int target, ArrayList<Integer> tmpList, ArrayList<ArrayList<Integer>> res) {
    	
    	for(int i = 0; i < candidates.length; ++i) {
    		int cur = candidates[i];
    		if(!tmpList.isEmpty() && tmpList.get(tmpList.size()-1) > cur) {
    			continue;
    		}
    		tmpList.add(cur);
    		if(cur == target) {
    			res.add(new ArrayList<Integer> (tmpList));
    		}
    		else if(cur < target) { 
    			getCombinations(candidates, target-cur, tmpList, res);
    		}
    		// if(cur > target) do nothing
    		tmpList.remove(tmpList.size()-1);
    	}
    }
}
