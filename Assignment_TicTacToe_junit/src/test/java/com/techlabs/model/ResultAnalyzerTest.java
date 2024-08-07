package com.techlabs.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ResultAnalyzerTest {

    @Test
    void testResultAnalyzer() {
        Board board = new Board();
        ResultAnalyzer analyzer = new ResultAnalyzer(board);
        assertNotNull(analyzer);
        assertEquals(ResultType.PROGRESS, analyzer.getResult());
    }

    @Test
    void testAnalyzeResult() {
        Board board = new Board();
        ResultAnalyzer analyzer = new ResultAnalyzer(board);

        // Simulate a winning scenario
        try {
            board.setCellMark(0, MarkType.X);
            board.setCellMark(1, MarkType.X);
            board.setCellMark(2, MarkType.X);
        } catch (CellAlreadyMarkedException e) {
            fail("CellAlreadyMarkedException was thrown unexpectedly");
        }

        ResultType result = analyzer.analyzeResult();
        assertEquals(ResultType.WIN, result);
    }

    @Test
    void testGetResult() {
        Board board = new Board();
        ResultAnalyzer analyzer = new ResultAnalyzer(board);
        assertEquals(ResultType.PROGRESS, analyzer.getResult());

        try {
            board.setCellMark(0, MarkType.X);
            board.setCellMark(1, MarkType.X);
            board.setCellMark(2, MarkType.X);
        } catch (CellAlreadyMarkedException e) {
            fail("CellAlreadyMarkedException was thrown unexpectedly");
        }

        analyzer.analyzeResult();
        assertEquals(ResultType.WIN, analyzer.getResult());
    }

    @Test
    void testGetBoard() {
        Board board = new Board();
        ResultAnalyzer analyzer = new ResultAnalyzer(board);
        assertEquals(board, analyzer.getBoard());
    }
}
