/*
    ButtonSet.java

    Manages state of the calculator.
 */

package calculator;

import java.awt.*;
import javax.swing.*;

public class ButtonSet {

    private final JButton clear = new JButton("C");
    private final JButton equals = new JButton("=");
    private final JButton percent = new JButton("%");
    private final JButton inverse = new JButton("+/-");
    private final JButton decimal = new JButton(".");
    private final JButton add = new JButton("+");
    private final JButton sub = new JButton("-");
    private final JButton mul = new JButton("x");
    private final JButton div = new JButton("/");
    private final JButton num0 = new JButton("0");
    private final JButton num1 = new JButton("1");
    private final JButton num2 = new JButton("2");
    private final JButton num3 = new JButton("3");
    private final JButton num4 = new JButton("4");
    private final JButton num5 = new JButton("5");
    private final JButton num6 = new JButton("6");
    private final JButton num7 = new JButton("7");
    private final JButton num8 = new JButton("8");
    private final JButton num9 = new JButton("9");

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