import java.util.ArrayList;

public class Permutations {
	// Method 1: DFS
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
    	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    	if(num == null || num.length == 0){
    		return res;
    	}
    	ArrayList<Integer> tmpList = new ArrayList<Integer>();  
    	boolean[] visited = new boolean[num.length];
    	DFS(num, 0, visited, tmpList, res);
    	return res;	
    }
    
    public void DFS(int[] num, int index, boolean[] visited, ArrayList<Integer> tmpList, ArrayList<ArrayList<Integer>> result){
    	if(index == num.length){
    		result.add(new ArrayList<Integer> (tmpList));
    		return;
    	}
    	for(int i = 0; i < num.length; ++i){
    		if(!visited[i]){
    			visited[i] = true;
    			tmpList.add(num[i]);
    			DFS(num, index+1, visited, tmpList, result);
    			tmpList.remove(tmpList.size()-1);
    			visited[i] = false;
    		}
    	}
    }
    // Method 2: Mathematics
    
}
