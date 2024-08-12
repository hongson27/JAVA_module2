package ss2_loop.bai_tap;

public class Screen_20_Prime {
    public static void main(String[] args) {
        int count = 0;
        boolean isPrime = true;
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j<= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
                count ++;
            }
            isPrime = true;
            if (count == 20) {
                break;
            }
        }
    }
}
