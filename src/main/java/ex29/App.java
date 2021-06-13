/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Corona
 */
package ex29;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        String input = app.readInput();
        int years = app.yearsTillReturn(input);
        app.printOutput(years);
    }

    public void printOutput(int years) {
        System.out.print("It will take " +years+ " years to double your initial investment.");
    }

    public int yearsTillReturn(String r) {
        int rtoInt = Integer.parseInt(r);
        int years = 72/rtoInt;
        return years;
    }

    public String readInput() {

        String input;
        while(true){
            System.out.print("What is the rate of return? ");
            input = in.nextLine();

            if(input.equals("0"))
                System.out.println("Sorry. That's not a valid input. ");
            try{
                int value = Integer.parseInt(input);
                if(value != 0)
                    return input;
            }
            catch (NumberFormatException | ArithmeticException e) {
                System.out.println("Sorry. That's not a valid input. ");
            }
        }
    }
}