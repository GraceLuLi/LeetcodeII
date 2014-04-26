
public class MaximumSubarray {
    public static int maxSubArray(int[] A) {
    	if(A == null || A.length == 0){
    		return 0;
    	}
        int[] records = new int[A.length];
        records[0] = A[0];
        int max = records[0];
        for(int i = 1 ; i < A.length; ++i){
        	records[i] = Math.max(A[i], A[i]+records[i-1]);
        	max = Math.max(max, records[i]);
        }
        return max;
    }
    public static void main(String[] args){
    	int[] A = new int[]{1,2,-1,-2,2,1,-2,1,4,-5,4};
    	int re = maxSubArray(A);
    	System.out.println(re);
    }
}
