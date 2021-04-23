package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.canvas.*;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javax.swing.*;

/**
 *  Issues:
 *  readability
 *  Hardcoded assignments, makes difficult to change one thing(EX: Board size )
 *  Difficult to follow game progression, whos turn is it
 *
 *
 */

public class Main extends Application {
    private static GraphicsContext graphicsContext;
    //Used to draw board, x, and o.
    private Canvas canvas;

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


    @Override
    public void start(Stage primaryStage) throws Exception{
        //Will show the title of the game.
        Label title = new Label("Network Tic-Tac-Toe");
        //Determines the font size
        title.setFont(new Font(30));
        //Will show initial message to player1
        Label message = new Label("Player1 enter move.");
        message.setFont(new Font(30));
        //Determines the size of the board to draw on.
        canvas = new Canvas(600,600);
        //Draws the blank board.
        drawBoard();
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();

        //This listens and determines what space a user selected.
        //Spaces are 1-9 starting in the top left. Left to right. Top down.

        /**
         *
         *  LOGIC FRAMING BEGINS HERE
         *  THE ARGUMENTS ARE DEPENDENT ON WHERE THE LINES WERE DRAWN IN THE BOARD
         *  MOUSECLICKED.GETX RETURNS THE X AREA IN WHICH THE CURSOR HAS SELECTED
         *  CANVAS = BOARD WITH HEIGHT AND WIDTH
         *  MOUSE AREA SELECTION LOGIC: 9x9 BOARD, (3R,3C) formula: 1/3 * WIDTH = NORTHWESTERN MOST BOX
         *
         *  FOR LOGIC CLASS IMPLEMENTATION IN THE MAIN: LET THE USER CLICK ON AN AREA
         *  THE CLICK ARGUMENT(mX, mY) WILL BE TAKEN INTO THE LOGIC CLASS AND PERFORM CALCULATIONS
         *  THE CALCULATION WILL BE RETURNED TO THE MAIN AND PROPERLY PERFORM AN ACTION
         */
        canvas.setOnMouseClicked(e -> {
            Logic.determineCursorLocation(e);
        });
/**
 *  END CURSOR SELECTION LOGIC
 *  -----------------------------------------
 *  BEGIN DRAW METHODS
 */


        //Used to align title
        HBox alignTitle = new HBox(title);
        alignTitle.setAlignment(Pos.CENTER);

        //Used to align messages to player.
        HBox alignMessage = new HBox(message);
        alignMessage.setAlignment(Pos.CENTER);

        //Used to align everything
        BorderPane root = new BorderPane(canvas);
        root.setStyle("-fx-border-color: black; -fx-border-width: 2px");
        root.setTop(alignTitle);
        root.setBottom(alignMessage);

        //Shows window
        Scene scene = new Scene(root, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tic-Tac-Toe Board");
        primaryStage.setResizable(false);
        primaryStage.show();

    }

    public void drawBoard(){ //Draws the initial blank board.

        double width = canvas.getWidth();
        double height = canvas.getHeight();

        graphicsContext.setFill(Color.WHITE);
        //Line 1 vertical
        graphicsContext.strokeLine(200,0,200,600);
        //Line 2 vertical
        graphicsContext.strokeLine(400,0,400,600);
        //Line 1 horizontal
        graphicsContext.strokeLine(0,200,600,200);
        //Line 2 horizontal
        graphicsContext.strokeLine(0,400,600,400);
    };
    public static void drawSpace1x(){
        //first slanted line for x
        graphicsContext.strokeLine(0,0,200,200);
        graphicsContext.strokeLine(0,200,200,0);
    };
    public static void drawSpace2x(){
        //first slanted line for x
        graphicsContext.strokeLine(200,0,400,200);
        graphicsContext.strokeLine(400,0,200,200);
    };
    public static void drawSpace3x(){
        //first slanted line for x
        graphicsContext.strokeLine(400,0,600,200);
        graphicsContext.strokeLine(600,0,400,200);
    };
    public static void drawSpace4x(){
        //first slanted line for x
        graphicsContext.strokeLine(0,200,200,400);
        graphicsContext.strokeLine(200,200,0,400);
    };
    public static void drawSpace5x(){
        //first slanted line for x
        graphicsContext.strokeLine(200,200,400,400);
        graphicsContext.strokeLine(400,200,200,400);
    };
    public static void drawSpace6x(){
        //first slanted line for x
        graphicsContext.strokeLine(400,200,600,400);
        graphicsContext.strokeLine(600,200,400,400);
    };
    public static void drawSpace7x(){
        //first slanted line for x
        graphicsContext.strokeLine(0,400,200,600);
        graphicsContext.strokeLine(200,400,0,600);
    };
    public static void drawSpace8x(){
        //first slanted line for x
        graphicsContext.strokeLine(200,400,400,600);
        graphicsContext.strokeLine(400,400,200,600);
    };
    public static void drawSpace9x(){
        //first slanted line for x
        graphicsContext.strokeLine(400,400,600,600);
        graphicsContext.strokeLine(600,400,400,600);
    };
    public static void drawSpace1o(){
        //draws the o
        graphicsContext.strokeOval(0,0,200,200);
    };
    public static void drawSpace2o(){
        //draws the o
        graphicsContext.strokeOval(200,0,200,200);
    };
    public static void drawSpace3o(){
        //draws the o
        graphicsContext.strokeOval(400,0,200,200);
    };
    public static void drawSpace4o(){
        //draws the o
        graphicsContext.strokeOval(0,200,200,200);
    };
    public static void drawSpace5o(){
        //draws the o
        graphicsContext.strokeOval(200,200,200,200);
    };
    public static void drawSpace6o(){
        //draws the o
        graphicsContext.strokeOval(400,200,200,200);
    };
    public static void drawSpace7o(){
        //draws the o
        graphicsContext.strokeOval(0,400,200,200);
    };
    public static void drawSpace8o(){
        //draws the o
        graphicsContext.strokeOval(200,400,200,200);
    };
    public static void drawSpace9o(){
        //draws the o
        graphicsContext.strokeOval(400,400,200,200);
    };

    public static void isSpaceTaken() {
        if (space1x || space1o) {
            space1 = true;
        }
        if (space2x || space2o) {
            space2 = true;
        }
        if (space3x || space3o) {
            space3 = true;
        }
        if (space4x || space4o) {
            space4 = true;
        }
        if (space5x || space5o) {
            space5 = true;
        }
        if (space6x || space6o) {
            space6 = true;
        }
        if (space7x || space7o) {
            space7 = true;
        }
        if (space8x || space8o) {
            space8 = true;
        }
        if (space9x || space9o) {
            space9 = true;
        }
    };
    public static void isTie(){
        if (space1 && space2 && space3 && space4 && space5 && space6 && space7 && space8 && space9){
            JFrame frame = new JFrame("Net Tic-Tac-Toe Winner");
            JOptionPane.showMessageDialog(frame, "There is a tie nobody wins!");
            System.exit(0);
        }
    };


    public static void is1winner(){
        if (space1x && space2x && space3x){
            player1Winner  = true;
        }
        else if (space1x && space5x && space9x){
            player1Winner  = true;
        }
        else if (space1x && space4x && space7x){
            player1Winner  = true;
        }
        else if (space2x && space5x && space8x){
            player1Winner  = true;
        }
        else if (space3x && space6x && space9x){
            player1Winner  = true;
        }
        else if (space3x && space5x && space7x){
            player1Winner  = true;
        }
        else if (space4x && space5x && space6x){
            player1Winner  = true;
        }
        else if (space7x && space8x && space9x){
            player1Winner  = true;
        }

    };
    public static void is2winner(){
        if (space1o && space2o && space3o){
            player2Winner  = true;
        }
        else if (space1o && space5o && space9o){
            player2Winner  = true;
        }
        else if (space1o && space4o && space7o){
            player2Winner  = true;
        }
        else if (space2o && space5o && space8o){
            player2Winner  = true;
        }
        else if (space3o && space6o && space9o){
            player2Winner  = true;
        }
        else if (space3o && space5o && space7o){
            player2Winner  = true;
        }
        else if (space4o && space5o && space6o){
            player2Winner  = true;
        }
        else if (space7o && space8o && space9o){
            player2Winner  = true;
        }

    };

    public double getCanvasWidth()
    {
        return canvas.getWidth();
    }
    public double getCanvasHeight()
    {
        return canvas.getHeight();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
