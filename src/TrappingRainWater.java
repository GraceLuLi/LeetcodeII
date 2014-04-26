
public class TrappingRainWater {
    public int trap(int[] A) {
        int[] leftmax = new int[A.length];
        for(int i = 1; i < A.length; ++i){
        	leftmax[i] = Math.max(leftmax[i-1], A[i-1]);  
        }
        int[] rightmax = new int[A.length];
        for(int i = A.length-2; i >= 0; --i){
        	rightmax[i] = Math.max(rightmax[i+1], A[i+1]);
        }
        int max = 0;
        for(int i = 0; i < A.length; ++i){
        	int h = Math.min(leftmax[i], rightmax[i]);
        	max += Math.max(0, h - A[i]);
        }
        return max;
    }
}
