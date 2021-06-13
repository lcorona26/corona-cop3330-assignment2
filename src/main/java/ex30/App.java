/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Corona
 */
package ex30;

public class App {
    public static void main(String[] args) {
        App app = new App();
        app.Multiply();

    }
    public void Multiply() {
        for(int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.format("%4d", i * j);
            }
            System.out.println();
        }
    }
}
