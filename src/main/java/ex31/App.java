/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Corona
 */
package ex31;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App app = new App();
        String age = app.readAge();
        String restingHeart = app.readHeart();
        app.Calculate(age, restingHeart);

    }
    public void Calculate(String age, String restingHeart) {
        System.out.println("Resting Pulse: " +restingHeart+"        Age: " + age);
        System.out.println("\nIntensity    | Rate\n-------------|--------");
        int ageInt = Integer.parseInt(age);
        int restingHeartInt = Integer.parseInt(restingHeart);
        int add = 0;
        int target = 0;
        while(true){
            int intensity = 55 + add;
            if(intensity > 95)
                break;
            else{
                target = (int) ((( ((220-ageInt) - restingHeartInt) * intensity/100 )) + restingHeartInt);
                System.out.println(intensity+"%"+"          | " +target+  " bpm");
            }
            add += 5;
        }
    }

    public String readAge() {
        System.out.print("Enter age: ");
        String rate = null;
        while(in.hasNextLine()) {
            String input = in.nextLine();
            boolean isNum = true;
            try {
                int value = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.print("Must be a number. Try again: ");
                isNum = false;
            }
            if(isNum){
                rate = input;
                break;
            }
        }
        return rate;
    }

    public String readHeart() {
        System.out.print("Enter your resting heart rate: ");
        String age = null;
        while(in.hasNextLine()) {
            String input = in.nextLine();
            boolean isNum = true;
            try {
                int value = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.print("Must be a number. Try again: ");
                isNum = false;
            }
            if(isNum){
                age = input;
                break;
            }
        }
        return age;
    }
}
