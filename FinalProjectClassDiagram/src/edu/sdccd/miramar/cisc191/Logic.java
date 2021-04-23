package sample;

import javax.swing.*;
import javafx.scene.input.MouseEvent;

public class Logic extends Main
{
    /**
     *
     *  LOGIC FRAMING BEGINS HERE
     *  THE ARGUMENTS ARE DEPENDENT ON WHERE THE LINES WERE DRAWN IN THE BOARD
     *  MOUSECLICKED.GETX RETURNS THE X AREA IN WHICH THE CURSOR HAS SELECTED
     *  CANVAS = BOARD WITH HEIGHT AND WIDTH
     *  MOUSE AREA SELECTION LOGIC: 9x9 BOARD, (3R,3C) formula: 1/3 * WIDTH = NORTHWESTERN MOST BOX
     */
    //Used to keep track of player turn.
    static boolean player1Turn = true;
    static boolean player2Turn = false;

    //Used to detect winner.
    static boolean player1Winner = false;
    static boolean player2Winner = false;

    static boolean space1 = false;
    static boolean space2 = false;
    static boolean space3 = false;
    static boolean space4 = false;
    static boolean space5 = false;
    static boolean space6 = false;
    static boolean space7 = false;
    static boolean space8 = false;
    static boolean space9 = false;

    static boolean space1o = false;
    static boolean space2o = false;
    static boolean space3o = false;
    static boolean space4o = false;
    static boolean space5o = false;
    static boolean space6o = false;
    static boolean space7o = false;
    static boolean space8o = false;
    static boolean space9o = false;

    static boolean space1x = false;
    static boolean space2x = false;
    static boolean space3x = false;
    static boolean space4x = false;
    static boolean space5x = false;
    static boolean space6x = false;
    static boolean space7x = false;
    static boolean space8x = false;
    static boolean space9x = false;


    public static void determineCursorLocation(MouseEvent e){
        if (e.getX() < 200 && e.getY() < 200) { //checks if user clicked on space 1.
            //Checks if space is taken. This will have to be sent to server.
            isSpaceTaken();

            //if it is not taken and it is player1's turn then the space is updated with an x.
            if (player1Turn && !space1) {
                space1x = true;
                drawSpace1x();
                //checks if player1 is winner.
                is1winner();
                //if player 1 is winner it will display it and end the game.
                if (player1Winner) {
                    JFrame frame = new JFrame("NetTicTacToe Winner");
                    JOptionPane.showMessageDialog(frame, "Player 1 wins!");
                    System.exit(0);
                }
                isSpaceTaken();
                isTie();
                message.setText("Player 1 selected space 1. Player 2 turn.");
                player1Turn = false;
            }
            if (player2Turn && !space1) {
                space1o = true;
                drawSpace1o();
                //checks if player2 is winner.
                is2winner();
                //if player 1 is winner it will display it and end the game.
                if (player2Winner) {
                    JFrame frame = new JFrame("NetTicTacToe Winner");
                    JOptionPane.showMessageDialog(frame, "Player 2 wins!");
                    System.exit(0);
                }
                isSpaceTaken();
                isTie();
                message.setText("Player 2 selected space 1. Player 1 turn.");
                player2Turn = false;
                player1Turn = true;
            }
            if (player1Turn == false) {
                player2Turn = true;
            }
        } else if (e.getX() > 200 && e.getX() < 400 && e.getY() < 200) { //checks if user clicked on space 2.
            //Checks if space is taken.
            isSpaceTaken();
            //if it is not taken and it is player1's turn then the space is updated with an x.
            if (player1Turn && !space2) {
                space2x = true;
                drawSpace2x();
                //checks if player1 is winner.
                is1winner();
                //if player 1 is winner it will display it and end the game.
                if (player1Winner) {
                    JFrame frame = new JFrame("NetTicTacToe Winner");
                    JOptionPane.showMessageDialog(frame, "Player 1 wins!");
                    System.exit(0);
                }
                isSpaceTaken();
                isTie();
                message.setText("Player 1 selected space 2. Player 2 turn.");
                player1Turn = false;
            }
            if (player2Turn && !space2) {
                space2o = true;
                drawSpace2o();
                //checks if player2 is winner.
                is2winner();
                //if player 1 is winner it will display it and end the game.
                if (player2Winner) {
                    JFrame frame = new JFrame("NetTicTacToe Winner");
                    JOptionPane.showMessageDialog(frame, "Player 2 wins!");
                    System.exit(0);
                }
                isSpaceTaken();
                isTie();
                message.setText("Player 2 selected space 2. Player 1 turn.");
                player2Turn = false;
                player1Turn = true;
            }
            if (!player1Turn) {
                player2Turn = true;
            }
        }
        if (e.getX() > 400 && e.getX() < 600 && e.getY() < 200) { //checks if user clicked on space 3.
            //Checks if space is taken.
            isSpaceTaken();
            //if it is not taken and it is player1's turn then the space is updated with an x.
            if (player1Turn && !space3) {
                space3x = true;
                drawSpace3x();
                //checks if player1 is winner.
                is1winner();
                //if player 1 is winner it will display it and end the game.
                if (player1Winner) {
                    JFrame frame = new JFrame("NetTicTacToe Winner");
                    JOptionPane.showMessageDialog(frame, "Player 1 wins!");
                    System.exit(0);
                }
                isSpaceTaken();
                isTie();
                message.setText("Player 1 selected space 3. Player 2 turn.");
                player1Turn = false;
            }
            if (player2Turn && !space3) {
                space3o = true;
                drawSpace3o();
                //checks if player2 is winner.
                is2winner();
                //if player 1 is winner it will display it and end the game.
                if (player2Winner) {
                    JFrame frame = new JFrame("NetTicTacToe Winner");
                    JOptionPane.showMessageDialog(frame, "Player 2 wins!");
                    System.exit(0);
                }
                isSpaceTaken();
                isTie();
                message.setText("Player 2 selected space 3. Player 1 turn.");
                player2Turn = false;
                player1Turn = true;
            }
            if (!player1Turn) {
                player2Turn = true;
            }
        }
        if (e.getX() < 200 && e.getY() < 400 && e.getY() > 200) { //checks if user clicked on space 4.
            //Checks if space is taken.
            isSpaceTaken();
            //if it is not taken and it is player1's turn then the space is updated with an x.
            if (player1Turn && !space4) {
                space4x = true;
                drawSpace4x();
                //checks if player1 is winner.
                is1winner();
                //if player 1 is winner it will display it and end the game.
                if (player1Winner) {
                    JFrame frame = new JFrame("NetTicTacToe Winner");
                    JOptionPane.showMessageDialog(frame, "Player 1 wins!");
                    System.exit(0);
                }
                isSpaceTaken();
                isTie();
                message.setText("Player 1 selected space 4. Player 2 turn.");
                player1Turn = false;
            }
            if (player2Turn && !space4) {
                space4o = true;
                drawSpace4o();
                //checks if player2 is winner.
                is2winner();
                //if player 1 is winner it will display it and end the game.
                if (player2Winner) {
                    JFrame frame = new JFrame("NetTicTacToe Winner");
                    JOptionPane.showMessageDialog(frame, "Player 2 wins!");
                    System.exit(0);
                }
                isSpaceTaken();
                isTie();
                message.setText("Player 2 selected space 4. Player 1 turn.");
                player2Turn = false;
                player1Turn = true;
            }
            if (!player1Turn) {
                player2Turn = true;
            }
        }
        if (e.getX() > 200 && e.getX() < 400 && e.getY() > 200 && e.getY() < 400) { //checks if user clicked on space 5.
            //Checks if space is taken.
            isSpaceTaken();
            //if it is not taken and it is player1's turn then the space is updated with an x.
            if (player1Turn && !space5) {
                space5x = true;
                drawSpace5x();
                //checks if player1 is winner.
                is1winner();
                //if player 1 is winner it will display it and end the game.
                if (player1Winner) {
                    JFrame frame = new JFrame("NetTicTacToe Winner");
                    JOptionPane.showMessageDialog(frame, "Player 1 wins!");
                    System.exit(0);
                }
                isSpaceTaken();
                isTie();
                message.setText("Player 1 selected space 5. Player 2 turn.");
                player1Turn = false;
            }
            if (player2Turn && !space5) {
                space5o = true;
                drawSpace5o();
                //checks if player2 is winner.
                is2winner();
                //if player 1 is winner it will display it and end the game.
                if (player2Winner) {
                    JFrame frame = new JFrame("NetTicTacToe Winner");
                    JOptionPane.showMessageDialog(frame, "Player 2 wins!");
                    System.exit(0);
                }
                isSpaceTaken();
                isTie();
                message.setText("Player 2 selected space 5. Player 1 turn.");
                player2Turn = false;
                player1Turn = true;
            }
            if (!player1Turn) {
                player2Turn = true;
            }
        }
        if (e.getX() > 400 && e.getX() < 600 && e.getY() > 200 && e.getY() < 400) { //checks if user clicked on space 6.
            //Checks if space is taken.
            isSpaceTaken();
            //if it is not taken and it is player1's turn then the space is updated with an x.
            if (player1Turn && !space6) {
                space6x = true;
                drawSpace6x();
                //checks if player1 is winner.
                is1winner();
                //if player 1 is winner it will display it and end the game.
                if (player1Winner) {
                    JFrame frame = new JFrame("NetTicTacToe Winner");
                    JOptionPane.showMessageDialog(frame, "Player 1 wins!");
                    System.exit(0);
                }
                isSpaceTaken();
                isTie();
                message.setText("Player 1 selected space 6. Player 2 turn.");
                player1Turn = false;
            }
            if (player2Turn && !space6) {
                space6o = true;
                drawSpace6o();
                //checks if player2 is winner.
                is2winner();
                //if player 1 is winner it will display it and end the game.
                if (player2Winner) {
                    JFrame frame = new JFrame("NetTicTacToe Winner");
                    JOptionPane.showMessageDialog(frame, "Player 2 wins!");
                    System.exit(0);
                }
                isSpaceTaken();
                isTie();
                message.setText("Player 2 selected space 6. Player 1 turn.");
                player2Turn = false;
                player1Turn = true;
            }
            if (!player1Turn) {
                player2Turn = true;
            }
        }
        if (e.getX() > 0 && e.getX() < 200 && e.getY() > 400 && e.getY() < 600) { //checks if user clicked on space 7.
            //Checks if space is taken.
            isSpaceTaken();
            //if it is not taken and it is player1's turn then the space is updated with an x.
            if (player1Turn && !space7) {
                space7x = true;
                drawSpace7x();
                //checks if player1 is winner.
                is1winner();
                //if player 1 is winner it will display it and end the game.
                if (player1Winner) {
                    JFrame frame = new JFrame("NetTicTacToe Winner");
                    JOptionPane.showMessageDialog(frame, "Player 1 wins!");
                    System.exit(0);
                }
                isSpaceTaken();
                isTie();
                message.setText("Player 1 selected space 7. Player 2 turn.");
                player1Turn = false;
            }
            if (player2Turn && !space7) {
                space7o = true;
                drawSpace7o();
                //checks if player2 is winner.
                is2winner();
                //if player 1 is winner it will display it and end the game.
                if (player2Winner) {
                    JFrame frame = new JFrame("NetTicTacToe Winner");
                    JOptionPane.showMessageDialog(frame, "Player 2 wins!");
                    System.exit(0);
                }
                isSpaceTaken();
                isTie();
                message.setText("Player 2 selected space 7. Player 1 turn.");
                player2Turn = false;
                player1Turn = true;
            }
            if (!player1Turn) {
                player2Turn = true;
            }
        }
        if (e.getX() > 200 && e.getX() < 400 && e.getY() > 400 && e.getY() < 600) { //checks if user clicked on space 8.
            //Checks if space is taken.
            isSpaceTaken();
            //if it is not taken and it is player1's turn then the space is updated with an x.
            if (player1Turn && !space8) {
                space8x = true;
                drawSpace8x();
                //checks if player1 is winner.
                is1winner();
                //if player 1 is winner it will display it and end the game.
                if (player1Winner) {
                    JFrame frame = new JFrame("NetTicTacToe Winner");
                    JOptionPane.showMessageDialog(frame, "Player 1 wins!");
                    System.exit(0);
                }
                isSpaceTaken();
                isTie();
                message.setText("Player 1 selected space 8. Player 2 turn.");
                player1Turn = false;
            }
            if (player2Turn && !space8) {
                space8o = true;
                drawSpace8o();
                //checks if player2 is winner.
                is2winner();
                //if player 1 is winner it will display it and end the game.
                if (player2Winner) {
                    JFrame frame = new JFrame("NetTicTacToe Winner");
                    JOptionPane.showMessageDialog(frame, "Player 2 wins!");
                    System.exit(0);
                }
                isSpaceTaken();
                isTie();
                message.setText("Player 2 selected space 8. Player 1 turn.");
                player2Turn = false;
                player1Turn = true;
            }
            if (!player1Turn) {
                player2Turn = true;
            }
        }
        if (e.getX() > 400 && e.getX() < 600 && e.getY() > 400 && e.getY() < 600) { //checks if user clicked on space 9.
            //Checks if space is taken.
            isSpaceTaken();
            //if it is not taken and it is player1's turn then the space is updated with an x.
            if (player1Turn && !space9) {
                space9x = true;
                drawSpace9x();
                //checks if player1 is winner.
                is1winner();
                //if player 1 is winner it will display it and end the game.
                if (player1Winner) {
                    JFrame frame = new JFrame("NetTicTacToe Winner");
                    JOptionPane.showMessageDialog(frame, "Player 1 wins!");
                    System.exit(0);
                }
                isSpaceTaken();
                isTie();
                message.setText("Player 1 selected space 9. Player 2 turn.");
                player1Turn = false;
            }
            if (player2Turn && !space9) {
                space9o = true;
                drawSpace9o();
                //checks if player2 is winner.
                is2winner();
                //if player 1 is winner it will display it and end the game.
                if (player2Winner) {
                    JFrame frame = new JFrame("NetTicTacToe Winner");
                    JOptionPane.showMessageDialog(frame, "Player 2 wins!");
                    System.exit(0);
                }
                isSpaceTaken();
                isTie();
                message.setText("Player 2 selected space 9. Player 1 turn.");
                player2Turn = false;
                player1Turn = true;
            }
            if (!player1Turn) {
                player2Turn = true;
            }
        }
    }

}