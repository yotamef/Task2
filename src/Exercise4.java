import java.util.Scanner;

public class Exercise4 {

    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insert a");
        int a = reader.nextInt();
        System.out.println("Insert b");
        int b = reader.nextInt();
        System.out.println("Insert c");
        int c = reader.nextInt();
        if (Math.sqrt(Math.pow(b,2)-4*a*c) > 0) {
            System.out.println("Two solutions: "+(int)(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a)+" "+ (int)(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a));
        }
        else if (Math.sqrt(Math.pow(b,2)-4*a*c) == 0) {
            System.out.println("One solution: "+ -b/(2*a));

        }
        else {
            System.out.println("No solutions");
        }
    }
}
