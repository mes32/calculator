/*
    DisplayPanel.java

    Creates custom calculator display.
 */

package calculator.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class DisplayPanel extends JPanel {

    private static final String DEFAULT_DISPLAY = "0";
    private final JLabel display;

    private final DisplayConstraints displayConstraints = new DisplayConstraints();

    DisplayPanel() {
        this(DEFAULT_DISPLAY);
    }

    DisplayPanel(String text) {
        super();
        this.setLayout(new GridBagLayout());
        this.setBackground(new Color(200, 200, 255));

        display = new JLabel(text);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setBackground(new Color(200, 200, 255));
        display.setOpaque(true);
        display.setForeground(Color.WHITE);
        //display.setFocusPainted(false);
        display.setFont(new Font("Verdana", Font.PLAIN, 32));

        Border border = this.getBorder();
        Border margin = new EmptyBorder(10,10,10,10);
        this.setBorder(new CompoundBorder(border, margin));

        //this.setMargin(new Insets(10, 10, 10, 10));
        this.setMinimumSize(new Dimension(80, 80));

        this.add(display, displayConstraints);
    }

    public void setText(String text) {
        display.setText(text);
    }

    private class DisplayConstraints extends GridBagConstraints {
        DisplayConstraints() {
            super();
            fill = GridBagConstraints.BOTH;
            weighty = 1;
            weightx = 1;
            gridwidth = 1;
            gridheight = 1;
            gridx = 0;
            gridy = 0;
        }
    }
}