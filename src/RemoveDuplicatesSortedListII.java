
public class RemoveDuplicatesSortedListII {
    public static int removeDuplicates(int[] A) {
        if(A.length <= 1){
    		return A.length;
    	}
    	int i = 1;
    	int j = 1;
    	while(j < A.length){
    		if(A[j] != A[j-1]){
    			A[i++] = A[j++];
    		}
    		else{
    			A[i++] = A[j++];
        		while(j < A.length && A[j] == A[j-1]){
    				++j;
        		}
    		}
    	}
    	return i;
    }
    public static void main(String[] args){
    	int[] A = new int[]{1,1,1};
    	int i = removeDuplicates(A);
    	System.out.println(i);
    }
}
