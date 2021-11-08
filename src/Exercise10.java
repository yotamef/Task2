import java.util.Scanner;

public class Exercise10 {

    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int userNum=0, secretNum, counter = 0, i=1;
        secretNum = (int)(Math.random()*1000+1);
        while (userNum != secretNum) {
            if (i%2==0)
                i=2;
            else {
                i = 1;
                counter++;
            }
            System.out.println("User "+i+" guess the secret num between 1 to 1000");
            userNum = reader.nextInt();
            if (userNum>secretNum) {
                System.out.println("The number is lower");
            }
            else if (userNum<secretNum) {
                System.out.println("The number is bigger");
            }

            else {
                System.out.println("Correct! the number is: "+secretNum+", user "+ i+ " won in "+counter+" guesses");
            }
            i++;
        }
    }
}
