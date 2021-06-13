package ex26;

import ex25.PasswordStrength;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void testing_months_paid_off(){

        PaymentCalculator check = new PaymentCalculator();

        int expected= 70;
        int actual = check.calculateMonthsUntilPaidOff(5000, 12, 100);

        assertEquals(expected, actual);
    }

}