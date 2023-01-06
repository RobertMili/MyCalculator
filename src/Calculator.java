import javax.swing.*;
import java.awt.*;



public class Calculator {

    private javax.swing.JPanel Calculator;
    private JTextField textResultat;
    private JButton button8;
    private JButton button7;
    private JButton button9;
    private JButton button6;
    private JButton button5;
    private JButton button4;
    private JButton button3;
    private JButton button2;
    private JButton button1;
    private JButton buttonEqual;
    private JButton buttonPLus;
    private JButton buttonMinus;
    private JButton buttonDelete;
    private JButton btnDivide;
    private JButton btnMultiply;
    private JTextField secondTxtField;

    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;

    public Calculator() {
        button1.addActionListener(e -> {
            font72();
            String display = textResultat.getText() + button1.getText();
            textResultat.setText(display);

            printOutRightSide();

        });
        button2.addActionListener(e -> {
            font72();
            String display = textResultat.getText() + button2.getText();
            textResultat.setText(display);

            printOutRightSide();
        });
        button3.addActionListener(e -> {
            font72();
            String display = textResultat.getText() + button3.getText();
            textResultat.setText(display);
            printOutRightSide();

        });
        button4.addActionListener(e -> {
            font72();
            String display = textResultat.getText() + button4.getText();
            textResultat.setText(display);
            printOutRightSide();

        });
        button5.addActionListener(e -> {
            font72();
            String display = textResultat.getText() + button5.getText();
            textResultat.setText(display);
            printOutRightSide();
        });
        button6.addActionListener(e -> {
            font72();
            String display = textResultat.getText() + button6.getText();
            textResultat.setText(display);
            printOutRightSide();

        });
        button7.addActionListener(e -> {
            font72();
            String display = textResultat.getText() + button7.getText();
            textResultat.setText(display);
            printOutRightSide();

        });
        button8.addActionListener(e -> {
            font72();
            String display = textResultat.getText() + button8.getText();
            textResultat.setText(display);
            printOutRightSide();

        });
        button9.addActionListener(e -> {
            font72();
            String display = textResultat.getText() + button9.getText();
            textResultat.setText(display);
            printOutRightSide();

        });
        btnMultiply.addActionListener(e -> {
            String btnText = btnMultiply.getText();
            getOperator(btnText);

        });
        btnDivide.addActionListener(e -> {
            String btnText = btnDivide.getText();
            getOperator(btnText);

        });

        buttonPLus.addActionListener(e -> {

            String buttonText = buttonPLus.getText();

            getOperator(buttonText);

            printOutRightSide();

        });
        buttonMinus.addActionListener(e -> {

            String btnText = buttonMinus.getText();
            getOperator(btnText);

            printOutRightSide();

        });


        buttonDelete.addActionListener(e -> {
            total2 = 0;
            textResultat.setText("");
            secondTxtField.setText("");
        });

            buttonEqual.addActionListener(e -> {

                switch (math_operator) {
                    case '+' -> total2 = total1 + Double.parseDouble(textResultat.getText());
                    case '-' -> total2 = total1 - Double.parseDouble(textResultat.getText());
                    case '/' -> total2 = total1 / Double.parseDouble(textResultat.getText());
                    case '*' -> total2 = total1 * Double.parseDouble(textResultat.getText());
                }

                secondTxtField.setText((int)total1 + "+" + textResultat.getText());
                String s1 = Double.toString(total2);
                textResultat.setText(s1);
                total1 = 0;

            });



    }

    private void font72() {
        Font font = textResultat.getFont();
        Font fontSecond = secondTxtField.getFont();
        float size = 72.0f;
        font = font.deriveFont(size);
        textResultat.setFont(font);
        secondTxtField.setFont(fontSecond);

    }

    private void getOperator(String btnText){
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(textResultat.getText());
        textResultat.setText("");


    }
    private void printOutRightSide() {
        textResultat.setHorizontalAlignment(textResultat.RIGHT);
        secondTxtField.setHorizontalAlignment(textResultat.RIGHT);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(new Dimension(800, 500));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
