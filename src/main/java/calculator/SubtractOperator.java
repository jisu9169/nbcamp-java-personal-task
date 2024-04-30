package calculator;

public class SubtractOperator extends ArithmeticCalculator{

  @Override
  public double operate(int firstNumber, int secondNumber) {
    return firstNumber-secondNumber;
  }
}
