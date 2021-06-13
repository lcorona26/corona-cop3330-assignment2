/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Corona
 */
package ex32;


import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Let's play Guess the Number!\n");
        Guess g = new Guess();
        String play = g.Game();

        while(true){
            if(play.equalsIgnoreCase("y"))
                g.Game();
            else
                System.exit(0);
        }
    }
}
