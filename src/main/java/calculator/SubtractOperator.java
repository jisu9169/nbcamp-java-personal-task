package calculator;

public class SubtractOperator implements Operator {

  @Override
  public double operate(Double firstNumber, Double secondNumber) {
    return firstNumber - secondNumber;
  }
}
