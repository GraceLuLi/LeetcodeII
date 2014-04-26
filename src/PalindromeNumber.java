
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
    	if(x < 0) return false;
        int num = x;
        int divisor = 1;
        while(num/divisor >= 10){
           divisor *= 10;
        }
        while(num > 0){
        	int first = num/divisor;
            int last = num%10;
            if(first != last){
            	return false;
            }
        	num %= divisor;
            num /= 10;
            divisor /= 100;
        }
        return true;
    }
}
