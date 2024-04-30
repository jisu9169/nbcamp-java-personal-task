package calculator;

public class Calculator {

  private final ArithmeticCalculator arithmeticCalculator;

  public Calculator(ArithmeticCalculator arithmeticCalculator) {
    this.arithmeticCalculator = arithmeticCalculator;
  }

  public ArithmeticCalculator getArithmeticCalculator() {
    return arithmeticCalculator;
  }
}