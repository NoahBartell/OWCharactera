package Classes;
import java.awt.event.*;

public class AL implements ActionListener {
    //fields  
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        //CharList list = new CharList();

        if(source == Main.gui.rollButton){
            Main.Roll();
        }
        if(source == Main.gui.resetButton){
            Main.Reset();
        }
    }
}

