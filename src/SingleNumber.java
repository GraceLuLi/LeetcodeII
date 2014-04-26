
public class SingleNumber {
    public int singleNumber(int[] A) {
        int num = A[0];
        for(int i = 1; i < A.length; ++i){
        	num ^= A[i];
        }
        return num;
    }
}
