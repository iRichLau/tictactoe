package com.thoughtworks.continuinglearning;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {
    public static void main(String [] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        PrintStream printStream = new PrintStream(System.out);
        Board board = new Board(System.out);
        board.drawBoard();
        Player playerOne = new Player(bufferedReader, printStream, board, "X");
        playerOne.makeAMove();
        board.drawBoard();
        Player playerTwo = new Player(bufferedReader, printStream, board, "O");
        playerTwo.makeAMove();
        board.drawBoard();

    }
}
