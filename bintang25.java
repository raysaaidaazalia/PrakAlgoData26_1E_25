import java.util.Scanner;

public class bintang25 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        double nim25 = raysha.nextDouble();

        int n = (int) (nim25 % 100);
        System.out.println(n);

        if (n < 10) {
            n += 10;
        }
        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
                continue;
            }
            if (i % 3 == 0) {
                System.out.print("# ");
            } else if (i % 2 == 0) {
                System.out.print(" " + i);
            } else {
                System.out.print("* ");
            }

        }

    }
}

