package loop_to_java.thuc_hanh.bai_tap;

public class DisplaysInElementNumbersLessThan100 {
    public static void main(String[] args) {
        System.out.println("----Displays in element numbers less than 100----");
        System.out.println("Infigers less than 100 are: ");
        for (int i = 2; i < 100; i++) {
            if (is_prime_number(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean is_prime_number(int n) {
        if (n < 2) {
            return false;
        }
        int square_root = (int) Math.sqrt(n);
        for (int i = 2; i < square_root; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
