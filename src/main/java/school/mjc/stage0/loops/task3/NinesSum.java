package school.mjc.stage0.loops.task3;
import java.lang.Math;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        for (int j = 0; j <= lengthOfLastNumber; j++) {
            int result = (int) (Math.pow(10, j) - 1);
            sum = sum + result;
        }
        System.out.println(sum);
    }
}
