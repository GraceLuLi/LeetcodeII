import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] num) {
        HashSet<Integer> set = new HashSet<Integer>();
        int max = 0;
        for(int n : num) {
        	set.add(n);
        }
        for(int n : num) {
        	int left = n - 1;
        	int right = n + 1;
        	int count = 1;
        	while(set.contains(left)) {
        		++count;
        		set.remove(left);
        		--left;
        	}
        	while(set.contains(right)) {
        		++count;
        		set.remove(right);
        		++right;
        	}
        	max = Math.max(max, count);
        }
        return max;
    }
}
