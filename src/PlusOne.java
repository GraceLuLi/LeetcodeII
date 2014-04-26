
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length];
        int carry = 1;
        int digitSum = 0;
        for(int i = digits.length-1; i >= 0; --i){
        	digitSum = carry + digits[i];
        	result[i] = digitSum%10;
        	carry = digitSum/10;
        }
        if(carry > 0){
        	int[] tmp = new int[result.length+1];
        	tmp[0] = 1;
        	for(int i = 0; i < result.length; ++i){
        		tmp[i+1] = result[i];
        	}
        	result = tmp;
        }
        return result;
    }
}
