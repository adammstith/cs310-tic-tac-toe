package edu.jsu.mcis;

<<<<<<< HEAD
import java.awt.event.ActionListener;

import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import edu.jsu.mcis.TicTacToeModel.Mark;
import edu.jsu.mcis.TicTacToeModel.Result;

=======
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//import edu.jsu.mcis.TicTacToeModel.Mark;
//import edu.jsu.mcis.TicTacToeModel.Result;

>>>>>>> GUI
public class TicTacToeController implements ActionListener {

    private final TicTacToeModel model;
    private final TicTacToeView view;

<<<<<<< HEAD
    private int printXorO = 0;
    private int turn = 0;
    
=======
>>>>>>> GUI
    /* CONSTRUCTOR */

    public TicTacToeController(int width) {
        
        /* Initialize model, view, and width */

        model = new TicTacToeModel(width);
<<<<<<< HEAD
        view = new TicTacToeView(new TicTacToeController(width),width);
=======
        view = new TicTacToeView(this,width);
>>>>>>> GUI
        
    }

    

    public String getMarkAsString(int row, int col) {        
        
        return (model.getMark(row, col).toString());

    }
    
    public TicTacToeView getView() {        
       
        return view;  

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        JButton button = (JButton)(e.getSource());
        int row = (int) (button.getName().charAt(6)) - 48;
        int col = (int) (button.getName().charAt(7)) - 48;
            
        

        if (!model.isGameover()) {
            
            model.makeMark(row,col);
            button.setText(model.getMark(row,col).toString());
        
        if (model.getResult().toString() == "X" || model.getResult().toString() == "O") {
            
            view.showResult(model.getResult().toString().toUpperCase());
        
            }

        if (model.getResult().toString() == "TIE") {

            view.showResult(model.getResult().toString().toUpperCase());

            }
        
        }
        
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
