package calculator;

public class AddOperator extends ArithmeticCalculator {

  @Override
  public double operate(int firstNumber, int secondNumber) {
    return firstNumber + secondNumber;
  }
}
