
public class RomanToInteger {
    public int romanToInt(String s) {
    	if(s == null || s.length() == 0){
    		return 0;
    	}
    	int num = getInt(s.charAt(0));
    	int pre = getInt(s.charAt(0));
    	int cur;
    	for(int i = 1; i < s.length(); ++i){
    		char c = s.charAt(i);
    		cur = getInt(c);
    		if(cur <= pre){
    			num += cur;
    		}
    		else{
    			num = num - 2*pre + cur;
    		}
    		pre = cur;
    	}
        return num;
    }
    public int getInt(char c) {
    	switch(c){
    	case 'I' : 
    		return 1;
    	case 'V' :
    		return 5;
    	case 'X' :
    		return 10;
    	case 'L' :
    		return 50;
    	case 'C' :
    		return 100;
    	case 'D' :
    		return 500;
    	case 'M' :
    		return 1000;
    	default :
    		return -1;
    	}
    }
}
