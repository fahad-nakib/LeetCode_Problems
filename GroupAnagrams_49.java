package org.example;

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map sorted string (key) to its list of anagrams (value)
        Map<String, List<String>> anagramsMap = new HashMap<>();

        for (String str : strs) {
            // 1. Sort the string to create a unique key for the anagram group
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            // 2. Safely fetch or create the list, then add the original string
            anagramsMap.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }

        // 3. Return all the grouped lists directly from the map values
        return new ArrayList<>(anagramsMap.values());
    }
}


public class GroupAnagrams_49 {
    static void main() {
        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        Solution sln = new Solution();
        List<List<String>> res = new ArrayList<>();
        res = sln.groupAnagrams(strs);
        System.out.println(res);

    }
}



