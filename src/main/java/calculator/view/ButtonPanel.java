/*
    ButtonPanel.java

    Creates custom panel with the calculator's buttons.
 */

package calculator.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class ButtonPanel extends JPanel {

    // TODO: ButtonPanel should not need to know about ButtonSet
    private final ButtonSet button;
    private ButtonColumn column1 = new ButtonColumn();
    private ButtonColumn column2 = new ButtonColumn();
    private ButtonColumn column3 = new ButtonColumn();
    private ButtonColumn column4 = new ButtonColumn();

    // private final ButtonConstraints buttonConstraints = new ButtonConstraints();

    ButtonPanel(ButtonSet button) {
        super();
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.setBackground(new Color(100, 100, 100));

        this.button = button;

        addColumn1();
        this.add(Box.createRigidArea(new Dimension(5, 0)));
        addColumn2();
        this.add(Box.createRigidArea(new Dimension(5, 0)));
        addColumn3();
        this.add(Box.createRigidArea(new Dimension(5, 0)));
        addColumn4();
    }

    // private void addButton(Button button, int x, int y) {
    //     Component verticalStrut = Box.createVerticalStrut(5);
    //     Component horizontalStrut = Box.createHorizontalStrut(5);

    //     if (x != 0 && y == 0) {
    //         buttonConstraints.gridx = 2*x - 1;
    //         this.add(horizontalStrut, buttonConstraints);
    //     }

    //     if (y != 0 && x == 0) {
    //         buttonConstraints.gridy = 2*y - 1;
    //         buttonConstraints.gridheight = 1;
    //         buttonConstraints.weighty = 1;
    //         this.add(verticalStrut, buttonConstraints);
    //     }

    //     buttonConstraints.gridx = 2*x;
    //     buttonConstraints.gridy = 2*y;
    //     buttonConstraints.gridheight = button.getGridheight();
    //     buttonConstraints.weighty = button.getGridheight();
    //     this.add(button, buttonConstraints);

    // } 

    private void addColumn1() {
        // addButton(button.clear(), 0, 0);
        // addButton(button.num7(), 0, 1);
        // addButton(button.num4(), 0, 2);
        // addButton(button.num1(), 0, 3);
        // addButton(button.num0(), 0, 4);

        this.add(column1);
        column1.add(button.clear(), 0);
        column1.add(button.num7(), 1);
        column1.add(button.num4(), 2);
        column1.add(button.num1(), 3);
        column1.add(button.num0(), 4);
        
    }

    private void addColumn2() {
        // addButton(button.percent(), 1, 0);
        // addButton(button.num8(), 1, 1);
        // addButton(button.num5(), 1, 2);
        // addButton(button.num2(), 1, 3);
        // addButton(button.decimal(), 1, 4);

        this.add(column2);
        column2.add(button.percent(), 0);
        column2.add(button.num8(), 1);
        column2.add(button.num5(), 2);
        column2.add(button.num2(), 3);
        column2.add(button.decimal(), 4);
    }

    private void addColumn3() {
        // addButton(button.div(), 2, 0);
        // addButton(button.num9(), 2, 1);
        // addButton(button.num6(), 2, 2);
        // addButton(button.num3(), 2, 3);
        // addButton(button.inverse(), 2, 4);

        this.add(column3);
        column3.add(button.div(), 0);
        column3.add(button.num9(), 1);
        column3.add(button.num6(), 2);
        column3.add(button.num3(), 3);
        column3.add(button.inverse(), 4);
    }

    private void addColumn4() {
        // addButton(button.mul(), 3, 0);
        // addButton(button.sub(), 3, 1);
        // addButton(button.add(), 3, 2);
        // addButton(button.equals(), 3, 3);

        this.add(column4);
        column4.add(button.mul(), 0);
        column4.add(button.sub(), 1);
        column4.add(button.add(), 2);
        column4.add(button.equals(), 3);
    }

    // private class ButtonConstraints extends GridBagConstraints {
    //     ButtonConstraints() {
    //         super();
    //         fill = GridBagConstraints.BOTH;
    //         weighty = 1;
    //         weightx = 1;
    //         gridwidth = 1;
    //         gridheight = 1;
    //         gridx = 0;
    //         gridy = 0;
    //     }
    // }
}