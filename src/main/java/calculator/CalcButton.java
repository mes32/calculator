/*
    CalcButton.java

    Creates custom calculator buttons.
 */

package calculator;

import java.awt.*;
import javax.swing.*;

public class CalcButton extends JButton {

    CalcButton(String label) {
        super(label);
        //this.setBorderPainted(false);
        //this.setFocusPainted(false);
        //this.setContentAreaFilled(false);

        this.setBackground(new Color(100, 100, 100));
        this.setOpaque(true);
        this.setForeground(Color.WHITE);
        this.setFocusPainted(false);
        this.setFont(new Font("Verdana", Font.PLAIN, 32));

        this.setMargin(new Insets(10, 10, 10, 10));
        this.setPreferredSize(new Dimension(80, 80));
    }

}