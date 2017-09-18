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
    private boolean overwrite;

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

        overwrite = true;

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
        overwrite = true;
        update();
    }

    public void add() {
        operator();
        add = true;
    }

    public void subtract() {
        operator();
        subtract = true;
    }

    private void operator() {
        previousValue = value;
        overwrite = true;

        add = false;
        subtract = false;
        multiply = false;
        divide = false;
    }

    public void type(int input) {
        if (overwrite) {
            value = (long) input;
            overwrite = false;
        } else {
            value = Long.parseLong(display + input);
        }

        update();
    }

    private void update() {
        display = "" + value;
        view.setDisplay(display);

        System.out.println(" - prev = " + previousValue);
        System.out.println(" - valu = " + value);
    }
}