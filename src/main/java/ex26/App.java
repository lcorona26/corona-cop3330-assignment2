/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Corona
 */

package ex26;


import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        int balance = app.readBal();
        int apr = app.readAPR();
        int monthlyPay = app.readPay();
        PaymentCalculator calc = new PaymentCalculator();
        int months = calc.calculateMonthsUntilPaidOff(balance,apr,monthlyPay);
        app.createOutput(months);
    }

    private void createOutput(int months) {
        String msg = String.format("It will take you %s months to pay off this card.", months);
        System.out.print(msg);
    }

    private int readBal() {
        System.out.print("What is your balance? ");
        int balance = in.nextInt();
        return balance;
    }

    private int readAPR() {
        System.out.print("What is the APR on the card (as a percent)? ");
        int rate = in.nextInt();
        return rate;
    }

    private int readPay() {
        System.out.print("What is the monthly payment you can make? ");
        int pay = in.nextInt();
        return pay;
    }
}
