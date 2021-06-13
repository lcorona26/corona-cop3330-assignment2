/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Corona
 */

package ex35;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        ArrayList<String> array = app.readInput();
        String random = app.randomizeWinner(array);
        app.pickWinner(random);

    }

    private void pickWinner(String random) {
        System.out.print("The winner is... " +random+ " .");
    }

    public String randomizeWinner(ArrayList<String> array) {
        int rand = 0;
        for(int i =0; i< array.size(); i++){
           rand = (int) (Math.random() * array.size());
       }
       return array.get(rand);
    }


    private ArrayList<String> readInput() {
        String[] input = new String[100];
        ArrayList <String> array = new ArrayList<>();
        int i = 0;
        System.out.print("Enter a name: ");

        while(in.hasNextLine()){
            System.out.print("Enter a name: ");
            input[i] = in.nextLine();

            if(input[i].isEmpty())
                break;
            else
                array.add(input[i]);
                i++;
        }

        return array;
    }
}
