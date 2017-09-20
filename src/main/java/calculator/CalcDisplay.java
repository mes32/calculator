/*
    CalcDisplay.java

    Creates custom calculator display.
 */

package calculator;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class CalcDisplay extends JLabel {

    private static final String DEFAULT_DISPLAY = "0";

    CalcDisplay() {
        this(DEFAULT_DISPLAY);
    }

    CalcDisplay(String text) {
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
}