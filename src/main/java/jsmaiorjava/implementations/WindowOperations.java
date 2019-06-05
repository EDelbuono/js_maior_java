package jsmaiorjava.implementations;

import jsmaiorjava.interfaces.IWindowOperation;

public class WindowOperations implements IWindowOperation {

    // Twitter and Atestado functions
    public Integer onFirstButtonPress() {
        return 12;
    }
    public String onSecondButtonPress() {
        return "adf";
    }
    // When click to go to the next question (is a callback function)
    public String onThirdButtonPress() {
        return  "";
    }

}