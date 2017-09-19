/*
    CalculatorModel.java

    Calculator application Model portion of MVC pattern. Manages state of the calculator.
 */

package calculator;

public class CalculatorModel {

    private CalculatorView view;

    private long value;
    private long typed;
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
        typed = 0L;
        display = "0";
        overwrite = true;

        add = false;
        subtract = false;
        multiply = false;
        divide = false;

        update(value);
    }

    public void equals() {
        if (add) {
            value += typed;
        } else if (subtract) {
            value -= typed;
        } else if (multiply) {
            value *= typed;
        } else if (divide) {
            value /= typed;
        }
        overwrite = true;
        update(value);
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
        value = typed;
        overwrite = true;

        add = false;
        subtract = false;
        multiply = false;
        divide = false;
    }

    public void type(int input) {
        if (overwrite) {
            typed = (long) input;
            overwrite = false;
        } else {
            typed = 10L*typed + input;
        }

        update(typed);
    }

    private void update(long value) {
        view.setDisplay("" + value);
    }
}