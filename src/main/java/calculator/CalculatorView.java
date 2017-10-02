/*
    CalculatorView.java

    Calculator application View portion of MVC pattern. Manages displayed application window.
 */

package calculator;

import java.awt.*;
import javax.swing.*;

public class CalculatorView {

    private static final String TITLE = "Calculator";

    private final ButtonSet button = new ButtonSet();
    private final JLabel display = new CalcDisplay();

    private JFrame frame;
    private JPanel rootPanel;
    private JPanel displayPanel;
    private JPanel buttonPanel;
    private JPanel column1;
    private JPanel column2;
    private JPanel column3;
    private JPanel column4;

    CalculatorView() {
        initLookAndFeel();
        initFrame();
    }

    private void initLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|UnsupportedLookAndFeelException e) {

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

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.weighty = 1;
        c.weightx = 1;
        c.gridy = 0;
        c.gridx = 0;
        displayPanel.add(display, c);
    }

    private void addButtonPanel() {
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridBagLayout());
        rootPanel.add(buttonPanel);

        addColumn1();
        addColumn2();
        addColumn3();
        addColumn4();
    }

    private void addColumn1() {
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.weighty = 1;
        c.weightx = 1;
        c.gridx = 0;

        c.gridy = 0;
        buttonPanel.add(button.clear(), c);
        c.gridy = 1;
        buttonPanel.add(Box.createVerticalStrut(10), c);
        c.gridy = 2;
        buttonPanel.add(button.num7(), c);
        c.gridy = 3;
        buttonPanel.add(button.num4(), c);
        c.gridy = 4;
        buttonPanel.add(button.num1(), c);
        c.gridy = 5;
        buttonPanel.add(button.num0(), c);
    }

    private void addColumn2() {
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.weighty = 1;
        c.weightx = 1;
        c.gridx = 1;
        
        c.gridy = 0;
        buttonPanel.add(button.percent(), c);
        c.gridy = 1;
        buttonPanel.add(Box.createVerticalStrut(5), c);
        c.gridy = 2;
        buttonPanel.add(button.num8(), c);
        c.gridy = 3;
        buttonPanel.add(button.num5(), c);
        c.gridy = 4;
        buttonPanel.add(button.num2(), c);
        c.gridy = 5;
        buttonPanel.add(button.decimal(), c);
    }

    private void addColumn3() {
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.weighty = 1;
        c.weightx = 1;
        c.gridx = 2;
        
        c.gridy = 0;
        buttonPanel.add(button.div(), c);
        c.gridy = 1;
        buttonPanel.add(Box.createVerticalStrut(5), c);
        c.gridy = 2;
        buttonPanel.add(button.num9(), c);
        c.gridy = 3;
        buttonPanel.add(button.num6(), c);
        c.gridy = 4;
        buttonPanel.add(button.num3(), c);
        c.gridy = 5;
        buttonPanel.add(button.inverse(), c);
    }

    private void addColumn4() {
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.weighty = 1;
        c.weightx = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.gridx = 3;
        
        c.gridy = 0;
        buttonPanel.add(button.mul(), c);
        c.gridy = 1;
        buttonPanel.add(Box.createVerticalStrut(5), c);
        c.gridy = 2;
        buttonPanel.add(button.sub(), c);
        c.gridy = 3;
        buttonPanel.add(button.add(), c);
        c.gridy = 4;
        c.weighty = 2;
        c.gridheight = 2;
        buttonPanel.add(button.equals(), c);
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
}