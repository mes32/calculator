/*
    CalcButton.java

    Creates custom calculator buttons.
 */

package calculator.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class CalcButton extends JButton {

    private static final int DEFAULT_GRIDHEIGHT = 1;

    private int gridheight;

    CalcButton(String label) {
        this(label, DEFAULT_GRIDHEIGHT);
    }

    CalcButton(String label, int gridheight) {
        super(label);
        this.gridheight = gridheight;

        this.setBackground(ConfigureView.BUTTON_BACKGROUND);
        this.setOpaque(true);
        this.setForeground(Color.WHITE);
        this.setFocusPainted(false);
        this.setFont(ConfigureView.BUTTON_FONT);

        this.setBorder(new RoundBorder(20));

        this.setMargin(new Insets(10, 10, 10, 10));
        this.setPreferredSize(new Dimension(80, 80));
    }

    public int getGridheight() {
        return gridheight;
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