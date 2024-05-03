package calculator;

import java.util.HashMap;
import java.util.Map;

public class ArithmeticCalculator<T extends Number> extends Calculator {

  public final Class<T> type;
  private final OperatorFactory operatorFactory;

  public ArithmeticCalculator(Class<T> type) {
    this.type = type;
    this.operatorFactory = new OperatorFactory(type);
  }

  private static final Map<String, Operator> map = new HashMap<>();

  public T calculator(char operator, T firstNumber, T secondNumber) {
    return (T) operatorFactory.getOperator(operator).operate(firstNumber, secondNumber);
  }

  @Override
  void inquiryResults() {
    for (Object v : super.getArithemeticList()) {
      System.out.print(v + " ");
    }
    System.out.println();
  }

  @Override
  void resultRemove() {
    super.arithemeticList.removeFirst();
  }
}
