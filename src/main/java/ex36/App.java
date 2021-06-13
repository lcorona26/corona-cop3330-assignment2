/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Corona
 */
package ex36;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;


public class App {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App app = new App();
        Calc calc  = new Calc();
        ArrayList<String> num = app.readNum();
        Integer[] numInt = app.toInt(num);
        float avg = calc.Average(numInt);
        int Max = calc.Max(numInt);
        int Min =calc.Min(numInt);
        float sd = calc.standardDev(numInt,avg);
        app.printOutput(num, avg, Max, Min, sd);

    }
    private void printOutput(ArrayList<String> num, float avg, int Max, int Min, float sd) {
        String s = String.join(", ", num);
        System.out.println(s);
        System.out.println("\nThe average is " +avg+ "\n" +
                "The minimum is " +Min+ "\n" +
                "The maximum is " +Max+ "\n" +
                "The standard deviation is " + sd);
    }
    private Integer[] toInt(ArrayList<String> num) {
        ArrayList <Integer> listInt = (ArrayList<Integer>) num.stream().map(Integer::parseInt).collect(Collectors.toList());
        Integer[] intArray = listInt.toArray(new Integer[0]);
        return intArray;
    }

    private ArrayList<String> readNum() {
        String[] input = new String[100];
        ArrayList <String> num = new ArrayList<>();
        int i = 0;

        System.out.print("Enter a number: ");
        while(in.hasNextLine()) {
            input[i] = in.nextLine();
            if(input[i].equals("done"))
                break;
            else {
                try{
                    System.out.print("Enter a number: ");
                    int value = Integer.parseInt(input[i]);
                }catch(NumberFormatException e){
                    continue;
                }
                num.add(input[i]);
                i++;
            }
        }
        return num;
    }

}
