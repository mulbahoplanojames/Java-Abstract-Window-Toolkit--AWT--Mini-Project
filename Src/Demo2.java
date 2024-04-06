package Src;

import java.awt.*;

public class Demo2 {

    public static void main(String[] args) {

        // Frame Objects and its methods
        Frame mainFrame = new Frame("A java Mini project");
        mainFrame.setSize(600, 600);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
        mainFrame.setResizable(false);

        // Title label and its methods
        Label titleLabel = new Label("Please Fill This Form to Store Students Marks");
        titleLabel.setBounds(20, 40, 540, 30);
        titleLabel.setFont(new Font("Times Roman", Font.BOLD, 20));
        titleLabel.setForeground(new Color(124, 35, 239));
        mainFrame.add(titleLabel);

        // Module One Label and TextField Objects an its methods
        Label numberOneLabel = new Label("Number 1:");
        numberOneLabel.setBounds(30, 100, 100, 30);
        numberOneLabel.setFont(new Font("Times Roman", Font.BOLD, 17));
        mainFrame.add(numberOneLabel);

        TextField numberOneTextField = new TextField();
        numberOneTextField.setBounds(150, 100, 300, 30);
        mainFrame.add(numberOneTextField);

        // Module Two Label and TextField Objects an its methods
        Label numberTwoLabel = new Label("Number 2:");
        numberTwoLabel.setBounds(30, 160, 100, 30);
        numberTwoLabel.setFont(new Font("Times Roman", Font.BOLD, 17));
        mainFrame.add(numberTwoLabel);

        TextField numberTwoTextField = new TextField();
        numberTwoTextField.setBounds(150, 160, 300, 30);
        mainFrame.add(numberTwoTextField);

        // Out of marks Label and TextField Objects and its methods
        Label resultLabel = new Label("Result:");
        resultLabel.setBounds(30, 270, 80, 30);
        resultLabel.setFont(new Font("Times Roman", Font.BOLD, 17));
        mainFrame.add(resultLabel);

        TextField resultTextField = new TextField();
        resultTextField.setBounds(130, 270, 300, 30);
        mainFrame.add(resultTextField);

        // Percentage Button
        Button addButton = new Button("+");
        addButton.setBounds(30, 340, 70, 40);
        addButton.setBackground(Color.black);
        addButton.setForeground(Color.white);
        addButton.setFont(new Font("consolas", Font.BOLD, 17));
        mainFrame.add(addButton);

        // Total Button
        Button subtractButton = new Button("-");
        subtractButton.setBounds(130, 340, 70, 40);
        subtractButton.setBackground(Color.black);
        subtractButton.setForeground(Color.white);
        subtractButton.setFont(new Font("consolas", Font.BOLD, 17));
        mainFrame.add(subtractButton);

        // Average Button
        Button dividButton = new Button("/");
        dividButton.setBounds(240, 340, 70, 40);
        dividButton.setBackground(Color.black);
        dividButton.setForeground(Color.white);
        dividButton.setFont(new Font("consolas", Font.BOLD, 17));
        mainFrame.add(dividButton);

        Button modularButton = new Button("%");
        modularButton.setBounds(340, 340, 70, 40);
        modularButton.setBackground(Color.black);
        modularButton.setForeground(Color.white);
        modularButton.setFont(new Font("consolas", Font.BOLD, 17));
        mainFrame.add(modularButton);

        Button multiplyButton = new Button("*");
        multiplyButton.setBounds(450, 340, 70, 40);
        multiplyButton.setBackground(Color.black);
        multiplyButton.setForeground(Color.white);
        multiplyButton.setFont(new Font("consolas", Font.BOLD, 17));
        mainFrame.add(multiplyButton);

        addButton.addActionListener(e -> {
            double numberOne = Integer.parseInt(numberOneTextField.getText());
            double numberTwo = Integer.parseInt(numberTwoTextField.getText());

            double sum = numberOne + numberTwo;

            resultTextField.setText(String.valueOf(sum));
        });

        subtractButton.addActionListener(e -> {
            double numberOne = Integer.parseInt(numberOneTextField.getText());
            double numberTwo = Integer.parseInt(numberTwoTextField.getText());

            double subtract = numberOne - numberTwo;

            resultTextField.setText(String.valueOf(subtract));
        });

        dividButton.addActionListener(e -> {
            double numberOne = Integer.parseInt(numberOneTextField.getText());
            double numberTwo = Integer.parseInt(numberTwoTextField.getText());

            double divide = numberOne / numberTwo;

            resultTextField.setText(String.valueOf(divide));
        });

        modularButton.addActionListener(e -> {
            double numberOne = Integer.parseInt(numberOneTextField.getText());
            double numberTwo = Integer.parseInt(numberTwoTextField.getText());

            double modular = numberOne % numberTwo;

            resultTextField.setText(String.valueOf(modular));
        });

        multiplyButton.addActionListener(e -> {
            double numberOne = Integer.parseInt(numberOneTextField.getText());
            double numberTwo = Integer.parseInt(numberTwoTextField.getText());

            double multiply = numberOne * numberTwo;

            resultTextField.setText(String.valueOf(multiply));
        });

    }
}
