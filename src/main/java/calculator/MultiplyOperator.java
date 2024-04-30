package calculator;

public class MultiplyOperator extends ArithmeticCalculator {

  @Override
  public double operate(int firstNumber, int secondNumber) {
    return firstNumber * secondNumber;
  }
}
