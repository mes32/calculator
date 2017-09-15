/*
    CalculatorView.java

    Calculator application View portion of MVC pattern. Manages displayed application window.
 */

package calculator;

import java.awt.*;
import javax.swing.*;

public class CalculatorView {

    private static final String TITLE = "Calculator";

    private final JButton clearButton = new JButton("C");
    private final JButton equalsButton = new JButton("=");
    private final JButton percentButton = new JButton("%");
    private final JButton inverseButton = new JButton("+/-");
    private final JButton decimalButton = new JButton(".");
    private final JButton addButton = new JButton("+");
    private final JButton subButton = new JButton("-");
    private final JButton mulButton = new JButton("x");
    private final JButton divButton = new JButton("/");
    private final JButton numButton0 = new JButton("0");
    private final JButton numButton1 = new JButton("1");
    private final JButton numButton2 = new JButton("2");
    private final JButton numButton3 = new JButton("3");
    private final JButton numButton4 = new JButton("4");
    private final JButton numButton5 = new JButton("5");
    private final JButton numButton6 = new JButton("6");
    private final JButton numButton7 = new JButton("7");
    private final JButton numButton8 = new JButton("8");
    private final JButton numButton9 = new JButton("9");

    private JFrame frame;
    private JPanel rootPanel;
    private JPanel displayPanel;
    private JPanel buttonPanel;
    private JPanel column1;
    private JPanel column2;
    private JPanel column3;
    private JPanel column4;

    CalculatorView() {
        initFrame();
    }

    private void initFrame() {
        frame = new JFrame(TITLE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addRootPanel();
        frame.pack();
    }

    private void addRootPanel() {
        /*
        See: https://itunes.apple.com/us/app/the-calculator/id398129933?mt=8    
        */

        rootPanel = new JPanel();
        rootPanel.setLayout(new BoxLayout(rootPanel, BoxLayout.Y_AXIS));
        frame.getContentPane().add(rootPanel);

        addDisplayPanel();
        addButtonPanel();
    }

    private void addDisplayPanel() {
        displayPanel = new JPanel();
        rootPanel.add(displayPanel);

        displayPanel.add(new JLabel("0"));
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

        column1.add(clearButton);
        column1.add(numButton7);
        column1.add(numButton4);
        column1.add(numButton1);
        column1.add(numButton0);
    }

    private void addColumn2() {
        column2 = new JPanel();
        column2.setLayout(new BoxLayout(column2, BoxLayout.Y_AXIS));
        buttonPanel.add(column2);

        column2.add(percentButton);
        column2.add(numButton8);
        column2.add(numButton5);
        column2.add(numButton2);
        column2.add(decimalButton);
    }

    private void addColumn3() {
        column3 = new JPanel();
        column3.setLayout(new BoxLayout(column3, BoxLayout.Y_AXIS));
        buttonPanel.add(column3);

        column3.add(divButton);
        column3.add(numButton9);
        column3.add(numButton6);
        column3.add(numButton3);
        column3.add(inverseButton);
    }

    private void addColumn4() {
        column4 = new JPanel();
        column4.setLayout(new BoxLayout(column4, BoxLayout.Y_AXIS));
        buttonPanel.add(column4);

        column4.add(mulButton);
        column4.add(subButton);
        column4.add(addButton);
        column4.add(equalsButton);
    }

    public JButton getClearButton() {
        return clearButton;
    }

    public void visible() {
        frame.setVisible(true);
    }
}