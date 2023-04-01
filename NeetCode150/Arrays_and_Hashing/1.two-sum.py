#
# @lc app=leetcode id=1 lang=python3
#
# [1] Two Sum
#some changes here

# @lc code=start
import enum
#writing some comments


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # return indices of target
        seen_nums = {}

        for index, value in enumerate(nums):
            complement = target - value

            if complement in seen_nums:
                return [index, seen_nums[complement]]

            seen_nums[value] = index

# @lc code=end

