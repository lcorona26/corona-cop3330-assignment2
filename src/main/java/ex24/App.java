/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Corona
 */

package ex24;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App app = new App();
        String word1 = app.readWord1();
        String word2 = app.readWord2();
        CheckAnagram check = new CheckAnagram();
        boolean anagram = check.isAnagram(word1, word2);
        app.printOutput(anagram,word1,word2);
    }

    private void printOutput(boolean anagram,String word1,String word2) {
        if (anagram)
            System.out.println("\"" + word1 + "\"" + " and " + "\"" + word2 + "\"" + " are anagrams");
        else
            System.out.println("\"" + word1 + "\"" + " and "+ "\"" + word2 + "\"" + " are not anagrams");
    }

    private String readWord1() {
        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.print("Enter the first string: ");
        String word = in.nextLine();
        return word;
    }
    private String readWord2() {
        System.out.print("Enter the second string: ");
        String word = in.nextLine();
        return word;
    }

}
