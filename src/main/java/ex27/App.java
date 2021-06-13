/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Corona
 */
package ex27;

public class App {
    public static void main(String[] args) {
        App app = new App();
        Inputs input = new Inputs();
        Validation val = new Validation();
        String fName = input.firstName();
        String lName = input.lastName();
        String zipCode =input.ZipCode();
        String employID =input.EmployID();
        val.validateInput(fName, lName, zipCode, employID);
    }
}
