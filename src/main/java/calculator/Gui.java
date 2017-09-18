/*
    Gui.java

    Calculator application GUI.
 */

package calculator;

import java.io.*;

public class Gui {

    private CalculatorModel model;
    private CalculatorView view;
    private CalculatorController controller;

    Gui() {
        view = new CalculatorView();
        model = new CalculatorModel(view);
        controller = new CalculatorController(model, view);
    }

    public void visible() {
        view.visible();
    }
}