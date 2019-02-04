package edu.jsu.mcis;

import java.awt.event.ActionListener;

import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import edu.jsu.mcis.TicTacToeModel.Mark;
import edu.jsu.mcis.TicTacToeModel.Result;

public class TicTacToeController implements ActionListener {

    private final TicTacToeModel model;
    private final TicTacToeView view;

    private int printXorO = 0;
    private int turn = 0;
    
    /* CONSTRUCTOR */

    public TicTacToeController(int width) {
        
        /* Initialize model, view, and width */

        model = new TicTacToeModel(width);
        view = new TicTacToeView(new TicTacToeController(width),width);
        
    }

    public void start() {
    
        /* MAIN LOOP (repeats until game is over) */

        /* Display the board using the View's "showBoard()", then use
           "getNextMove()" to get the next move from the player.  Enter
           the move (using the Model's "makeMark()", or display an error
           using the View's "showInputError()" if the move is invalid. */

        while (model.getResult().equals(Result.NONE)) {

            view.showBoard(model.toString());

           TicTacToeMove move = view.getNextMove(model.isXTurn());

        if (model.makeMark(move.getRow(),move.getCol()) == true) {
                
        }
        else view.showInputError();
    }
            /* After the game is over, show the final board and the winner */

            view.showBoard(model.toString());

            view.showResult(model.getResult().toString());
        

    }

    public String getMarkAsString(int row, int col) {        
        return (model.getMark(row, col).toString());        
    }
    
    public TicTacToeView getView() {        
        return view;        
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        turn++;
        
        if (e.getSource() instanceof JButton) {
            
            
            
            JButton button = (JButton)(e.getSource());
            
            if (printXorO % 2 == 0) {
            
                button.setText("X");
                view.getResultLabel().setText("O's Turn");
                button.setEnabled(false);
                
            }
            else {
                
                button.setText("O");
                view.getResultLabel().setText("X's Turn");
                button.setEnabled(false);
                
            }
        }
       
        printXorO++;
        
        
    }

}
