import java.util.Scanner;
public class Exercise1 {

    public static Scanner reader = new Scanner (System.in);
    
    public static void main(String[] args) {
        int userNum = 0;
        System.out.println("Insert a number");
        userNum = reader.nextInt();
        System.out.println("The absolute value is: " + Math.abs(userNum));

    }
}
