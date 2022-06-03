import java.util.HashMap;
import java.util.HashSet;

/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> map = new HashSet<>();
        char[] sToChar = s.toCharArray();

        int max = 0;
        int start = 0;

        for (int end = 0; end < sToChar.length; end++) {
            char curr = sToChar[end];
            while (map.contains(curr)) {
                map.remove(sToChar[start]);
                start++;
            }

            map.add(sToChar[end]);
            max = Math.max(max, end - start + 1);
        }
        return max;
    }
}
// @lc code=end
