package week7.day2.calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcController {
  private CalcView view;
  private CalculatorModel model;

  public CalcController(CalcView view, CalculatorModel model) {
    this.view = view;
    this.model = model;
    this.view.setActionListener(new CalcListener());
  }

  private class CalcListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
//      int firsNUmber, secondNumber = 0;
      int firstNumber = 0;
      int secondNumber = 0;

      try {
        firstNumber = view.getFirstNumber();
        secondNumber = view.getSecondNumber();
        int result = model.addTwoNumbers(firstNumber, secondNumber);
        view.showResult(result);
      } catch (NumberFormatException ex) {
        view.showError(ex.getMessage());
      }
    }
  }
}
