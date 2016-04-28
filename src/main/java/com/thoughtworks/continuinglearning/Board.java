package com.thoughtworks.continuinglearning;


import java.io.PrintStream;
import java.util.ArrayList;

public class Board {
    private PrintStream printStream;
    private ArrayList<String> grid;

    public Board(PrintStream printStream) {

        this.printStream = printStream;
        this.grid = new ArrayList<>();
        grid.add("1");
        grid.add("2");
        grid.add("3");
        grid.add("4");
        grid.add("5");
        grid.add("6");
        grid.add("7");
        grid.add("8");
        grid.add("9");
    }

    public void drawBoard() {
        for(String number : grid) {
            printStream.print(number + "|");
        }
    }

    public void markBoard(int playerInput, String playerMarker) {
        int playerInputPosition = playerInput - 1;
        grid.set(playerInputPosition, playerMarker);
        }
    }


