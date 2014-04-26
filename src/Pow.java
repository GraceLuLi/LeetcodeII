
public class Pow {
    public double pow(double x, int n) {
        if(n < 0) {
        	return 1.0/power(x, -n);
        }
        else{
        	return power(x, n);
        }
    }
    public double power(double x, int n) {//this n must be positive
    	if(n == 0) {
    		return 1;
    	}
    	double f = power(x, n/2);
    	if(n % 2 == 0) {
    		return f * f;
    	} else {
    		return f * f * x;
    	}
    }
}
