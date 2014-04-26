import java.util.Arrays;
public class ThreeSumClosest {
    public int threeSumClosest(int[] num, int target) {
    	if(num.length < 3) {
    		return -1;
    	}
    	Arrays.sort(num);
    	int res = num[0] + num[1] + num[2];
        for(int i = 0; i < num.length-2; ++i) {
        	int cur = num[i];
        	int start = i+1;
        	int end = num.length-1;
        	while(start < end) {
        		int sum = cur + num[start] + num[end];
        		if(sum == target) {
        			return target;
        		}
        		if(Math.abs(sum - target) < Math.abs(res - target)){
        			res = sum;
        		}
        		if(sum < target) {
        			++start;
        		}
        		else{//sum > target
        			--end;
        		}
        	}
        	
        }
        return res;
    }
}
