package com.techlabs.model;

public class ResultAnalyzer {
    private Board board;
    private ResultType result;

    public ResultAnalyzer(Board board) {
        this.board = board;
        this.result = ResultType.PROGRESS;
    }

    private void horizontalWinCheck() {
        Cell[] cells = board.getCells();
        for (int i = 0; i < 9; i += 3) {
            if (cells[i].getMark() == cells[i + 1].getMark() && 
                cells[i + 1].getMark() == cells[i + 2].getMark() &&
                cells[i].getMark() != MarkType.EMPTY) {
                result = ResultType.WIN;
            }
        }
    }

    private void verticalWinCheck() {
        Cell[] cells = board.getCells();
        for (int i = 0; i < 3; i++) {
            if (cells[i].getMark() == cells[i + 3].getMark() && 
                cells[i + 3].getMark() == cells[i + 6].getMark() &&
                cells[i].getMark() != MarkType.EMPTY) {
                result = ResultType.WIN;
            }
        }
    }

    private void diagonalWinCheck() {
        Cell[] cells = board.getCells();
        if ((cells[0].getMark() == cells[4].getMark() && 
             cells[4].getMark() == cells[8].getMark() ||
             cells[2].getMark() == cells[4].getMark() && 
             cells[4].getMark() == cells[6].getMark()) &&
            cells[4].getMark() != MarkType.EMPTY) {
            result = ResultType.WIN;
        }
    }

    public ResultType analyzeResult() {
        horizontalWinCheck();
        verticalWinCheck();
        diagonalWinCheck();
        if (result != ResultType.WIN && board.isBoardFull()) {
            result = ResultType.DRAW;
        }
        return result;
    }

    public ResultType getResult() {
        return result;
    }

    public Board getBoard() {
        return board;
    }
}
