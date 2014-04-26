
public class ReverseInteger {
    public int reverse(int x) {
    	int sign = 1;
        if(x < 0){
        	x = -x;
        	sign = -1;
        }
        int result = 0;
      
        while(x > 0){
        	result = result*10 + x%10;
        	x /= 10;
        }
        return sign*result;
    }
}
