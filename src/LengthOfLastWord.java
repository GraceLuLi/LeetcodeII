
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int len = s.length();
        if(len == 0){
        	return 0;
        }
        int i = len - 1;
        while(i >= 0 && s.charAt(i) != ' '){
        	--i;
        }
        return len-1-i;
    }
}
