class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # return indices of target
        seen_nums = {}

        for index, value in enumerate(nums):
            complement = target - value

            if complement in seen_nums:
                return [index, seen_nums[complement]]

            seen_nums[value] = index
