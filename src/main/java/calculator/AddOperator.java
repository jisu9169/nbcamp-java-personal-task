package calculator;

public class AddOperator extends ArithmeticCalculator {

  @Override
  public double operate(Double firstNumber, Double secondNumber) {
    return firstNumber + secondNumber;
  }
}
