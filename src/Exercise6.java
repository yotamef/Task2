import java.util.Scanner;

public class Exercise6 {

    public static Scanner reader = new Scanner(System.in);

    public static void series(int a1, int d, int n) {
        if (n>=1) {
            for (int i = 1; i <= n; i++) {
                System.out.print(a1 + (i - 1) * d + ", ");
            }
        }
        else {
            System.out.println("No series");
        }
    }

    public static void main(String[] args) {
        System.out.println("Insert a1");
        int a1 = reader.nextInt();
        System.out.println("Insert d");
        int d = reader.nextInt();
        System.out.println("Insert n");
        int n = reader.nextInt();
        series(a1, d, n);
    }
}
