/*
    Button.java

    Creates custom calculator buttons.
 */

package calculator.view;

import java.awt.*;
import javax.swing.*;

public class Button extends JButton {

    private static final int DEFAULT_GRIDHEIGHT = 1;

    private int gridheight;

    Button(String label) {
        this(label, DEFAULT_GRIDHEIGHT);
    }

    Button(String label, int gridheight) {
        super(label);
        this.gridheight = gridheight;

        this.setBackground(ConfigureStyle.BUTTON_BACKGROUND);
        this.setOpaque(true);
        this.setForeground(Color.WHITE);
        this.setFocusPainted(false);
        this.setFont(ConfigureStyle.BUTTON_FONT);

        this.setFocusPainted(false);

        this.setBorder(new RoundedBorder(20));

        this.setMargin(new Insets(10, 10, 10, 10));
        this.setPreferredSize(new Dimension(80, 80 * gridheight));
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(80, 80 * gridheight);
    }

    @Override
    public Dimension getMinimumSize() {
        return new Dimension(80, 80 * gridheight);
    }

    // @Override
    // public void paintComponent(Graphics g) {
    //     super.paintComponent(g);
    //     if (isSelected()) {
    //         setBorder(BorderFactory.createEmptyBorder());
    //     } else {
    //         setBorder(BorderFactory.createLoweredBevelBorder());
    //     }
    // }

    public int getGridheight() {
        return gridheight;
    }
}