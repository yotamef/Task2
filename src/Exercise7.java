import java.util.Scanner;

public class Exercise7 {

    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int day, earlyHour, lateHour;
        System.out.println("Which day do you want to come?");
        day = reader.nextInt();
        System.out.println("What is the earliest time you can come?");
        earlyHour = reader.nextInt();
        System.out.println("What is the latest time you can come?");
        lateHour = reader.nextInt();
        if (day<1 || day>7) {
            System.out.println("Error, day isn't exist");
        }
        else if ((earlyHour>23 || earlyHour<0) || (lateHour>23 || lateHour<0)) {
            System.out.println("Error, hour isn't exist");
            }
        else if (earlyHour>lateHour){
            System.out.println("Error, late can't be before early");
        }
        else {
            if (day==1 || day==2 || day == 4 || day == 5) {
                if (lateHour < 9 || earlyHour > 17)
                    System.out.println("The office is open between 9 to 17 ");
                else
                    System.out.println("Okay!");
            }
            if (day==3){
                if (lateHour < 8 || earlyHour > 12)
                    System.out.println("The office is open between 8 to 12");
                else
                    System.out.println("Okay!");
            }
            if (day == 6 || day==7)
                System.out.println("The office isn't open on 6/7 day");
        }
    }
}

