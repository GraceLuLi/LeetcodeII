
public class RemoveDuplicatesSortedArray {
    public int removeDuplicates(int[] A) {
    	if(A == null || A.length == 0){
    		return 0;
    	}
    	int i = 1;
    	int j = 1;
    	while(j < A.length){
    		if(A[j] != A[i-1]){
    			 A[i++] = A[j++];
    		}
    		else{
    			j++;
    		}
    	}
        return i;
    }
}
