package ex26;

public class PaymentCalculator {
    public static int calculateMonthsUntilPaidOff(int b, int a, int p) {
        float percentApr = (float) (a/100.0);
        float i = (float) (percentApr / 365.0);
        float poweredFunc = (float) ((float) (b/p) * (1 - (Math.pow((1+i), 30))));
        float logFunc1 = (float) Math.log10(1 + poweredFunc);
        float logFunc2 = (float) Math.log10(1+i);
        float n = (float) Math.ceil((float) -(1/30.0) * (logFunc1/logFunc2));
        return (int) n;
    }
}
