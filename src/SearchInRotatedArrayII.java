
public class SearchInRotatedArrayII {
    public boolean search(int[] A, int target) {
        return searchHelper(A, target, 0, A.length-1);
    }
    
    public boolean searchHelper(int[] A, int target, int start, int end) {
    	if(start > end){
    		return false;
    	}
    	int mid = (start + end)/2;
    	if(A[mid] == target){
    		return true;
    	}
    	if(A[start] < A[mid]){
    		if(A[start] <= target && target < A[mid]) {
    			return searchHelper(A, target, start, mid-1);
    		}
    		return searchHelper(A, target, mid+1, end);
    	}
    	else if(A[start] > A[mid]) {
    		if(target > A[mid] && target <= A[end]){
    			return searchHelper(A, target, mid+1, end);
    		}
    		return searchHelper(A, target, start, mid-1);
    	}
    	else{//A[start] == A[mid]
    		if(A[start] != A[end]){//from A[start] to A[mid] are all equal
    			return searchHelper(A, target, mid+1, end);
    		}
    		else{
    			boolean b = searchHelper(A, target, start, mid-1);
    			if(b){
    				return true;
    			}
    			return searchHelper(A, target, mid+1, end);
    		}
    	}
    }
}
