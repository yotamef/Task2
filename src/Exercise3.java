import java.util.Scanner;

public class Exercise3 {
    public static Scanner reader = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.println("Insert a number");
        int userNum1 = reader.nextInt();
        System.out.println("Insert a number");
        int userNum2 = reader.nextInt();
        System.out.println("Insert a number");
        int userNum3 = reader.nextInt();

        int big = Math.max(userNum1, Math.max(userNum2, userNum3));
        int small = Math.min(userNum1, Math.min(userNum2, userNum3));

        if (userNum1 == small) {
            System.out.print(userNum1 + " ");
            if (userNum2<=userNum3) {
                System.out.print(userNum2 + " " + big);
            } else {
                System.out.print(userNum3 + " " + big);
            }
        } else if (userNum2==small) {
            System.out.print(userNum2 + " ");
            if (userNum1<=userNum3) {
                System.out.print(userNum1 + " " + big);
            } else {
                System.out.print(userNum3 + " " + big);
            }
        } else {
            System.out.print(small +" " +Math.min(userNum1,userNum2) + " "+ Math.max(userNum1,userNum2));
        }

        }

    }



