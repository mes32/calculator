/*
    DisplayPanel.java

    Creates custom calculator display.
 */

package calculator.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class DisplayPanel extends JLabel {

    private static final String DEFAULT_DISPLAY = "0";
    //private final JLabel display = new DisplayPanel();


    DisplayPanel() {
        this(DEFAULT_DISPLAY);
    }

    DisplayPanel(String text) {
        super(text);

        this.setHorizontalAlignment(SwingConstants.RIGHT);
        this.setBackground(new Color(200, 200, 255));
        this.setOpaque(true);
        this.setForeground(Color.WHITE);
        //this.setFocusPainted(false);
        this.setFont(new Font("Verdana", Font.PLAIN, 32));

        Border border = this.getBorder();
        Border margin = new EmptyBorder(10,10,10,10);
        this.setBorder(new CompoundBorder(border, margin));

        //this.setMargin(new Insets(10, 10, 10, 10));
        this.setMinimumSize(new Dimension(80, 80));
    }

    // public void setText(String text) {
    //     display.setText(text);
    // }
}