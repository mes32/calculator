/*
    ButtonSet.java

    Manages state of the calculator.
 */

package calculator.view;

import java.awt.*;
import javax.swing.*;

public class ButtonSet {

    private final CalcButton clear = new CalcButton("C");
    private final CalcButton equals = new CalcButton("=", 2);
    private final CalcButton percent = new CalcButton("%");
    private final CalcButton inverse = new CalcButton("\u00b1");
    private final CalcButton decimal = new CalcButton(".");
    private final CalcButton add = new CalcButton("+");
    private final CalcButton sub = new CalcButton("\u2212");
    private final CalcButton mul = new CalcButton("\u2715");
    private final CalcButton div = new CalcButton("\u00F7");
    private final CalcButton num0 = new CalcButton("0");
    private final CalcButton num1 = new CalcButton("1");
    private final CalcButton num2 = new CalcButton("2");
    private final CalcButton num3 = new CalcButton("3");
    private final CalcButton num4 = new CalcButton("4");
    private final CalcButton num5 = new CalcButton("5");
    private final CalcButton num6 = new CalcButton("6");
    private final CalcButton num7 = new CalcButton("7");
    private final CalcButton num8 = new CalcButton("8");
    private final CalcButton num9 = new CalcButton("9");

    ButtonSet() {
        
    }

    public CalcButton clear() {
        return clear;
    }

    public CalcButton equals() {
        return equals;
    }

    public CalcButton percent() {
        return percent;
    }

    public CalcButton inverse() {
        return inverse;
    }

    public CalcButton decimal() {
        return decimal;
    }

    public CalcButton add() {
        return add;
    }

    public CalcButton sub() {
        return sub;
    }

    public CalcButton mul() {
        return mul;
    }

    public CalcButton div() {
        return div;
    }

    public CalcButton num0() {
        return num0;
    }

    public CalcButton num1() {
        return num1;
    }

    public CalcButton num2() {
        return num2;
    }

    public CalcButton num3() {
        return num3;
    }

    public CalcButton num4() {
        return num4;
    }

    public CalcButton num5() {
        return num5;
    }

    public CalcButton num6() {
        return num6;
    }

    public CalcButton num7() {
        return num7;
    }

    public CalcButton num8() {
        return num8;
    }

    public CalcButton num9() {
        return num9;
    }

}