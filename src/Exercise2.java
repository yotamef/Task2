import java.util.Scanner;

public class Exercise2 {

    public static Scanner reader = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.println("Insert a number");
        int userNum1 = reader.nextInt();
        System.out.println("Insert a number");
        int userNum2 = reader.nextInt();
        int sum = userNum1 + userNum2;
        if (sum%2 == 0)
            System.out.println("The sum is double");
        else
            System.out.println("The sum is odd");

    }
}
