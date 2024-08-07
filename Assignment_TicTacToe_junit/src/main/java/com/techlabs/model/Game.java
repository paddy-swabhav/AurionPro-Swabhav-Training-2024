package com.techlabs.model;

public class Game {
    private Player currentPlayer;
    private Player[] players;
    private Board board;
    private ResultAnalyzer analyzer;
    private ResultType result = ResultType.PROGRESS;

    public Game(Player[] players, Board board, ResultAnalyzer analyzer) {
        this.players = players;
        this.board = board;
        this.analyzer = analyzer;
        this.currentPlayer = players[0];
    }

    public void play(int loc) {
        try {
            board.setCellMark(loc, currentPlayer.getMark());
            result = analyzer.analyzeResult();
            if (result == ResultType.PROGRESS) {
                switchCurrentPlayer();
            }
        } catch (CellAlreadyMarkedException e) {
            System.out.println(e.getMessage());
        }
    }

    private void switchCurrentPlayer() {
        currentPlayer = (currentPlayer == players[0]) ? players[1] : players[0];
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }
}
