import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); ++i){
        	char c = s.charAt(i);
        	if(c == '(' || c == '{' || c == '['){
        		stack.push(c);
        	}
        	else{
        		char expect = 'n';
        		switch(c){
        		case ')' :
        			expect = '(';
        			break;
        		case '}':
        			expect = '{';
        			break;
        		case ']' :
        			expect = '[';
        			break;
        		default :
        			break;
        		}
        		if(stack.isEmpty() || stack.pop() != expect){
        			return false;
        		}
        	}
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}
