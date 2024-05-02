package calculator;

public class MultiplyOperator implements Operator {

  @Override
  public double operate(Double firstNumber, Double secondNumber) {
    return firstNumber * secondNumber;
  }
}
