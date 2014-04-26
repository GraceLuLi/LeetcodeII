import java.util.ArrayList;
import java.util.Arrays;
public class Subsets {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
    	Arrays.sort(S);
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        res.add(new ArrayList<Integer> ());
        for(int i = 0; i < S.length; ++i){
        	int num = S[i];
        	int size = res.size();
        	for(int j = 0; j < size; ++j){
        		ArrayList<Integer> set = res.get(j);
        		set.add(num);
        		res.add(new ArrayList<Integer> (set));
        		set.remove(set.size()-1);
        	}
        }
        return res;
    }
}
