package ex24;

import java.util.Arrays;

public class CheckAnagram {

    public boolean isAnagram(String word1, String word2) {
        String s1 = word1.replaceAll("\\s", "");
        String s2 = word2.replaceAll("\\s", "");
        boolean anagram = true;

        if(s1.length() != s2.length())
            anagram = false;
        else{
            char[] string1 = s1.toLowerCase().toCharArray();
            char[] string2 = s2.toLowerCase().toCharArray();
            Arrays.sort(string1);
            Arrays.sort(string2);
            anagram = Arrays.equals(string1, string2);
        }

        return anagram;
    }
}
