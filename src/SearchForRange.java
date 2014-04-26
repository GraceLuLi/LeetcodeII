
public class SearchForRange {
    public int[] searchRange(int[] A, int target) {
        int start = 0;
        int end = A.length-1;
        int mid = 0;
        while(start < A.length && end >= 0 && start <= end) {
        	mid = (start + end)/2;
        	if(A[mid] == target){
        		int left = mid;
                int right = mid;
                while(left-1 >= 0 && A[left-1] == A[left]) {
                	--left;
                }
                while(right+1 < A.length && A[right] == A[right+1]) {
                	++right;
                }
                return new int[]{left, right};
        	}
        	if(A[mid] < target){
        		while(mid+1 < A.length && A[mid+1] == A[mid]){
        			++mid;
        		}
        		start = mid + 1;
        	}
        	else{
        		while(mid-1 >= 0 && A[mid-1] == A[mid]) {
        			--mid;
        		}
        		end = mid - 1;
        	}
        }
        
        return new int[]{-1, -1};  
    }
}
