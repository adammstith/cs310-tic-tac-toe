package edu.jsu.mcis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import edu.jsu.mcis.TicTacToeModel.Mark;
import edu.jsu.mcis.TicTacToeModel.Result;

public class TicTacToeController implements ActionListener {

    private final TicTacToeModel model;
    private final TicTacToeView view;
    private final TicTacToeController controller = new TicTacToeController(3);
    /* CONSTRUCTOR */

    public TicTacToeController(int width) {
        
        /* Initialize model, view, and width */
        
        model = new TicTacToeModel(width);
        view = new TicTacToeView(controller,width);
        
    }

    

    public String getMarkAsString(int row, int col) {        
        return (model.getMark(row, col).toString());        
    }
    
    public TicTacToeView getView() {        
        return view;        
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        
        this.actionPerformed(event);
    }

}
