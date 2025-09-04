import java.util.Scanner; 
public class main {

    static int occu = 0;
    static boolean gameEnd = false;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int user1, user2;
        String[] board = {"_", "_", "_", "_", "_", "_", "_", "_", "_"};
                    
        //print board;
        printboard(board);
        while (!gameEnd) {
            //userInput
            boolean valid1 = false;
            while (!valid1 && !gameEnd) {
                System.out.print("player1 pos: ");
                user1 = s.nextInt();
                if (board[user1 - 1].equals("_")) {
                    valid1 = true;
                    board[user1 - 1] = "O";
                    occu++;
                    cheackwin(board);
                    clearScreen();
                    printboard(board);
                } else {
                    //not valid
                    valid1 = false;
                    clearScreen();
                    System.out.println("invaid pos, try again: ");
                    printboard(board);
                }
            }

            boolean valid2 = false;
            while (!valid2 && !gameEnd) {
                System.out.print("player2 pos: ");
                user2 = s.nextInt();
                if (board[user2 - 1].equals("_")) {
                    valid2 = true;
                    board[user2 - 1] = "X";
                    occu++;
                    cheackwin(board);
                    clearScreen();
                    printboard(board);
                } else {
                    //not valid
                    valid2 = false;
                    clearScreen();
                    System.out.println("invaid pos, try again: ");
                    printboard(board);
                }
     
            }

        }
        s.close();
        cheackwin(board);
        System.out.println("\n\nGame Over!");

    }
    
    static void printboard(String[] board){
        for (int i = 0; i <= 8; i++) {
            System.out.print("| " + board[i] + " ");
            if (i == 2 | i == 5 | i == 8) {
                System.out.print("|");
                System.out.println("");
            }
        }
    }

    static void cheackwin(String[] c) {
        String winner = win(c);
        if (winner.equals("O")) {
            System.out.println("\nPlayer 1 won");
            gameEnd = true;
        }
        if (winner.equals("X")) {
            System.out.println("\nPlayer 2 won");
            gameEnd = true;
        }
        if (winner.equals("D") && occu == 9) {
            System.out.println("\nDraw");
            gameEnd = true;
        }
    }

    static String win(String[] b) {
        if (b[0].equals(b[1]) && b[1].equals(b[2])) {
            return b[0];
        }
        if (b[3].equals(b[4]) && b[4].equals(b[5])) {
            return b[3];
        }
        if (b[6].equals(b[7]) && b[7].equals(b[8])) {
            return b[6];
        }

        if (b[0].equals(b[3]) && b[3].equals(b[6])) {
            return b[0];
        }
        if (b[1].equals(b[4]) && b[4].equals(b[7])) {
            return b[1];
        }
        if (b[2].equals(b[5]) && b[5].equals(b[8])) {
            return b[2];
        }

        if (b[0].equals(b[4]) && b[4].equals(b[8])) {
            return b[0];
        }
        if (b[2].equals(b[4]) && b[4].equals(b[6])) {
            return b[2];
        }

        return "D";
    }

    public final static void clearScreen() {
        try {
            final String os = System.getProperty("os.name").toLowerCase();
            ProcessBuilder pb;

            if (os.contains("windows")) {
                pb = new ProcessBuilder("cmd", "/c", "cls");
            } else {
                pb = new ProcessBuilder("clear");
            }

            pb.inheritIO().start().waitFor();
        } catch (final Exception e) {
            System.err.println("Error clearing console: " + e.getMessage());
        }
    }
}