package edu.sdccd.miramar.cisc191;

import javafx.scene.control.Button;


public class GameBoard extends Board {
    private java.util.ArrayList<Button> interactableTiles;
    private boolean gameState;
    private String winner;

    public boolean isGameTied() {
        return false;
    }

    public boolean isGameEnded() {
        return false;
    }

    public boolean isSpotTaken() {
        return false;
    }

    public boolean isPlayerTurn() {
        return false;
    }

    public void detectThreePattern() {
    }

    public boolean isMoveValid() {
        return false;
    }

    public void displayWinner() {
    }

    public void displayMove(char piece) {
    }

    public void drawGraphics() {
    }

    public void clearPieces() {
    }

    public void displayPieceOnBoard() {
    }
}
