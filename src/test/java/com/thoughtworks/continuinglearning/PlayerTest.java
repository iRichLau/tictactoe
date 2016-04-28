package com.thoughtworks.continuinglearning;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertTrue;


public class PlayerTest {
    private BufferedReader bufferedReader;
    private PrintStream printStream;
    private Board currentBoard;

    @Test
    public void shouldMakeAMove() throws IOException {
        bufferedReader = mock(BufferedReader.class);
        printStream = mock(PrintStream.class);
        currentBoard = mock(Board.class);
        String marker = "X";
        Player player = new Player(bufferedReader, printStream, currentBoard, marker);
        userWillSelectOneAsAMove();

        player.makeAMove();

        verify(currentBoard).markBoard(1, "X");

    }

    private void userWillSelectOneAsAMove() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1");
    }
}