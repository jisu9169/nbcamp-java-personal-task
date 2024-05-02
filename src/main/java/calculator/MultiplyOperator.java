package calculator;

public class MultiplyOperator extends ArithmeticCalculator {

  @Override
  public double operate(Double firstNumber, Double secondNumber) {
    return firstNumber * secondNumber;
  }
}
