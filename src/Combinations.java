import java.util.ArrayList;

public class Combinations {
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
    	 ArrayList<ArrayList<Integer>> res = new  ArrayList<ArrayList<Integer>>();
    	 ArrayList<Integer> tmpList = new ArrayList<Integer>();
    	 getCombine(n, k, 1, tmpList, res);
    	 return res;
    }
    
    public void getCombine(int n, int k, int index, ArrayList<Integer> tmpList, ArrayList<ArrayList<Integer>> res) {
    	if(tmpList.size() == k){
    		res.add(new ArrayList<Integer> (tmpList));
    		return;
    	}
    	for(int i = index; i <= n; ++i){
    		tmpList.add(i);
    		getCombine(n, k, i+1, tmpList, res);
    		tmpList.remove(tmpList.size()-1);
    	}
    }
}
