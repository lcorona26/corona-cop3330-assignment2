package ex36;



public class Calc {
    public float Average(Integer[] num) {
        int sum = 0;
        float avg = 0;

        System.out.print("Numbers: ");
        for (Integer integer : num) {
            sum += integer;
        }
        avg = (float) (sum / (num.length * 1.0));
        return avg;
    }

    public int Max(Integer[] num) {

        int maximum = num[0];

        for (Integer integer : num) {
            if (integer > maximum)
                maximum = integer;
        }
        return maximum;
    }
    public int Min(Integer[] num) {
        int minimum = num[0];
        for (Integer integer : num) {
            if (integer < minimum)
                minimum = integer;
        }
        return minimum;
    }

    public float standardDev(Integer[] num, float avg) {
        int sd = 0;
        for (Integer integer : num) {
            sd += Math.pow(integer - avg, 2);
        }
        return (float) Math.sqrt(sd/(num.length * 1.0));
    }
}

