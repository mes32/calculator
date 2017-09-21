/*
    ButtonSet.java

    Manages state of the calculator.
 */

package calculator;

import java.awt.*;
import javax.swing.*;

public class ButtonSet {

    private final JButton clear = new CalcButton("C");
    private final JButton equals = new CalcButton("=");
    private final JButton percent = new CalcButton("%");
    private final JButton inverse = new CalcButton("\u00b1");
    private final JButton decimal = new CalcButton(".");
    private final JButton add = new CalcButton("+");
    private final JButton sub = new CalcButton("\u2212");
    private final JButton mul = new CalcButton("\u2715");
    private final JButton div = new CalcButton("\u00F7");
    private final JButton num0 = new CalcButton("0");
    private final JButton num1 = new CalcButton("1");
    private final JButton num2 = new CalcButton("2");
    private final JButton num3 = new CalcButton("3");
    private final JButton num4 = new CalcButton("4");
    private final JButton num5 = new CalcButton("5");
    private final JButton num6 = new CalcButton("6");
    private final JButton num7 = new CalcButton("7");
    private final JButton num8 = new CalcButton("8");
    private final JButton num9 = new CalcButton("9");

    ButtonSet() {
        
    }

    public JButton clear() {
        return clear;
    }

    public JButton equals() {
        return equals;
    }

    public JButton percent() {
        return percent;
    }

    public JButton inverse() {
        return inverse;
    }

    public JButton decimal() {
        return decimal;
    }

    public JButton add() {
        return add;
    }

    public JButton sub() {
        return sub;
    }

    public JButton mul() {
        return mul;
    }

    public JButton div() {
        return div;
    }

    public JButton num0() {
        return num0;
    }

    public JButton num1() {
        return num1;
    }

    public JButton num2() {
        return num2;
    }

    public JButton num3() {
        return num3;
    }

    public JButton num4() {
        return num4;
    }

    public JButton num5() {
        return num5;
    }

    public JButton num6() {
        return num6;
    }

    public JButton num7() {
        return num7;
    }

    public JButton num8() {
        return num8;
    }

    public JButton num9() {
        return num9;
    }

}