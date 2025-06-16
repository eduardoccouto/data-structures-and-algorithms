/*Given a string s, return the maximum length of a substring such that it contains at most two occurrences of each character.
 *
 *   Example 1:
 *
 *  Input: s = "bcbbbcba"
 *  Output: 4
 *
 *  Explanation:
 *  The following substring has a length of 4 and contains at most two occurrences of each character: "bcbbbcba".*/
/**************************************************************************************************************************/
package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        System.out.println(maximumLengthSubstring("abbabaacca"));
    }

    public static int maximumLengthSubstring(String s) {

        int l = 0 , r = 0, _max = 1;

        Map<Character, Integer> counter = new HashMap<>();


        counter.put(s.charAt(0), 1);


        while(r < s.length() - 1){
            r++;

            char rChar = s.charAt(r);
            counter.put(rChar, counter.getOrDefault(rChar, 0) + 1);


            while(counter.get(rChar) == 3){
                char lChar = s.charAt(l);
                counter.put(lChar, counter.get(lChar) - 1);
                l++;
            }
            _max = Math.max(_max, r - l + 1);
        }

        return _max;
    }
}