/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Corona
 */
package ex28;



import java.util.Scanner;


public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        int[] input = app.readInputs();
        int add = app.Addition(input);
        app.printOutput(add);
    }

    public void printOutput(int add) {
        System.out.print("The total is " + add + ".");
    }

    public int Addition(int[] input) {
        int sum = 0;
        for(int i = 0; i<5; i++){
            sum += input[i];
        }
        return sum;
    }

    public int[] readInputs() {
        int[] input = new int[10];
        for(int i = 0; i<5; i++){
            System.out.print("Enter a number: ");
            input[i] = in.nextInt();
        }
        return input;
    }
}
