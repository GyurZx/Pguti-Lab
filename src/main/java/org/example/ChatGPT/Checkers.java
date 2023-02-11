package org.example.ChatGPT;
import java.util.Scanner;

// Пипец конечно, но работает пхахпахп
    public class Checkers {
        public static void main(String[] args) {
            int[][] board = new int[8][8];
            boolean playerOneTurn = true;
            Scanner sc = new Scanner(System.in);

            while (true) {
                // Print the board
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        System.out.print(board[i][j] + " ");
                    }
                    System.out.println();
                }

                // Get input from the current player
                System.out.print("Enter row (1-8) of piece to move: ");
                int fromRow = sc.nextInt() - 1;
                System.out.print("Enter column (1-8) of piece to move: ");
                int fromCol = sc.nextInt() - 1;
                System.out.print("Enter row (1-8) of square to move to: ");
                int toRow = sc.nextInt() - 1;
                System.out.print("Enter column (1-8) of square to move to: ");
                int toCol = sc.nextInt() - 1;

                // Check if the move is valid
                if (board[fromRow][fromCol] == 1 && playerOneTurn) {
                    if (toRow == fromRow + 1 && toCol == fromCol + 1) {
                        board[toRow][toCol] = 1;
                        board[fromRow][fromCol] = 0;
                        playerOneTurn = false;
                    } else {
                        System.out.println("Invalid move, try again.");
                    }
                } else if (board[fromRow][fromCol] == 2 && !playerOneTurn) {
                    if (toRow == fromRow - 1 && toCol == fromCol + 1) {
                        board[toRow][toCol] = 2;
                        board[fromRow][fromCol] = 0;
                        playerOneTurn = true;
                    } else {
                        System.out.println("Invalid move, try again.");
                    }
                } else {
                    System.out.println("Invalid move, try again.");
                }
            }
        }
    }

