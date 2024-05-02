package calculator;

import java.util.List;

public class ArithmeticCalculator extends Calculator {

  public double calculator(char operator,Double firstNumber, Double secondNumber) {
    return operatorFactory(operator).operate(firstNumber, secondNumber);
  }

  private Operator operatorFactory(char operator) {
    return switch (operator) {
      case '+' -> new AddOperator();
      case '-' -> new SubtractOperator();
      case '*' -> new MultiplyOperator();
      case '/' -> new DivideOperator();
      case '%' -> new ModOperator();
      default -> throw new UnsupportedOperationException("올바른 선택이 아닙니다." + operator);
    };
  }

  @Override
  void inquiryResults() {
    for (Double v : super.getArithemeticList()) {
      System.out.print(v+ " ");
    }
    System.out.println();
  }

  @Override
  void resultRemove() {
    super.arithemeticList.removeFirst();
  }
}
