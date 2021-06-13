package ex28;

import ex25.PasswordStrength;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testing_sum(){

        App check = new App();
        int[] array = {1,2,3,4,5};
        int expected= 15;
        int actual = check.Addition(array);

        assertEquals(expected, actual);
    }

}