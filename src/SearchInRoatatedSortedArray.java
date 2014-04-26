
public class SearchInRoatatedSortedArray {
    public int search(int[] A, int target) {
        return Helper(A, target, 0, A.length-1);
    }
    public int Helper(int[] A, int target, int start, int end){
    	if(start > end){
    		return -1;
    	}
    	int mid = (start + end)/2;
    	if(A[mid] == target){
    		return mid;
    	}
    	if(A[start] <= A[mid]){
    		if(A[start] <= target && target < A[mid]){
    			return Helper(A, target, start, mid-1);
    		}
    		else{
    			return Helper(A, target, mid+1, end);
    		}
    	}
    	else {//A[start] > A[mid]
    		if(A[mid] < target && target <= A[end]){
    			return Helper(A, target, mid+1, end);
    		}
    		else{
    			return Helper(A, target, start, mid-1);
    		}
    	}
    }
}
