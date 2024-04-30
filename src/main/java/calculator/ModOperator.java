package calculator;

public class ModOperator extends ArithmeticCalculator {

  @Override
  public double operate(int firstNumber, int secondNumber) {
    return firstNumber % secondNumber;
  }
}
