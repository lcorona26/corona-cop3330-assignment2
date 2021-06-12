/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

package ex25;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
       App app = new App();
       String password = app.readPass();
       PasswordStrength pass = new PasswordStrength();
       pass.passwordValidator(password);

    }

    private String readPass() {
        System.out.print("Enter Password: ");
        String pass = in.nextLine();
        return pass;
    }
}
