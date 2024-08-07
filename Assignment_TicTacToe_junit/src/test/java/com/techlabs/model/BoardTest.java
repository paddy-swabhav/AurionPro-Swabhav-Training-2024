package com.techlabs.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoardTest {

    @Test
    void testBoard() {
        Board board = new Board();
        assertNotNull(board);
        assertEquals(9, board.getCells().length);
        for (Cell cell : board.getCells()) {
            assertEquals(MarkType.EMPTY, cell.getMark());
        }
    }

    @Test
    void testIsBoardFull() {
        Board board = new Board();
        assertFalse(board.isBoardFull());

        // Mark all cells to make the board full
        try {
            for (int i = 0; i < 9; i++) {
                board.setCellMark(i, MarkType.X);
            }
        } catch (CellAlreadyMarkedException e) {
            e.printStackTrace();
        }

        assertTrue(board.isBoardFull());
    }

    @Test
    void testSetCellMark() {
        Board board = new Board();
        try {
            board.setCellMark(0, MarkType.X);
            assertEquals(MarkType.X, board.getCells()[0].getMark());

            assertThrows(CellAlreadyMarkedException.class, () -> {
                board.setCellMark(0, MarkType.O);
            });
        } catch (CellAlreadyMarkedException e) {
            fail("CellAlreadyMarkedException was thrown unexpectedly");
        }
    }

    @Test
    void testGetCells() {
        Board board = new Board();
        assertNotNull(board.getCells());
        assertEquals(9, board.getCells().length);
    }
}
