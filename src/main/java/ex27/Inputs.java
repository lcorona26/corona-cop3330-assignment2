package ex27;

import java.util.Scanner;

public class Inputs {
    static Scanner in = new Scanner(System.in);

    public static String firstName() {
        System.out.print("Enter the first name: ");
        String first = in.nextLine();
        return first;
    }
    public static String lastName() {
        System.out.print("Enter the last name: ");
        String last = in.nextLine();
        return last;
    }
    public static String ZipCode() {
        System.out.print("Enter the ZIP code: ");
        String zip = in.nextLine();
        return zip;
    }
    public static String EmployID() {
        System.out.print("Enter the employee ID: ");
        String id = in.nextLine();
        return id;
    }
}
