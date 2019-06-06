package jsmaiorjava.implementations;

import jsmaiorjava.interfaces.*;

public class WindowFactory {
     public static IWindow createWindow(IWindowOperation operations) {
        return new Window(operations);
     }
     public static IWindow createWindow() {
        return new Window();
     }
}