import java.util.ArrayList;
import java.util.Stack;

public class GenerateParentheses {
    public static ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<String>();
        generateParenthesis(n, 0, 0, "", res);
        return res;
    }
    public static void generateParenthesis(int n, int left, int right, String tmp, ArrayList<String> res){
    	if(left == n){
    		while(right < n){
    			tmp += ")";
    			++right;
    		}
    		res.add(tmp);
    		return;
    	}
    	if(left > right){
    		generateParenthesis(n, left, right+1, tmp+")", res);
    	}
    	generateParenthesis(n, left+1, right, tmp+"(", res);
    }
    
    public static void main(String[] args){
    	ArrayList<String> res = generateParenthesis(1);
    	
    }
}
