package jsmaiorjava.implementations;

import jsmaiorjava.interfaces.IWindow;
import jsmaiorjava.interfaces.IWindowOperation;

import javax.swing.*;
import java.awt.*;

public class Window implements IWindow {

    // Window components
    private JFrame window;
    
    // Funcoes dos botoes
    private IWindowOperation operations;

    public Window(IWindowOperation operations) {
        // init the window
        this.window = new JFrame("Doctor who?");
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setSize(600, 600);

        // instanciar todos os botoes, labels e todo o resto

        // define operations
        this.operations = operations;
    }

    public Window() {
        // init the window
        this.window = new JFrame("Doctor who?");

        // Definindo o layout
        GridLayout gl = new GridLayout(2,2);

        // Criando o painel
        JPanel painel = new JPanel(new BorderLayout());
        painel.setBackground(Color.blue);


        JButton button;
        painel.setLayout(new GridBagLayout());
        
        GridBagConstraints c = new GridBagConstraints();
        //natural height, maximum width
        c.fill = GridBagConstraints.HORIZONTAL;

        button = new JButton("Button 1");
        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        painel.add(button, c);

        button = new JButton("Button 2");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 0;
        painel.add(button, c);

        button = new JButton("Button 3");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 0;
        painel.add(button, c);

        button = new JButton("Long-Named Button 4");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;      //make this component tall
        c.weightx = 0.0;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 1;
        painel.add(button, c);

        button = new JButton("5");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 0;       //reset to default
        c.weighty = 1.0;   //request any extra vertical space
        c.anchor = GridBagConstraints.PAGE_END; //bottom of space
        c.insets = new Insets(10,0,0,0);  //top padding
        c.gridx = 1;       //aligned with button 2
        c.gridwidth = 2;   //2 columns wide
        c.gridy = 2;       //third row
        painel.add(button, c);


        this.window.add(painel);
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setSize(600, 600);
    }

    // setters 
    public void setLabelOne(String text, Boolean visible) {
        // Define first label
    }
    public void setFirstButton(String name, Boolean visible){
        // define fisrt button
    }

    // Twitter and Atestado functions
    public String printTwitter() {
        return operations.onFirstButtonPress();
    }
    public String printAtestado() {
        return operations.onSecondButtonPress();
    }
    // When click to go to the next question (is a callback function)
    public String nextQuestion() {
        return operations.onThirdButtonPress();
    }

    // open the window
    public void open() {
        this.window.setVisible(true);
        // center the window
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.window.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.window.getHeight()) / 2);
        this.window.setLocation(x, y);
    }
}