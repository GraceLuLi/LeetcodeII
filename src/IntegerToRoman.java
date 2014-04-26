
public class IntegerToRoman {
    public String intToRoman(int num) {
        int[] value = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbol = new String[]{"M","CM","D", "CD", "C", "XC", "L", "XL", "X", "IX", "V","IV", "I"};
        
        String res = "";
        int i = 0;
        int count = 0;
        while(num > 0){
        	if(num > value[i]){
        		count = num/value[i];
        		while(count > 0){
        			res += symbol[i];
        			--count;
        		}
        		num %= value[i];
        	}
    		++i;
        }
        return res;
    }
}
