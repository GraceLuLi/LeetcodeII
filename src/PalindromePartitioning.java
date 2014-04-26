import java.util.ArrayList;

public class PalindromePartitioning {
    public ArrayList<ArrayList<String>> partition(String s) {
        int len = s.length();
        boolean[][] records = new boolean[len][len];
        
        for(int i = len-1; i >= 0; --i) {
        	for(int j = i; j < len; ++j) {
        		if(s.charAt(i) == s.charAt(j) && (j - i < 2 || records[i+1][j-1])) {
        			records[i][j] = true;
        		}
        	}
        }
        ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();
        ArrayList<String> tmpList = new ArrayList<String>();
        partitionHelper(s, 0, records, tmpList, res);
        return res;
    }
    
    public void partitionHelper(String s, int start, boolean[][] records, ArrayList<String> tmpList, ArrayList<ArrayList<String>> res) {
        if(start == s.length()) {
        	res.add(new ArrayList<String> (tmpList));
        	return;
        }
    	for(int i = start; i < s.length(); ++i) {
    		if(records[0][i]) {
    			tmpList.add(s.substring(0, i+1));
    			partitionHelper(s, i+1, records, tmpList, res);
    			tmpList.remove(tmpList.size()-1);
    		}
    	}
    }
}
