import java.util.HashSet;

/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : nums) {
           if(!set.contains(i))
                set.add(i);
            else return true;
        }
        return false;
    }
}
// @lc code=end

