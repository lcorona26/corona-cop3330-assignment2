/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
package ex33;

import java.util.Scanner;
import java.util.Random;

public class App {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App app = new App();
        String question = app.readQuest();
        String answer = app.randomizeAnswers();
        app.Display(answer);
    }

    private void Display(String answer) {
        System.out.print(answer);
    }

    private String randomizeAnswers() {
        String[] strings={"Yes.", "No.", "Maybe.", "Ask again later."};
        Random r =new Random();
        int randomNumber = r.nextInt(strings.length);
        return (strings[randomNumber]);
    }

    private String readQuest() {
        System.out.print("What's your question? ");
        String question = in.nextLine();
        return question;
    }
}
