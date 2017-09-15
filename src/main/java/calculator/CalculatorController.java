/*
    CalculatorController.java

    Calculator application Controller portion of MVC pattern. Manages state of the calculator.
 */

package calculator;

import java.awt.*;
import java.awt.event.*;

public class CalculatorController {

    CalculatorController(CalculatorModel model, CalculatorView view) {
        addListeners(view.getButtons());
    }

    private void addListeners(ButtonSet button) {
        button.clear().addActionListener(event->pressClear());
        button.equals().addActionListener(event->pressEquals());
    }

    private void pressClear() {
        System.out.println("pressClear()");
        //view.update();
    }

    private void pressEquals() {
        System.out.println("pressEquals()");
        //view.update();
    }
}