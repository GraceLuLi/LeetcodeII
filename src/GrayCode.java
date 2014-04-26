import java.util.ArrayList;

public class GrayCode {
    public ArrayList<Integer> grayCode(int n) {
        ArrayList<Integer> cur = new ArrayList<Integer>();
    	if(n < 0) {
    		return cur;
    	}
        cur.add(0);
        if(n == 0){
            return cur;
        }
        int i = 0;
        while(i < n){
        	int size = cur.size();
        	for(int j = size-1; j >= 0; --j){
        		cur.add(cur.get(j) + (1<<i));
        	}
        	i++;
        }
        return cur;
    }
}
