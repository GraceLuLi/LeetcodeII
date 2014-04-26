
public class SingleNumberII {
    public int singleNumber(int[] A) {
    	int num = 0;
    	for(int i = 0; i < 32; ++i) {
    		int tmpSum = 0;
    		int mask = (1 << i);
    		for(int j = 0; j < A.length; ++j) {
    			if((A[j] & mask) != 0) tmpSum++;
    		}
    		if(tmpSum%3 != 0){
    			num = mask + num;
    		}
    	}
        return num;
    }
}
