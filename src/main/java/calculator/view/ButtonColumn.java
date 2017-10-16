/*
    ButtonColumn.java

    Creates custom panel with the calculator's buttons.
 */

package calculator.view;

import java.awt.*;
import javax.swing.*;

public class ButtonColumn extends JPanel {

    private final ButtonColumnConstraints constraints = new ButtonColumnConstraints();

    ButtonColumn() {
        super();
        this.setLayout(new GridBagLayout());
        this.setBackground(new Color(100, 100, 100));
    }

    public void add(Button button, int y) {
        Component verticalStrut = Box.createVerticalStrut(5);

        constraints.gridx = 0;

        if (y != 0) {
            constraints.gridy = 2*y - 1;
            constraints.gridheight = 1;
            constraints.weighty = 1;
            this.add(verticalStrut, constraints);
        }

        constraints.gridy = 2*y;

        //constraints.gridy = y;
        constraints.gridheight = button.getGridheight();
        constraints.weighty = 1.0 * button.getGridheight();
        //constraints.gridheight = GridBagConstraints.RELATIVE;
        // if (y == 3) {
        //     constraints.gridheight = 2;
        //     constraints.weighty = 2.0;
        // }
        this.add(button, constraints);
    } 

    private class ButtonColumnConstraints extends GridBagConstraints {
        ButtonColumnConstraints() {
            super();
            fill = GridBagConstraints.BOTH;
            //anchor = GridBagConstraints.PAGE_START;
            weighty = 1.0;
            weightx = 1.0;
            gridwidth = 1;
            gridheight = 1;
            gridx = 0;
            gridy = 0;
        }
    }
}