import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubstring {

    public  static int lengthOfLongestSubstring(String s) {
        int max = Integer.MIN_VALUE, i =0;
        Map<Character,Integer> current = new HashMap<>();
        for (int j =0; j<s.length();j++){
            if (current.containsKey(s.charAt(j))){
                i = Math.max(current.get(s.charAt(j)), i);
            }
            max = Math.max(max, j - i + 1);
            current.put(s.charAt(j), j+1);
        }
        return max;
    }
  /* public static int lengthOfLongestSubstring(String s) {
       int n = s.length(), ans = 0;
       Map<Character, Integer> map = new HashMap<>(); // current index of character
       // try to extend the range [i, j]
       for (int j = 0, i = 0; j < n; j++) {
           if (map.containsKey(s.charAt(j))) {
               i = Math.max(map.get(s.charAt(j)), i);
           }
           ans = Math.max(ans, j - i + 1);
           map.put(s.charAt(j), j + 1);
       }
       return ans;
   }*/

    public static void main(String[] args) {
        System.out.println( LongestSubstring.lengthOfLongestSubstring("abca"));
    }
}
