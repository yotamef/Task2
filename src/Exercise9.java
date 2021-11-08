import java.util.Scanner;

public class Exercise9 {
    public static Scanner reader = new Scanner(System.in);

    public static boolean isDivide(int num1, int num2) {
        return (num1%num2==0);
    }
    public static boolean isPrime(int num) {
        boolean flag = true;
        for (int i = 2; i<=num/2; i++) {
            if (isDivide(num,i))
                flag = false;
        }
        return flag;
    }
    public static int positiveNum() {
        System.out.println("Insert a positive number");
        int num = reader.nextInt();
        while (num<=0) {
            System.out.println("Insert a positive number");
            num = reader.nextInt();
        }
        return num;
    }

    public static void main(String[] args) {
        int num = positiveNum();
        for (int i = 1; i<=num; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }
}
