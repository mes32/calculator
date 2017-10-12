/*
    ButtonSet.java

    Manages state of the calculator.
 */

package calculator.view;

import java.awt.*;
import javax.swing.*;

public class ButtonSet {

    private final Button clear = new Button("C");
    private final Button equals = new Button("=", 2);
    private final Button percent = new Button("%");
    private final Button inverse = new Button("\u00b1");
    private final Button decimal = new Button(".");
    private final Button add = new Button("+");
    private final Button sub = new Button("\u2212");
    private final Button mul = new Button("\u2715");
    private final Button div = new Button("\u00F7");
    private final Button num0 = new Button("0");
    private final Button num1 = new Button("1");
    private final Button num2 = new Button("2");
    private final Button num3 = new Button("3");
    private final Button num4 = new Button("4");
    private final Button num5 = new Button("5");
    private final Button num6 = new Button("6");
    private final Button num7 = new Button("7");
    private final Button num8 = new Button("8");
    private final Button num9 = new Button("9");

    ButtonSet() {
        
    }

    public Button clear() {
        return clear;
    }

    public Button equals() {
        return equals;
    }

    public Button percent() {
        return percent;
    }

    public Button inverse() {
        return inverse;
    }

    public Button decimal() {
        return decimal;
    }

    public Button add() {
        return add;
    }

    public Button sub() {
        return sub;
    }

    public Button mul() {
        return mul;
    }

    public Button div() {
        return div;
    }

    public Button num0() {
        return num0;
    }

    public Button num1() {
        return num1;
    }

    public Button num2() {
        return num2;
    }

    public Button num3() {
        return num3;
    }

    public Button num4() {
        return num4;
    }

    public Button num5() {
        return num5;
    }

    public Button num6() {
        return num6;
    }

    public Button num7() {
        return num7;
    }

    public Button num8() {
        return num8;
    }

    public Button num9() {
        return num9;
    }

}