class Solution:
    def longestPalindrome(self, s: str) -> str:
        longest_pal = {}
        # Sliding Window
        # for char in range(0, len(str)):
