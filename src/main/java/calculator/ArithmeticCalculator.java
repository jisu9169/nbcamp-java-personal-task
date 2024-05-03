package calculator;

import java.util.HashMap;
import java.util.Map;

public class ArithmeticCalculator extends Calculator {

  private final OperatorFactory operatorFactory;

  private static final Map<String, Operator> map = new HashMap<>();

  public ArithmeticCalculator() {
    operatorFactory = new OperatorFactory();
  }

  public double calculator(char operator, Double firstNumber, Double secondNumber) {
    return operatorFactory.getOperator(operator).operate(firstNumber, secondNumber);
  }

  @Override
  void inquiryResults() {
    for (Double v : super.getArithemeticList()) {
      System.out.print(v + " ");
    }
    System.out.println();
  }

  @Override
  void resultRemove() {
    super.arithemeticList.removeFirst();
  }
}
