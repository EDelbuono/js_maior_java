package jsmaiorjava;
import jsmaiorjava.interfaces.*;
import javax.swing.*;
import java.awt.*;

public class Window implements IWindow {

    private JFrame window;
    private IWindowOperation operations;

    Window(IWindowOperation operations) {
        // init the window
        this.window = new JFrame("Doctor who?");
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setSize(600, 600);

        // define operations
        this.operations = operations;
    }

    // Twitter and Atestado functions
    public void printTwitter() {
        operations.printTwitter();
    }
    public void printAtestado() {
        operations.printAtestado();
    }


    // open the window
    public void open() {
        this.window.setVisible(true);
        this.centreWindow(this.window);
    }

    private void centreWindow(JFrame frame) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }
}