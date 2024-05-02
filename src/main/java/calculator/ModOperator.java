package calculator;

public class ModOperator implements Operator {

  @Override
  public double operate(Double firstNumber, Double secondNumber) {
    return firstNumber % secondNumber;
  }
}
