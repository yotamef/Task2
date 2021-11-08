import java.util.Scanner;

public class Exercise8 {

    public static Scanner reader = new Scanner(System.in);
    public static int userInput(){
        int num = 0;
        System.out.println("Enter a number between 5 - 20");
        num = reader.nextInt();
        while (num <5 || num>20){
            System.out.println("the number you chose wasn't in the range\nEnter a number between 5 - 20");
            num = reader.nextInt();
        }
        return num;
    }
    public static void  printTriangle(int num){
        for (int i = 1; i <= num;i++){
            for (int j = 0;j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num = userInput();
        printTriangle(num);
    }

}
