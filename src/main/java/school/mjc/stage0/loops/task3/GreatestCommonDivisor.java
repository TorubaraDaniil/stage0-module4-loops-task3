package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gcd = 1;
        switch (first != 0 && second != 0 ? 0 : 1) {
            case 0:
                for (int i = 1; i <= first && i <= second; i++) {
                    if (first % i == 0 && second % i == 0) {
                        gcd = i;
                    }
                }
                System.out.println(gcd);
                break;
            case 1:
                switch (first == 0 ? 0 : 1){
                    case 0:
                        switch (second == 0 ? 0 : 1){
                            case 0:
                                gcd = 0;
                                System.out.println(gcd);
                                break;
                            case 1:
                                gcd = second;
                                System.out.println(gcd);
                                break;
                        }
                        break;
                    case 1:
                        switch (second == 0 ? 0 : 1){
                            case 0:
                                gcd = first;
                                System.out.println(gcd);
                                break;
                        }
                        break;
                }
        }
    }
}
