/*
    CalculatorGui.java

    Calculator application GUI.
 */

package calculator;

import java.io.*;
import calculator.view.*;

public class CalculatorGui {

    private CalculatorModel model;
    private CalculatorView view;
    private CalculatorController controller;

    CalculatorGui() {
        view = new CalculatorView();
        model = new CalculatorModel(view);
        controller = new CalculatorController(model, view);
    }

    public void visible() {
        view.visible();
    }
}