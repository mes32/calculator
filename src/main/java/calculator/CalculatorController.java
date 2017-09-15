/*
    CalculatorController.java

    Calculator application Controller portion of MVC pattern. Manages state of the calculator.
 */

package calculator;

import java.awt.*;
import java.awt.event.*;

public class CalculatorController {

    CalculatorController(CalculatorModel model, CalculatorView view) {
        // addListeners(view.getAllButtons());
    }

    /*private void addListeners(AllButtons buttons) {

        buttons.getClear().addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    pressClear();
                }
            }
        );
    }*/

    private void pressClear() {
        System.out.println("pressClear()");
        //view.update();
    }

    private void pressEquals() {
        System.out.println("pressEquals()");
    }


    // private final JButton clearButton = new JButton("C");
    // private final JButton equalsButton = new JButton("=");
    // private final JButton percentButton = new JButton("%");
    // private final JButton inverseButton = new JButton("+/-");
    // private final JButton decimalButton = new JButton(".");
    // private final JButton addButton = new JButton("+");
    // private final JButton subButton = new JButton("-");
    // private final JButton mulButton = new JButton("x");
    // private final JButton divButton = new JButton("/");
    // private final JButton numButton0 = new JButton("0");
    // private final JButton numButton1 = new JButton("1");
    // private final JButton numButton2 = new JButton("2");
    // private final JButton numButton3 = new JButton("3");
    // private final JButton numButton4 = new JButton("4");
    // private final JButton numButton5 = new JButton("5");
    // private final JButton numButton6 = new JButton("6");
    // private final JButton numButton7 = new JButton("7");
    // private final JButton numButton8 = new JButton("8");
    // private final JButton numButton9 = new JButton("9");
}