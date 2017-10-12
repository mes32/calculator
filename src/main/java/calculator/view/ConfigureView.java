/*
    ConfigureView.java

    Configures the options colors and fonts for the displayed GUI.
 */

package calculator.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public abstract class ConfigureView {

    public static final Color DISPLAY_BACKGROUND = new Color(0, 0, 0);
    public static final Color DISPLAY_FOREGROUND = new Color(255, 255, 255);

    public static final Color BUTTON_BACKGROUND = new Color(100, 100, 100);
    public static final Color BUTTON_FOREGROUND = new Color(255, 255, 255);
    public static final Font BUTTON_FONT = new Font("Verdana", Font.PLAIN, 32);
}