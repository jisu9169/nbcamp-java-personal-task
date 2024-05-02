package calculator;

public class SubtractOperator extends ArithmeticCalculator{

  @Override
  public double operate(Double firstNumber, Double secondNumber) {
    return firstNumber-secondNumber;
  }
}
