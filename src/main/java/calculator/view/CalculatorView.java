/*
    CalculatorView.java

    Calculator application View portion of MVC pattern. Manages displayed application window.
 */

package calculator.view;

import java.awt.*;
import javax.swing.*;

public class CalculatorView {

    private static final String TITLE = "Calculator";
    private final ButtonSet button = new ButtonSet();

    private JFrame frame;
    private JPanel rootPanel;
    private DisplayPanel displayPanel = new DisplayPanel();
    private ButtonPanel buttonPanel = new ButtonPanel(button);

    public CalculatorView() {
        initLookAndFeel();
        initFrame();
    }

    private void initLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|UnsupportedLookAndFeelException e) {
            // Unable to set look and feel. User will see what they see.
        }
    }

    private void initFrame() {
        frame = new JFrame(TITLE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addRootPanel();
        frame.pack();
        frame.setMinimumSize(frame.getSize());
    }

    private void addRootPanel() {
        rootPanel = new JPanel();
        rootPanel.setLayout(new BoxLayout(rootPanel, BoxLayout.Y_AXIS));
        frame.getContentPane().add(rootPanel);

        rootPanel.add(displayPanel);
        rootPanel.add(buttonPanel);
    }

    public ButtonSet getButtons() {
        return button;
    }

    public void setDisplay(String text) {
        displayPanel.setText(text);
    }

    public void visible() {
        frame.setVisible(true);
    }
}