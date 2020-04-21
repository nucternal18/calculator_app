package com.calculater_app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private static JTextField calcTxtField;
    private static JRadioButton ONRadioButton;
    private static JRadioButton OFFRadioButton;
    private static JButton button1;
    private static JButton button2;
    private static JButton button3;
    private static JButton button4;
    private static JButton button5;
    private static JButton button6;
    private static JButton button7;
    private static JButton button8;
    private static JButton button9;
    private static JButton button0;
    private static JButton button11;
    private static JButton button12;
    private static JButton button13;
    private static JButton button14;
    private static JButton button15;
    private static JButton button16;
    private static JButton button17;
    private static JButton button18;
    private static JLabel midCalcLabel;

    static double num;
    static double ans;
    static int calculation;

    // Declaration of object of ButtonGroup class.
    static ButtonGroup G1;

    public Calculator() {
        ONRadioButton.setEnabled(false); // Disable ON button
    }

    public static void arithmetic_operation(){
        switch (calculation){
            case 1: //Addition
                ans = num + Double.parseDouble(calcTxtField.getText());
                calcTxtField.setText(Double.toString(ans));
                break;
            case 2: // Subtraction
                ans = num - Double.parseDouble(calcTxtField.getText());
                calcTxtField.setText(Double.toString(ans));
                break;
            case 3: // Multiplication
                ans = num * Double.parseDouble(calcTxtField.getText());
                calcTxtField.setText(Double.toString(ans));
                break;
            case 4: // Division
                ans = num / Double.parseDouble(calcTxtField.getText());
                calcTxtField.setText(Double.toString(ans));
                break;
        }
    }


    public static void disableOFF(){
        calcTxtField.setText("");
        calcTxtField.setEnabled(false);

        ONRadioButton.setEnabled(true); // enable the on button
        OFFRadioButton.setEnabled(false); // disable the off button

        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
        button0.setEnabled(false);
        button11.setEnabled(false);
        button12.setEnabled(false);
        button13.setEnabled(false);
        button14.setEnabled(false);
        button15.setEnabled(false);
        button16.setEnabled(false);
        button17.setEnabled(false);
        button18.setEnabled(false);
    }

    public static void enableOn(){
        calcTxtField.setEnabled(true);

        ONRadioButton.setEnabled(false); // disable the on button
        OFFRadioButton.setEnabled(true); // disable the off button

        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        button0.setEnabled(true);
        button11.setEnabled(true);
        button12.setEnabled(true);
        button13.setEnabled(true);
        button14.setEnabled(true);
        button15.setEnabled(true);
        button16.setEnabled(true);
        button17.setEnabled(true);
        button18.setEnabled(true);
    }




    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel calcPanel = new JPanel();
        frame.setLocation(500, 250);
        frame.setSize(320,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(calcPanel);

        calcPanel.setLayout(null);

        G1 = new ButtonGroup();

        midCalcLabel = new JLabel();
        midCalcLabel.setForeground(Color.RED);
        midCalcLabel.setBounds(240, 5, 50, 25);
        midCalcLabel.setHorizontalAlignment(JLabel.RIGHT);
        calcPanel.add(midCalcLabel);

        calcTxtField = new JTextField();
        calcTxtField.setBounds(50,20,242,50);
        calcTxtField.setHorizontalAlignment(JTextField.RIGHT);
        calcPanel.add(calcTxtField);

        ONRadioButton = new JRadioButton();
        ONRadioButton.setText("ON");
        ONRadioButton.setBounds(50,60,80,50);
        ONRadioButton.setHorizontalAlignment(JTextField.LEFT);
        ONRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enableOn(); // call enable method
            }
        });
        calcPanel.add(ONRadioButton);

        OFFRadioButton = new JRadioButton();
        OFFRadioButton.setText("OFF");
        OFFRadioButton.setBounds(50,80,80,50);
        OFFRadioButton.setHorizontalAlignment(JTextField.LEFT);
        OFFRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                disableOFF(); // call disable method
            }
        });
        calcPanel.add(OFFRadioButton);

        G1.add(ONRadioButton);
        G1.add(OFFRadioButton);

        button1 = new JButton("<-");
        button1.setBounds(110, 70, 50, 50);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int length = calcTxtField.getText().length();
                int number = calcTxtField.getText().length() - 1;
                String store;

                if(length > 0){
                    StringBuilder back = new StringBuilder(calcTxtField.getText());
                    back.deleteCharAt(number);
                    store = back.toString();
                    calcTxtField.setText(store);
                }
            }
        });
        calcPanel.add(button1);

        button2 = new JButton("C");
        button2.setBounds(180, 70, 50, 50);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcTxtField.setText("");
            }
        });
        calcPanel.add(button2);


        // Addition button
        button3 = new JButton("+");
        button3.setBounds(240, 70, 50, 50);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(calcTxtField.getText());
                calculation = 1;
                calcTxtField.setText("");
                midCalcLabel.setText(num + "+");

            }
        });
        calcPanel.add(button3);

        // Subtraction button
        button4 = new JButton("-");
        button4.setBounds(50, 130, 50, 50);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(calcTxtField.getText());
                calculation = 2;
                calcTxtField.setText("");
                midCalcLabel.setText(num + "-");
            }
        });
        calcPanel.add(button4);

        // Division button
        button5 = new JButton("/");
        button5.setBounds(110, 130, 50, 50);
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(calcTxtField.getText());
                calculation = 4;
                calcTxtField.setText("");
                midCalcLabel.setText(num + "/");
            }
        });
        calcPanel.add(button5);

        //Multiplication button
        button6 = new JButton("*");
        button6.setBounds(180, 130, 50, 50);
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(calcTxtField.getText());
                calculation = 3;
                calcTxtField.setText("");
                midCalcLabel.setText(num + "*");
            }
        });
        calcPanel.add(button6);

        // Equals button
        button18 = new JButton("=");
        button18.setBounds(180, 310, 100, 50);
        button18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arithmetic_operation();
                midCalcLabel.setText("");
            }
        });
        calcPanel.add(button18);


        button7 = new JButton("1");
        button7.setBounds(240, 130, 50, 50);
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcTxtField.setText(calcTxtField.getText() + "1");
            }
        });
        calcPanel.add(button7);

        button8 = new JButton("2");
        button8.setBounds(50, 190, 50, 50);
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcTxtField.setText(calcTxtField.getText() + "2");
            }
        });
        calcPanel.add(button8);

        button9 = new JButton("3");
        button9.setBounds(110, 190, 50, 50);
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcTxtField.setText(calcTxtField.getText() + "3");
            }
        });
        calcPanel.add(button9);

        button0 = new JButton("4");
        button0.setBounds(180, 190, 50, 50);
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcTxtField.setText(calcTxtField.getText() + "4");
            }
        });
        calcPanel.add(button0);

        button11 = new JButton("5");
        button11.setBounds(240, 190, 50, 50);
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcTxtField.setText(calcTxtField.getText() + "5");
            }
        });
        calcPanel.add(button11);

        button12 = new JButton("6");
        button12.setBounds(50, 250, 50, 50);
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcTxtField.setText(calcTxtField.getText() + "6");
            }
        });
        calcPanel.add(button12);

        button13 = new JButton("7");
        button13.setBounds(110, 250, 50, 50);
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcTxtField.setText(calcTxtField.getText() + "7");
            }
        });
        calcPanel.add(button13);

        button14 = new JButton("8");
        button14.setBounds(180, 250, 50, 50);
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcTxtField.setText(calcTxtField.getText() + "8");
            }
        });
        calcPanel.add(button14);

        button15 = new JButton("9");
        button15.setBounds(240, 250, 50, 50);
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcTxtField.setText(calcTxtField.getText() + "9");
            }
        });
        calcPanel.add(button15);

        button16 = new JButton("0");
        button16.setBounds(50, 310, 50, 50);
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcTxtField.setText(calcTxtField.getText() + "0");
            }
        });
        calcPanel.add(button16);

        button17 = new JButton(".");
        button17.setBounds(110, 310, 50, 50);
        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcTxtField.setText(calcTxtField.getText() + ".");
            }
        });
        calcPanel.add(button17);



        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
