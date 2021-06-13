/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Corona
 */
package ex38;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        String[] input = app.readInput();
        int[] inputNum = app.convertToInt(input);
        ArrayList<String> even = app.filterEvenNumbers(inputNum);
        app.printOutput(even);
    }

    public ArrayList<String> filterEvenNumbers(int[] inputNum) {
        ArrayList<String> even = new ArrayList<>();

        for(int i = 0; i < inputNum.length; i++){
            if(inputNum[i] % 2 == 0)
                even.add(String.valueOf(inputNum[i]));
        }
        return even;
    }

    private void printOutput(ArrayList<String> even) {
        System.out.print("The even numbers are ");
        String s = String.join(" ", even);
        System.out.println(s + ".");
    }

    private int[] convertToInt(String[] input) {
        int[] intInput = new int[input.length];
        for(int i = 0; i< input.length; i++){
            String stringNum = input[i];
            intInput[i] = Integer.parseInt(stringNum);
        }
        return intInput;
    }

    private String[] readInput() {
//        ArrayList<String> split = new ArrayList<>();

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String input = in.nextLine();
        String[] split = input.split("\\s+");
        return split;
    }
}
