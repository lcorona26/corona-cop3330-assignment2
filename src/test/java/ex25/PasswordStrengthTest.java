package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordStrengthTest {

    @Test
    void if_there_is_at_least_one_letter(){

        PasswordStrength check = new PasswordStrength();

        boolean expected= true;
        boolean actual = check.atLeastAlpha("abc");

        assertEquals(expected, actual);
    }
    @Test
    void if_there_is_at_least_one_number(){

        PasswordStrength check = new PasswordStrength();

        boolean expected= true;
        boolean actual = check.atLeastAlpha("abc123");

        assertEquals(expected, actual);
    }
    @Test
    void if_there_is_a_special_char(){

        PasswordStrength check = new PasswordStrength();

        boolean expected= true;
        boolean actual = check.atLeastAlpha("abc123!");

        assertEquals(expected, actual);
    }
    @Test
    void if_there_is_only_numbers(){

        PasswordStrength check = new PasswordStrength();

        boolean expected= true;
        boolean actual = check.onlyNum("123");

        assertEquals(expected, actual);
    }
    @Test
    void if_there_is_only_letters(){

        PasswordStrength check = new PasswordStrength();

        boolean expected= true;
        boolean actual = check.onlyAlphabets("abc");

        assertEquals(expected, actual);
    }

}