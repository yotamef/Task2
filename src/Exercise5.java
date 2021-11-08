import java.util.Scanner;

public class Exercise5 {

    public static Scanner reader = new Scanner(System.in);

    public static int wage(int kindWorker, int hours, int goodDays) {
        if (kindWorker==1) {
            int salary = hours*200 + goodDays*250;
            return salary;
        }
        else if (kindWorker==0) {
            int salary = hours*50 + goodDays*250;
            return salary;
        }
        else {
            System.out.println("worker is not exist");
            return 0;
        }
    }

    public static void main(String[] args) {
        int answer = 0;
        do {
        System.out.println("Enter worker");
        int kindWorker = reader.nextInt();
        System.out.println("How many hours did he worked");
        int hours = reader.nextInt();
        System.out.println("How many times he reached his goals");
        int goodDays = reader.nextInt();

            System.out.println("His wage is: "+wage(kindWorker,hours,goodDays));
            System.out.println("Another worker? (0 = no, 1 = yes)");
            answer = reader.nextInt();
        } while(answer == 1);
    }
}
