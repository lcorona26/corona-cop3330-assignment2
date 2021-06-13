package ex29;

import ex25.PasswordStrength;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testing_years(){

        App check = new App();

        int expected= 18;
        int actual = check.yearsTillReturn("4");

        assertEquals(expected, actual);
    }
}