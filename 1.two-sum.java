import java.util.HashMap;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int diff;

        for(int i = 0; i < nums.length; i++){
            diff = target - nums[i];

            if(map.containsKey(diff)){
                int num1 = map.get(diff);
                return new int[]{num1, i};
            }
        map.put(nums[i], i);
        }
        return result;
    }
}
// @lc code=end

