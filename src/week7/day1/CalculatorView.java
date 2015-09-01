package week7.day1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorView extends JFrame {

  private static final String TITLE = "Calc";
  private JTextField firstNumberTextField;
  private JTextField secondNumberTextField;
  private JTextField resultTextField;

  public CalculatorView() {
    super(TITLE);
    init();
  }

  private void init() {
    setSize(600, 300);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    int textFieldSize = 5;
    firstNumberTextField = new JTextField(textFieldSize);
    secondNumberTextField = new JTextField(textFieldSize);
    resultTextField = new JTextField(textFieldSize);
    resultTextField.setEditable(false);

    JButton calculateButton = new JButton("calculate");

    JPanel panel = new JPanel(new FlowLayout());
    panel.add(firstNumberTextField);
    panel.add(new JLabel("+"));
    panel.add(secondNumberTextField);
    panel.add(new JLabel("="));
    panel.add(resultTextField);
    panel.add(calculateButton);

    calculateButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          int result = Integer.parseInt(firstNumberTextField.getText())
            + Integer.parseInt(secondNumberTextField.getText());
          resultTextField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
          JOptionPane.showMessageDialog(getContentPane(), "You must input integer numbers", "Invalid input", JOptionPane.ERROR_MESSAGE);
        }
      }
    });

    getContentPane().add(panel);
  }
}
