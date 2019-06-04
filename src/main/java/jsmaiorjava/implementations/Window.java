package jsmaiorjava.implementations;

import jsmaiorjava.interfaces.IImprimeAtestado;
import jsmaiorjava.interfaces.IWindow;
import jsmaiorjava.interfaces.IWindowOperation;
import jsmaiorjava.interfaces.IZumbiTwittero;

import javax.swing.*;
import java.awt.*;

public class Window implements IWindow {

    // Window components
    private JFrame window;
    
    // Funcoes dos botoes
    private IWindowOperation operations;

    Window(IWindowOperation operations) {
        // init the window
        this.window = new JFrame("Doctor who?");
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setSize(600, 600);

        // instanciar todos os botoes, labels e todo o resto

        // define operations
        this.operations = operations;
    }

    Window() {
        // init the window
        this.window = new JFrame("Doctor who?");
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
    public void printTwitter() {
        operations.onFirstButtonPress();
    }
    public void printAtestado() {
        operations.onSecondButtonPress();
    }
    // When click to go to the next question (is a callback function)
    public void nextQuestion() {
        operations.onThirdButtonPress();
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