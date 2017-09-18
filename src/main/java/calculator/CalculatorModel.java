/*
    CalculatorModel.java

    Calculator application Model portion of MVC pattern. Manages state of the calculator.
 */

package calculator;

public class CalculatorModel {

    private CalculatorView view;

    private String display;
    private boolean overwrite;
    private long typed;

    private long value;
    private long previousValue;

    private boolean add;
    private boolean subtract;
    private boolean multiply;
    private boolean divide;

    CalculatorModel(CalculatorView view) {
        this.view = view;
        clear();
    }

    public void clear() {
        display = "0";
        overwrite = true;
        typed = 0L;

        value = 0L;
        previousValue = 0L;

        add = false;
        subtract = false;
        multiply = false;
        divide = false;

        update();
    }

    public void equals() {
        long hold = value;
        if (add) {
            value = previousValue + typed;
        } else if (subtract) {
            value = previousValue - typed;
        } else if (multiply) {
            value = previousValue * typed;
        } else if (divide) {
            value = previousValue / typed;
        }
        previousValue = hold;
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

    public void multiply() {
        operator();
        multiply = true;
    }

    public void divide() {
        operator();
        divide = true;
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
            value = 10L*value + input;
        }

        typed = value;

        update();
    }

    private void update() {
        display = "" + value;
        view.setDisplay("" + value);

        System.err.println("+++++++++++++++++++++++++++++++++++");
        System.err.println(" - previousValue = " + previousValue);
        System.err.println(" -         value = " + value);
        System.err.println(" -         typed = " + typed);
        System.err.println(" -       display = " + display);
        System.err.println("+++++++++++++++++++++++++++++++++++");
    }
}