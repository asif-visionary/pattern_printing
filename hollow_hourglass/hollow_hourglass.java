import java.util.*;

public class hollow_hourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Upper Half
        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars and hollow spaces
            for (int j = 1; j <= 2 * (n - i) + 1; j++) {
                if (i == 1 || j == 1 || j == 2 * (n - i) + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // Lower Half
        for (int i = 2; i <= n; i++) {

            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars and hollow spaces
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == n || j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}