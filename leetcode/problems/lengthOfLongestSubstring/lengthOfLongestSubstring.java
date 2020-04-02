package trainingQuestions.leetcode.problems.lengthOfLongestSubstring;

import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        String ss = "", result = "";
        HashMap<Character,Integer> occurencies = new HashMap<Character,Integer>();
        int i = 0, mainPosition = 0, stringSize = s.length();

        while(mainPosition < stringSize && i < stringSize) {
            if(!occurencies.containsKey(s.charAt(i))) {
                occurencies.put(s.charAt(i),i);
                ss += s.charAt(i);
                i++;
            } else {
                if(ss.length() > result.length()){
                    result = ss;
                }
                // Math.max(ss.length(),result.length());
                ss = "";
                occurencies.remove(s.charAt(i));
                mainPosition++;
                i = mainPosition;
            }
        }
        if(i >= stringSize && ss.length() > result.length()){
            result = ss;
        }

        return result.length();
    }
}