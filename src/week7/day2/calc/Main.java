package week7.day2.calc;

public class Main {
  public static void main(String[] args) {
    CalcView view = new CalcView();
    CalculatorModel model = new CalculatorModel();
    CalcController controller = new CalcController(view, model);

    view.setVisible(true);

  }
}
