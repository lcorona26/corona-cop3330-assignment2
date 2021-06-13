/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

package ex34;
import java.util.Scanner;
import java.util.Arrays;
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        String[] employ = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String name = app.readName(employ);
        app.removeName(name, employ);
    }

    private void removeName(String name, String[] employ) {
        int index = 0;
        int i = 0;
        for(; i< employ.length; i++){
            if(employ[i].equals(name))
                index = i;
        }

        String[] copy = new String[employ.length-1];
        System.arraycopy(employ,0,copy,0, index);
        System.arraycopy(employ, index + 1, copy, index, employ.length - index - 1);
        System.out.println("\nThere are 4 employees: ");
        for(String employee: copy)
            System.out.println(employee);
    }

    private String readName(String[] employ) {
        System.out.println("\nThere are 5 employees: ");
        for(String employee: employ)
            System.out.println(employee);
        System.out.print("\nEnter an employee name to remove: ");
        String name = in.nextLine();
        return name;
    }
}
