package ex36;

import ex25.PasswordStrength;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void test_avg(){

        Calc check = new Calc();
        Integer[] array = {100,200,1000,300};
        float expected= 400.0F;
        float actual = check.Average(array);

        assertEquals(expected, actual);
    }
    @Test
    void test_max(){

        Calc check = new Calc();

        Integer[] array = {100,200,1000,300};
        int expected= 1000;
        int actual = check.Max(array);

        assertEquals(expected, actual);
    }
    @Test
    void test_min(){

        Calc check = new Calc();

        Integer[] array = {100,200,1000,300};
        int expected= 100;
        int actual = check.Min(array);

        assertEquals(expected, actual);
    }
    @Test
    void test_sd(){

        Calc check = new Calc();

        Integer[] array = {100,200,1000,300};
        float avg = 400.0F;
        float expected= 353.5534F;
        float actual = check.standardDev(array, avg);

        assertEquals(expected, actual);
    }


}