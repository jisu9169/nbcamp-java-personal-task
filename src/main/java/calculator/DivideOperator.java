package calculator;

public class DivideOperator implements Operator{

  @Override
  public double operate(Double firstNumber, Double secondNumber) {
    if (secondNumber == 0) {
      throw new ArithmeticException("Divide by zero");
    }
    return (double) firstNumber / secondNumber;
  }
}

