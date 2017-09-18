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

    private boolean add;
    private boolean subtract;
    private boolean multiply;
    private boolean divide;

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

        add = false;
        subtract = false;
        multiply = false;
        divide = false;

        update();
    }

    public void equals() {
        if (add) {
            value = previousValue + value;
        } else if (subtract) {
            value = previousValue - value;
        } else if (multiply) {
            value = previousValue * value;
        } else if (divide) {
            value = previousValue / value;
        }
        equaled = true;
        update();
    }

    public void add() {
        previousValue = value;
        equaled = true;
        add = true;
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

        System.out.println(" - prev = " + previousValue);
        System.out.println(" - valu = " + value);
    }
}