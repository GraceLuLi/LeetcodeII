
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int max = 0;
        int tmp = 0;
        while(i < j){
        	if(height[i] < height[j]){
        		tmp = height[i] * (j - i);
        		do{
        			++i;
        		}while(i < j && height[i] <= height[i-1]);
        	}
        	else{
        		tmp = height[j] * (j - i);
        		do{
        			--j;
        		}while(i < j && height[j] <= height[j+1]);
        	}
        	max = Math.max(max, tmp);
        }
        return max;
    }
}
