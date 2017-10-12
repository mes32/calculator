/*
    CalculatorView.java

    Calculator application View portion of MVC pattern. Manages displayed application window.
 */

package calculator.view;

import java.awt.*;
import javax.swing.*;

public class CalculatorView {

    private static final String TITLE = "Calculator";

    private final JLabel display = new DisplayPanel();
    private final ButtonSet button = new ButtonSet();

    private final DisplayConstraints displayConstraints = new DisplayConstraints();
    private final ButtonConstraints buttonConstraints = new ButtonConstraints();

    private JFrame frame;
    private JPanel rootPanel;
    private JPanel displayPanel;
    private JPanel buttonPanel;
    private JPanel column1;
    private JPanel column2;
    private JPanel column3;
    private JPanel column4;

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
    }

    private void addRootPanel() {
        rootPanel = new JPanel();
        rootPanel.setLayout(new BoxLayout(rootPanel, BoxLayout.Y_AXIS));
        frame.getContentPane().add(rootPanel);

        addDisplayPanel();
        addButtonPanel();
    }

    private void addDisplayPanel() {
        displayPanel = new JPanel();
        displayPanel.setLayout(new GridBagLayout());
        rootPanel.add(displayPanel);

        displayPanel.add(display, displayConstraints);
    }

    private void addButtonPanel() {
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridBagLayout());
        buttonPanel.setBackground(new Color(100, 100, 100));
        rootPanel.add(buttonPanel);

        addColumn1();
        addColumn2();
        addColumn3();
        addColumn4();
    }

    private void addButton(Button button, int x, int y) {
        Component verticalStrut = Box.createVerticalStrut(5);
        Component horizontalStrut = Box.createHorizontalStrut(5);

        if (x != 0 && y == 0) {
            buttonConstraints.gridx = 2*x - 1;
            buttonPanel.add(horizontalStrut, buttonConstraints);
        }

        if (y != 0 && x == 0) {
            buttonConstraints.gridy = 2*y - 1;
            buttonConstraints.gridheight = 1;
            buttonConstraints.weighty = 1;
            buttonPanel.add(verticalStrut, buttonConstraints);
        }

        buttonConstraints.gridx = 2*x;
        buttonConstraints.gridy = 2*y;
        buttonConstraints.gridheight = button.getGridheight();
        buttonConstraints.weighty = button.getGridheight();
        buttonPanel.add(button, buttonConstraints);

    } 

    private void addColumn1() {
        addButton(button.clear(), 0, 0);
        addButton(button.num7(), 0, 1);
        addButton(button.num4(), 0, 2);
        addButton(button.num1(), 0, 3);
        addButton(button.num0(), 0, 4);
    }

    private void addColumn2() {
        addButton(button.percent(), 1, 0);
        addButton(button.num8(), 1, 1);
        addButton(button.num5(), 1, 2);
        addButton(button.num2(), 1, 3);
        addButton(button.decimal(), 1, 4);
    }

    private void addColumn3() {
        addButton(button.div(), 2, 0);
        addButton(button.num9(), 2, 1);
        addButton(button.num6(), 2, 2);
        addButton(button.num3(), 2, 3);
        addButton(button.inverse(), 2, 4);
    }

    private void addColumn4() {
        addButton(button.mul(), 3, 0);
        addButton(button.sub(), 3, 1);
        addButton(button.add(), 3, 2);
        addButton(button.equals(), 3, 3);
    }

    public ButtonSet getButtons() {
        return button;
    }

    public void setDisplay(String text) {
        display.setText(text);
    }

    public void visible() {
        frame.setVisible(true);
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

    private class ButtonConstraints extends GridBagConstraints {
        ButtonConstraints() {
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