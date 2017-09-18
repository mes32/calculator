/*
    CalculatorController.java

    Calculator application Controller portion of MVC pattern. Manages state of the calculator.
 */

package calculator;

import java.awt.*;
import java.awt.event.*;

public class CalculatorController {

    CalculatorModel model;

    CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;

        addListeners(view.getButtons());
    }

    private void addListeners(ButtonSet button) {
        button.clear().addActionListener(event->pressClear());
        button.equals().addActionListener(event->pressEquals());
        button.percent().addActionListener(event->pressPercent());
        button.inverse().addActionListener(event->pressInverse());
        button.decimal().addActionListener(event->pressDecimal());
        button.add().addActionListener(event->pressAdd());
        button.sub().addActionListener(event->pressSub());
        button.mul().addActionListener(event->pressMul());
        button.div().addActionListener(event->pressDiv());
        button.num0().addActionListener(event->pressNum0());
        button.num1().addActionListener(event->pressNum1());
        button.num2().addActionListener(event->pressNum2());
        button.num3().addActionListener(event->pressNum3());
        button.num4().addActionListener(event->pressNum4());
        button.num5().addActionListener(event->pressNum5());
        button.num6().addActionListener(event->pressNum6());
        button.num7().addActionListener(event->pressNum7());
        button.num8().addActionListener(event->pressNum8());
        button.num9().addActionListener(event->pressNum9());
    }

    private void pressClear() {
        System.out.println("pressClear()");
        model.clear();
    }

    private void pressEquals() {
        System.out.println("pressEquals()");
        //view.update();
    }

    private void pressPercent() {
        System.out.println("pressPercent()");
        //view.update();
    }

    private void pressInverse() {
        System.out.println("pressInverse()");
        //view.update();
    }

    private void pressDecimal() {
        System.out.println("pressDecimal()");
        //view.update();
    }

    private void pressAdd() {
        System.out.println("pressAdd()");
        //view.update();
    }

    private void pressSub() {
        System.out.println("pressSub()");
        //view.update();
    }

    private void pressMul() {
        System.out.println("pressMul()");
        //view.update();
    }

    private void pressDiv() {
        System.out.println("pressDiv()");
        //view.update();
    }

    private void pressNum0() {
        System.out.println("pressNum0()");
        model.type(0);
    }

    private void pressNum1() {
        System.out.println("pressNum1()");
        model.type(1);
    }

    private void pressNum2() {
        System.out.println("pressNum2()");
        model.type(2);
    }

    private void pressNum3() {
        System.out.println("pressNum3()");
        model.type(3);
    }

    private void pressNum4() {
        System.out.println("pressNum4()");
        model.type(4);
    }

    private void pressNum5() {
        System.out.println("pressNum5()");
        model.type(5);
    }

    private void pressNum6() {
        System.out.println("pressNum6()");
        model.type(6);
    }

    private void pressNum7() {
        System.out.println("pressNum7()");
        model.type(7);
    }

    private void pressNum8() {
        System.out.println("pressNum8()");
        model.type(8);
    }

    private void pressNum9() {
        System.out.println("pressNum9()");
        model.type(9);
    }
}