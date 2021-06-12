/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
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
        check.isAnagram(word1, word2);
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
