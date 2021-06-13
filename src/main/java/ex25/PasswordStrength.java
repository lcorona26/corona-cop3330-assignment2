package ex25;

public class PasswordStrength {
    public void passwordValidator(String password) {
        PasswordStrength check = new PasswordStrength();
        boolean numOnly = check.onlyNum(password);
        boolean alphaOnly = check.onlyAlphabets(password);
        boolean special = check.hasSpecial(password);
        boolean num = check.atLeastNum(password);
        boolean alpha = check.atLeastAlpha(password);

        if(password.length() < 8){
            if(numOnly)
                System.out.print("The password " + '\'' + password +'\'' + " is a very weak password.");
            if(alphaOnly)
                System.out.print("The password " + '\'' + password +'\'' + " is a weak password.");
        }
        if(password.length() >= 8){
            if(alpha && num && !special)
                System.out.print("The password " + '\'' + password +'\'' + " is a strong password.");
            if(special && alpha && num)
                System.out.print("The password " + '\'' + password +'\'' + " is a very strong password.");
        }
    }

    public boolean atLeastAlpha(String password) {
        int count = 0;
        for(int i = 0; i< password.length(); i++){
            if(Character.isLetter(password.charAt(i)))
                count++;
        }
        if(count >=1)
            return true;

        return false;
    }

    public boolean atLeastNum(String password) {
        int count = 0;
        for(int i = 0; i< password.length(); i++){
            if(Character.isDigit(password.charAt(i)))
                count++;
        }
        if(count >=1)
            return true;

        return false;
    }

    public boolean hasSpecial(String password) {
        int count = 0;
        for(int i = 0; i< password.length(); i++){
            if(!Character.isLetter(password.charAt(i))
                    && !Character.isDigit(password.charAt(i))
                    && !Character.isWhitespace(password.charAt(i)))
                count++;
        }
        if(count >=1)
            return true;

        return false;
    }

    public boolean onlyAlphabets(String password) {
        for(int i = 0; i< password.length(); i++){
            if(!Character.isLetter(password.charAt(i)))
                return false;
        }
        return true;
    }

    public boolean onlyNum(String password) {
        for(int i = 0; i< password.length(); i++){
            if(!Character.isDigit(password.charAt(i)))
                return false;
        }
        return true;
    }
}
