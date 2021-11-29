import java.util.Scanner;

public class Exercise2 {

    public static final int ARR_SIZE=10;

    public static void aboveAvg() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[ARR_SIZE];
        int sum = 0;
        double avg = 0;
        for (int i=0; i<arr.length; i++) {
            System.out.println("Insert number");
            arr[i] = scanner.nextInt();
            sum = sum +arr[i];
        }

        avg = sum/ARR_SIZE;
        for (int i=0; i<arr.length; i++) {
            if  (arr[i] > avg)
                System.out.print(arr[i] + ", ");
        }

    }

    public static void main(String[] args) {

        aboveAvg();
    }

}
