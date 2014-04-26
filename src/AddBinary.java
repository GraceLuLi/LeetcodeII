
public class AddBinary {
    public static String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        String c = "";
        int sum;
        while(i >= 0 || j >= 0) {
        	sum = carry;
        	if(i >= 0) {
        		sum += (a.charAt(i) - '0');
        		--i;
        	}
        	if(j >= 0) {
        		sum += (b.charAt(j) - '0');
        		--j;
        	}
        	c = sum%2 + c;
        	carry = sum/2;
        }
        c = carry + c;
        int k = 0;
        while(k < c.length()-1 && c.charAt(k) == '0') {
        	++k;
        }
        return c.substring(k);
    }
    public static void main(String[] args) {
    	String r = addBinary("0", "0");
    	System.out.print(r);
    }
}
