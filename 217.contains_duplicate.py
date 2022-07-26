class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        num_set = set()
        for value in nums:
            if value in num_set:
                return True
            num_set.add(value)
        return False
