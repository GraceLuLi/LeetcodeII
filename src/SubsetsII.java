import java.util.ArrayList;

public class SubsetsII {
    public static ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
    	 ArrayList<ArrayList<Integer>> res = new  ArrayList<ArrayList<Integer>>();
    	 if(num.length == 0){
    		 return res;
    	 }
    	 res.add(new ArrayList<Integer>());
		 ArrayList<Integer> tmpList;
    	 for(int i = 0; i < num.length; ++i) {

    		 int size = res.size();
			 for(int j = 0; j < size; ++j) {
    			 tmpList = res.get(j);
    			 tmpList.add(num[i]);
    			 res.add(new ArrayList<Integer> (tmpList));
    			 tmpList.remove(tmpList.size()-1);
    		 }
			 ++i;	 
    	 }
    	 return res;
    }
    
    public static void main(String[] args) {
    	int[] num = new int[]{1, 1};
    	ArrayList<ArrayList<Integer>> res = subsetsWithDup(num);
    }
}
