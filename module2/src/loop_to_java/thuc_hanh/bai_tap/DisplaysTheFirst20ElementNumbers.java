package loop_to_java.thuc_hanh.bai_tap;

public class DisplaysTheFirst20ElementNumbers {
    public static void main(String[] args) {
        System.out.println("-----Print 20 ilemental number-----");
        System.out.println("Count: ");
        int count = 0;
        int i = 2;
        System.out.println("20 ilemental number: ");
        while (count < 20) {
            if (is_prime_number(i)) {
                System.out.print(i + ", ");
                count++;
            }
            i++;
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
