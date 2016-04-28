package com.thoughtworks.continuinglearning;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class BoardTest {
    private PrintStream printStream;
    private Board board;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        board = new Board(printStream);
    }

    @Test
    public void shouldDrawBoard() {
        board.drawBoard();

        verify(printStream).println(contains("1|"));
    }

    @Test
    public void shouldMarkBoardAtPositionOneWithX(){
        board.markBoard(1, "X");
        
    }

    @Test
    public void shouldMarkBoardAtPositionTwoWithO(){
        board.markBoard(2, "O");
    }
}