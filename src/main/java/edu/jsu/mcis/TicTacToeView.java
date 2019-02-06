package edu.jsu.mcis;

import java.awt.*;
import java.awt.event.ActionListener;
<<<<<<< HEAD

import javax.swing.*;

public class TicTacToeView extends JPanel {

    private final TicTacToeController controller;

    private final JButton[][] board;
    private final JPanel squaresPanel;
    private final JLabel resultLabel;

    public TicTacToeView(TicTacToeController controller, int width) {

        this.controller = controller;
=======

import javax.swing.*;

public class TicTacToeView extends JPanel {

    private final JButton[][] board;
    private final JPanel squaresPanel;
    private final JLabel resultLabel;

    public TicTacToeView(TicTacToeController controller, int width) {

        
>>>>>>> GUI

        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        board = new JButton[width][width];
        squaresPanel = new JPanel(new GridLayout(width, width));
        resultLabel = new JLabel();
        resultLabel.setName("ResultLabel");

        for (int row = 0; row < width; row++) {

            for (int col = 0; col < width; col++) {

                board[row][col] = new JButton();
<<<<<<< HEAD
                board[row][col].addActionListener(controller);
=======
                board[row][col].addActionListener((ActionListener) controller);
>>>>>>> GUI
                board[row][col].setName("Square" + row + col);
                board[row][col].setPreferredSize(new Dimension(64,64));
                squaresPanel.add(board[row][col]);
                
            }
            
        }

        this.add(squaresPanel);
        this.add(resultLabel);
        
        resultLabel.setText("Welcome to Tic-Tac-Toe!");

    }
        
    public void updateSquares() {

        /* Refresh the GUI with updated data from the Model (via the Controller) */

<<<<<<< HEAD
        // INSERT YOUR CODE HERE
=======
        // Did not use. I did not need it
>>>>>>> GUI

    }
    
    public void disableSquares() {
<<<<<<< HEAD

        /* Disable buttons (to disallow input after game is over) */
    
        // INSERT YOUR CODE HERE
=======

        /* Disable buttons (to disallow input after game is over) */
    
        for (int row = 0; row < getWidth(); row++) {

            for (int col = 0; col < getWidth(); col++) {

            board[row][col].setEnabled(false);

            }    
            
        } 
>>>>>>> GUI
            
    }
        
    public void showResult(String message) {
        
        resultLabel.setText(message);
        
    }
    
    public void clearResult() {
        
        resultLabel.setText(" ");
        
    }

<<<<<<< HEAD
}
=======
}
>>>>>>> GUI
