import java.util.Scanner;

public class Exercise7 {
    public static void printBoard(char[] chars) {
        for (int i=0; i<chars.length; i++) {
            if ((i+1) %3 != 0) {
                System.out.print(chars[i] +"\t");
            }
            else {
                System.out.println(chars[i]);
            }
        }
    }

    public static boolean isAvailable(char[] board, int location) {
        if (board[location-1] == 'x' || board[location-1] == '0')
            return false;
        else {
            return true;
        }
    }

    public static int getPositionFromUser(char [] board) {
        Scanner scanner = new Scanner (System.in);
        int position;
        do {
            System.out.println("enter position");
            position = scanner.nextInt();
            if (position<1 || position>9)
                System.out.println("position don't exist");
            else if(!isAvailable(board, position))
                System.out.println("position unavailable");

        } while(position<1 || position>9 || !isAvailable(board,position));

        return position;
    }

    public static char checkWinner(char[] board) {
        char winner = '-';
        for (int i=0; i<3; i=i+3) {
            if (board[i] == board[i+1] && board[i] == board[i+2])
                winner = board[i];
        }
        for (int i=0; i<3; i++) {
            if (board[i] == board[i+3] && board[i] == board[i+6])
                winner = board[i];
        }
        if (board[0] == board[4] && board[0] == board[8])
            winner = board[0];
        if (board[2] == board[4] && board[2] == board[6])
            winner = board[2];
        return winner;
    }

    public static boolean placeSymbolOnBoard(char[] board, int position, char symbol) {
        board[position-1] = symbol;
        printBoard(board);
        char winner = checkWinner(board);
        if (winner == 'x') {
            System.out.println("x won");
            return true;
        }
        else if(winner == '0') {
            System.out.println("0 won");
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        char[] board = {'1','2','3','4','5','6','7','8','9'};
        int position;
        int plays=0;
        boolean winner = false;
        printBoard(board);

        for (int i=0; !winner; i++) {
            plays++;
            char toPlace;
            if (i%2==0)
                toPlace = 'x';
            else {
                toPlace = '0';
            }
            position = getPositionFromUser(board);
            winner = placeSymbolOnBoard(board, position, toPlace);
            if (plays==9) {
                System.out.println("Game over");
                break;
            }
        }
    }
}
