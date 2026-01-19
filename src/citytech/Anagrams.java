//Approach
//First I check the Length because if the two strings have different lengths, they cannot be anagrams. Then I converted both strings to lowercase to avoid case sensitivity.
//Then converted the strings into character arrays and sorted them.And if sorted arrays are identical, the strings are anagrams.

//Time complexity
//Sorting takes O(n log n)
//Comparing arrays takes O(n)
//Overall: O(n log n)

//Space complexity
//Two character arrays of size n. So Space Complexity: O(n)

package citytech;

import java.util.Arrays;

public class Anagrams {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArr = s.toLowerCase().toCharArray();
        char[] tArr = t.toLowerCase().toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(sArr, tArr);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // True
        System.out.println(isAnagram("rat", "car"));       // False
    }
}
