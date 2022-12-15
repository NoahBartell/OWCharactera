package Classes;
import javax.swing.*;
import java.awt.*;


public class MyGUI extends JFrame{
    //Fields
    AL al = new AL();
    //labels
    JLabel label = new JLabel();
    JTextArea textArea = new JTextArea();
    //buttons
    JButton rollButton = new JButton("Roll");
    JButton resetButton = new JButton("Reset");
    //textfields

    public MyGUI(){
        setSize(1000,500);
        setTitle("MyGUI");
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void set(){
        // label.setText("");
        // Font textFont = new Font("Serif", Font.PLAIN, 30);
        // label.setFont(textFont);

        textArea.setText("");
        Font textFont = new Font("Serif", Font.PLAIN, 30);
        textArea.setFont(textFont);

        Font buttonFont = new Font("Serif", Font.BOLD, 100);
        rollButton.setFont(buttonFont);
        //rollButton.setBackground(Color.BLACK);
        //rollButton.setBackground(Color.BLACK);
        resetButton.setFont(buttonFont);
        
        //Grid placement
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0; // position the element at column 0
        constraints.gridy = 0; // position the element at row 0
        constraints.weightx = 1.0; // give the element a weight of 1 in the x direction
        constraints.weighty = 1.0; // give the element a weight of 1 in the y direction
        constraints.fill = GridBagConstraints.BOTH;
        add(rollButton, constraints);
        constraints.gridx = 1; // position the element at column 0
        constraints.gridy = 0; // position the element at row 0
        constraints.weightx = 1.0; // give the element a weight of 1 in the x direction
        constraints.weighty = 1.0; // give the element a weight of 1 in the y direction
        constraints.fill = GridBagConstraints.BOTH;
        add(resetButton, constraints);
        constraints.gridx = 0; // position the element at column 0
        constraints.gridy = 1; // position the element at row 0
        constraints.weightx = 5; // give the element a weight of 1 in the x direction
        constraints.weighty = 5; // give the element a weight of 1 in the y direction
        //constraints.anchor = GridBagConstraints.NORTH;
        //constraints.gridheight = 3;
        constraints.gridwidth = 2;
        //constraints.fill = GridBagConstraints.BOTH;
        add(textArea, constraints);

        //Action Listeners
        rollButton.addActionListener(al);
        resetButton.addActionListener(al);
    }
}