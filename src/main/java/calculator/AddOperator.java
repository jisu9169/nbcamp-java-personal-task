package calculator;

public class AddOperator implements Operator {

  @Override
  public double operate(Double firstNumber, Double secondNumber) {
    return firstNumber + secondNumber;
  }
}
