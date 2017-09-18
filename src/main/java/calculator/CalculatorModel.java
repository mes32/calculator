/*
    CalculatorModel.java

    Calculator application Model portion of MVC pattern. Manages state of the calculator.
 */

package calculator;

public class CalculatorModel {

    private CalculatorView view;

    private long value;
    private long previousValue;
    private String display;
    //private boolean overwrite;

    private boolean cleared;
    private boolean equaled;

    CalculatorModel(CalculatorView view) {
        this.view = view;
        clear();
    }

    public void clear() {
        value = 0L;
        previousValue = 0L;
        display = "0";

        cleared = true;
        equaled = false;

        update();
    }

    public void type(int input) {
        if (cleared || equaled) {

            value = (long) input;


        } else {

            value = Long.parseLong(display + input);

        }

        cleared = false;
        equaled = false;
        update();
    }

    private void update() {
        display = "" + value;
        view.setDisplay(display);
    }
}