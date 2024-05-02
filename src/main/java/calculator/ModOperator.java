package calculator;

public class ModOperator extends ArithmeticCalculator {

  @Override
  public double operate(Double firstNumber, Double secondNumber) {
    return firstNumber % secondNumber;
  }
}
