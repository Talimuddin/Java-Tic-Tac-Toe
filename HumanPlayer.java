import java.util.Scanner;

public class HumanPlayer extends Player {

    public HumanPlayer(String name, char mark) {
        this.name = name;
        this.mark = mark;
    }

    void makeMove() {
        Scanner scan = new Scanner(System.in);
        int row;
        int col;
        do {
            System.out.println("Enter the row and col (0-2):");
            row = scan.nextInt();
            col = scan.nextInt();
            if (!isValidMove(row, col)) {
                System.out.println("Invalid move, try again.");
            }
        } while (!isValidMove(row, col));

        TicTacToe.placeMark(row, col, mark);
    }
}