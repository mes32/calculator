/*
    ButtonPanel.java

    Creates custom panel with the calculator's buttons.
 */

package calculator.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class ButtonPanel extends JPanel {

    private final ButtonSet button;
    private final ButtonPanelConstraints constraints = new ButtonPanelConstraints();

    ButtonPanel(ButtonSet button) {
        super();
        this.setLayout(new GridBagLayout());
        this.setBackground(new Color(100, 100, 100));
        this.button = button;

        // Column 0
        addButton(button.clear(), 0, 0);
        addButton(button.num7(), 0, 1);
        addButton(button.num4(), 0, 2);
        addButton(button.num1(), 0, 3);
        addButton(button.num0(), 0, 4);

        // Column 1
        addButton(button.percent(), 1, 0);
        addButton(button.num8(), 1, 1);
        addButton(button.num5(), 1, 2);
        addButton(button.num2(), 1, 3);
        addButton(button.decimal(), 1, 4);

        // Column 2
        addButton(button.div(), 2, 0);
        addButton(button.num9(), 2, 1);
        addButton(button.num6(), 2, 2);
        addButton(button.num3(), 2, 3);
        addButton(button.inverse(), 2, 4);

        // Column 3
        addButton(button.mul(), 3, 0);
        addButton(button.sub(), 3, 1);
        addButton(button.add(), 3, 2);
        addButton(button.equals(), 3, 3);
    }

    private void addButton(Button button, int x, int y) {
        constraints.gridx = x;
        constraints.gridy = y;

        constraints.gridwidth = 1;
        constraints.gridheight = button.getGridheight();

        constraints.weightx = 1.0;
        constraints.weighty = 1.0 * button.getGridheight();

        this.add(button, constraints);
    }

    private class ButtonPanelConstraints extends GridBagConstraints {
        ButtonPanelConstraints() {
            super();
            fill = GridBagConstraints.BOTH;
            gridwidth = 1;
            gridheight = 1;
            insets = new Insets(5, 5, 5, 5);
        }
    }
}