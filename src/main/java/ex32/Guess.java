package ex32;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    static Scanner in = new Scanner(System.in);

    public String Game(){
        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        String level = in.nextLine();

        Random rand = new Random();

        int randInt = 0;
        int count = 0;

        if(level.equals("1"))
            randInt = rand.nextInt(10) +1;
        if(level.equals("2"))
            randInt = rand.nextInt(100) +1;
        if(level.equals("3"))
            randInt = rand.nextInt(1000) +1;

        System.out.print("I have my number. What's your guess? ");
        while(true){
            String guess = in.nextLine();
            boolean isNum = true;

            try{
                int guessInt = Integer.parseInt(guess);
            }catch(NumberFormatException e){
                isNum = false;
                System.out.println("Not a number. Guess again: ");
                count++;
            }

            if(isNum){
                int guessInt = Integer.parseInt(guess);

                if(guessInt < randInt){
                    System.out.print("Too low. Guess again: ");
                    count++;
                }
                else if(guessInt > randInt){
                    System.out.print("Too high. Guess again: ");
                    count++;
                }
                if(guessInt == randInt){
                    count++;
                    break;
                }
            }
        }

        if(count == 1)
            System.out.println("You got it in " +count+ " guess!\n");
        else
            System.out.println("You got it in " +count+ " guesses!\n");

        System.out.println("Do you wish to play again (Y/N)? ");
        String play = in.nextLine();
        return play;
    }
}
