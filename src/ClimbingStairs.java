
public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i < arr.length; ++i){
        	arr[i] = arr[i-2] + arr[i-1];
        }
        return arr[n];
    }
}
