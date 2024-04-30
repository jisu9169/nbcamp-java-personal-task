package calculator;

public class DivideOperator extends ArithmeticCalculator{

  @Override
  public double operate(int firstNumber, int secondNumber) {
    if (secondNumber == 0) {
      throw new ArithmeticException("Divide by zero");
    }
    return (double) firstNumber / secondNumber;
  }
}

