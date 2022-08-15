import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        // SOURce: NEETCODE 32% Faster, Memory 83%
        if(s.length() != t.length()) return false;
        if(s.equals(t)) return true;
        
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            sMap.merge(s.charAt(i), 1, Integer::sum);
            tMap.merge(t.charAt(i), 1, Integer::sum);
        }
        
        for(Character c : sMap.keySet()) {
            if(!sMap.get(c).equals(tMap.get(c))) return false;
        }
        return true;
    }

        // My Solution 32.56% faster, memory 7.42%

        // char[] sChar = s.toCharArray();
        // char[] tChar = t.toCharArray();

        // HashMap<Character, Integer> sMap = new HashMap<>();
        // HashMap<Character, Integer> tMap = new HashMap<>();

        // for (int i = 0; i < sChar.length; i++) {
        //     char sKey = sChar[i];

        //     if (!sMap.containsKey(sKey)) {
        //         sMap.put(sKey, 1);
        //     }
        //     else sMap.put(sKey, sMap.get(sKey) + 1);

        // }
        // for(int i = 0; i < tChar.length; i++){
        //     char tKey = tChar[i];

        //     if (!tMap.containsKey(tKey)) {
        //         tMap.put(tKey, 1);
        //     }
        //     else tMap.put(tKey, tMap.get(tKey) + 1);
        // }

        // return sMap.equals(tMap);

        // Passes but slow
        // int i = 0;
        // for (char value : sChar) {
        // sC[i++] = Character.valueOf(value);
        // }

        // i = 0;
        // for (char value : tChar) {
        // tC[i++] = Character.valueOf(value);
        // }

        // ArrayList<Character> sList = new ArrayList<Character>(Arrays.asList(sC));
        // ArrayList<Character> tList = new ArrayList<Character>(Arrays.asList(tC));

        // Collections.sort(sList);
        // Collections.sort(tList);

        // if(sList.size() != tList.size())
        // return false;

        // for (i = 0; i < sList.size(); i++) {
        // if(sList.get(i) != tList.get(i))
        // return false;
        // }
        // return true;
//    }
}
// @lc code=end
