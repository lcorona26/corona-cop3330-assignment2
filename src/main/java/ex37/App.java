/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Corona
 */

package ex37;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        Store storage = new Store();
        int length = app.readLength();
        int special = app.readSpecial();
        int numbers = app.readNum();
        storage.Password(length,special,numbers);

    }

    private int readLength() {
        System.out.print("What's the minimum length? ");
        int length = in.nextInt();
        return length;
    }

    private int readSpecial() {
        System.out.print("How many special characters? ");
        int special = in.nextInt();
        return special;
    }

    private int readNum() {
        System.out.print("How many numbers? ");
        int numbers = in.nextInt();
        return numbers;
    }
}
