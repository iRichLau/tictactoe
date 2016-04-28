package com.thoughtworks.continuinglearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Player {

    private BufferedReader bufferedReader;
    private PrintStream printStream;
    private Board currentBoard;
    private String marker;

    public Player(BufferedReader bufferedReader, PrintStream printStream, Board currentBoard, String marker) {

        this.bufferedReader = bufferedReader;
        this.printStream = printStream;
        this.currentBoard = currentBoard;
        this.marker = marker;
    }
    private String getBufferedReaderInput() {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void makeAMove() {
        printStream.println("Make a move: ");
        int playerInput = Integer.parseInt(getBufferedReaderInput());
        currentBoard.markBoard(playerInput, marker);

    }
}
