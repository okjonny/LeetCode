class Solution:
    def map_letter(self, s: str):
        d = {}
        for letter in s:
            if letter in d:
                d[letter] += 1
            else:
                d[letter] = 1
        return d

    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        s_set = self.map_letter(s)
        t_set = self.map_letter(t)

        return s_set == t_set
