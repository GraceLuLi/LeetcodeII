
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
        	return "";
        }
        String s = strs[0];
        for(int i = 0; i < s.length(); ++i) {
        	char cur = s.charAt(i);
        	for(String str : strs){
        		if(i >= str.length() || str.charAt(i) != cur){
        			return s.substring(0,i);
        		}
        	}
        }
        return s;
    }
}
