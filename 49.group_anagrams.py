class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        d = {}

        # sort each word
        # check if dictionary contains word
        #    contains sorted word
        #        dictionary add non-sorted version
        #    else dictionary add og word

        for word in strs:
            sorted_word_list = sorted(word)
            sorted_word = ''.join(sorted_word_list)
            if sorted_word in d:
                d[sorted_word].append(word)
            else:
                d[sorted_word] = [word]

        return list(d.values())
