package school.mjc.stage0.loops.task3;
import java.lang.Math;
public class DigitsSum {
    public void printDigitsSum(int t) {
        String number = t + "";
        int result = 0;
        for (int i = 0; i <= number.length(); i++) {
            int j = (int) (t / Math.pow(10, i));
            int digit = j;
            digit = digit % 10;
            result = result + digit;
        }

        switch (t >= 0 ? 0 : 1) {
            case 0:
                System.out.println(result);
                break;
            case 1:
                System.out.println(-result);
                break;
        }
    }
}
