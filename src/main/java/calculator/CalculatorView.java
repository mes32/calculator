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
    private final JLabel display = new JLabel("0");

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
        rootPanel.add(displayPanel);

        displayPanel.add(display);
    }

    private void addButtonPanel() {
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        rootPanel.add(buttonPanel);

        addColumn1();
        addColumn2();
        addColumn3();
        addColumn4();
    }

    private void addColumn1() {
        column1 = new JPanel();
        column1.setLayout(new BoxLayout(column1, BoxLayout.Y_AXIS));
        buttonPanel.add(column1);

        column1.add(button.clear());
        column1.add(button.num7());
        column1.add(button.num4());
        column1.add(button.num1());
        column1.add(button.num0());
    }

    private void addColumn2() {
        column2 = new JPanel();
        column2.setLayout(new BoxLayout(column2, BoxLayout.Y_AXIS));
        buttonPanel.add(column2);

        column2.add(button.percent());
        column2.add(button.num8());
        column2.add(button.num5());
        column2.add(button.num2());
        column2.add(button.decimal());
    }

    private void addColumn3() {
        column3 = new JPanel();
        column3.setLayout(new BoxLayout(column3, BoxLayout.Y_AXIS));
        buttonPanel.add(column3);

        column3.add(button.div());
        column3.add(button.num9());
        column3.add(button.num6());
        column3.add(button.num3());
        column3.add(button.inverse());
    }

    private void addColumn4() {
        column4 = new JPanel();
        column4.setLayout(new BoxLayout(column4, BoxLayout.Y_AXIS));
        buttonPanel.add(column4);

        column4.add(button.mul());
        column4.add(button.sub());
        column4.add(button.add());
        column4.add(button.equals());
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