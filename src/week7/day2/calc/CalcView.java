package week7.day2.calc;

import java.awt.event.ActionListener;
import javax.swing.*;

public class CalcView extends JFrame {

  private JTextField firstNumberTextField;
  private JTextField secondNumberTextField;
  private JTextField resultTextField;
  private JButton calcButton;


  public CalcView() {
    super("Calculator");
    init();
  }

  private void init() {
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setSize(600, 200);
    setResizable(false);
    firstNumberTextField = new JTextField(5);
    secondNumberTextField = new JTextField(5);
    resultTextField = new JTextField(5);
    calcButton = new JButton("calculate");


    JPanel panel = new JPanel();
    panel.add(firstNumberTextField);
    panel.add(new JLabel("+"));
    panel.add(secondNumberTextField);
    panel.add(new JLabel("="));
    panel.add(resultTextField);
    panel.add(calcButton);

    this.add(panel);
  }

  public int getFirstNumber() {
    return Integer.parseInt(firstNumberTextField.getText());
  }

  public int getSecondNumber() {
    return Integer.parseInt(secondNumberTextField.getText());
  }

  public void showResult(int result) {
    resultTextField.setText(String.valueOf(result));
  }

  public void setActionListener(ActionListener listener) {
    calcButton.addActionListener(listener);
  }

  public void showError(String errorMessage) {
    JOptionPane.showMessageDialog(this, errorMessage);
  }
}
