package ex27;

public class Validation {

    public static void validateInput(String fName, String lName, String zipCode, String employID) {
            boolean error = false;

            if(fName.length() <2){
                System.out.println("The first name must be at least 2 characters long.");
                error = true;
            }
            if(fName.equals("")){
                System.out.println("The first name must be filled in.");
                error = true;
            }
            if(lName.length() <2){
                System.out.println("The last name must be at least 2 characters long.");
                error = true;
            }
            if(lName.equals("")){
                System.out.println("The last name must be filled in.");
                error = true;
            }

            boolean s = true;
            String symbol = String.valueOf(employID.charAt(2));
            if(!symbol.equals("-"))
                s= false;

            for(int i = 3; i<7; i++) {
                if(!Character.isDigit(employID.charAt(i)))
                    s= false;
            }
            for(int i = 0; i<2; i++) {
                if(!Character.isLetter(employID.charAt(i)))
                    s= false;
            }
            if(!s){
                System.out.println("The employee ID must be in the format of AA-1234.");
                error = true;
            }

            boolean isNum = true;
            try{
                int value = Integer.parseInt(zipCode);
                isNum = true;
            }catch(NumberFormatException e){
                isNum = false;
            }
            if(!isNum){
                System.out.println("The zipcode must be a 5 digit number.");
                error = true;
            }

            if(!error)
                System.out.println("There were no errors found.");
    }
}

