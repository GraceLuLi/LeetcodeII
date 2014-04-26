import java.util.ArrayList;

public class LetterCombinationsPhoneNumber {
    public ArrayList<String> letterCombinations(String digits) {
    	ArrayList<String> res = new ArrayList<String>();
        String[] table = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs","tuv","wxyz"};
        getCombinations(digits, table, "", res);
        return res;
    }
    public void getCombinations(String digits, String[] table, String tmp, ArrayList<String> res) {
        if(digits.length() == 0) {
        	res.add(tmp);
        	return;
        }
    	int c = digits.charAt(0) - '0';
    	String chars = table[c];
    	for(int j = 0; j < chars.length(); ++j) {
    		getCombinations(digits.substring(1), table, tmp + chars.substring(j, j+1), res);
    	}  
    }
}
