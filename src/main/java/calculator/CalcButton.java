/*
    CalcButton.java

    Creates custom calculator buttons.
 */

package calculator;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

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

        this.setBorder(new RoundBorder(20));

        this.setMargin(new Insets(10, 10, 10, 10));
        this.setPreferredSize(new Dimension(80, 80));
    }

    private class RoundBorder implements Border {

        private int radius;

        RoundBorder(int radius) {
            this.radius = radius;
        }

        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
        }

        public boolean isBorderOpaque() {
            return true;
        }

        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width-1, height-1, radius, radius);
        }
    }

}