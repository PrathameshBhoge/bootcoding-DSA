package com.bootcoding.leetcode75.array_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lc_1002 {
    public static void main(String[] args) {
        String [] words = {"bella","label","roller"};
        System.out.println(commonChars(words));
    }
    public static List<String> commonChars(String[] words) {
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);

        for (String word : words) {
            int[] freq = new int[26];
            for (char c : word.toCharArray()) {
                freq[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], freq[i]);
            }
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (minFreq[i]-- > 0) {
                result.add(String.valueOf((char) (i + 'a')));
            }
        }
        return result;
    }
}
