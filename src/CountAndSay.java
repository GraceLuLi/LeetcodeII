
public class CountAndSay {
    public static String countAndSay(int n) {
        String s = "1";
        StringBuilder sb;
        while(n > 1) {
            int i = 0;
            sb = new StringBuilder();
            while(i < s.length()) {
            	int count = 0;
            	char c = s.charAt(i);
            	do{
            		++i;
            		++count;
            	}while(i < s.length() && s.charAt(i) == s.charAt(i-1));
            	sb.append(count);
            	sb.append(c);
            }
            s = sb.toString();
            --n;
        }
        return s;
    }
}
