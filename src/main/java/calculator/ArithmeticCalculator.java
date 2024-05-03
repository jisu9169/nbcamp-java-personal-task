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
    for (Double v : super.getArithemeticList()) {
      System.out.print(v + " ");
    }
    System.out.println();
  }

  @Override
  void resultRemove() {
    super.arithemeticList.removeFirst();
  }

  /**
   * 저장된 결과 중 입력값보다 큰 결과값들을 출력/조회 하는 메서드
   * */
  public void printResultGreaterThan(double number) {
    super.getArithemeticList()
        .stream()
        .filter(result ->result > number)
        .forEach(result -> System.out.println("연살결과 = " + result));

  }
}
