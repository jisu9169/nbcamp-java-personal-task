package calculator;

import java.util.HashMap;
import java.util.Map;

public class OperatorFactory {

  private final Map<Character, Operator> operatorMap;

  public OperatorFactory() {
    operatorMap = new HashMap<>();
    operatorMap.put('+', new AddOperator());
    operatorMap.put('-', new SubtractOperator());
    operatorMap.put('*', new MultiplyOperator());
    operatorMap.put('/', new DivideOperator());
    operatorMap.put('%', new ModOperator());
  }

  public Operator getOperator(char operator) {
    Operator op = operatorMap.get(operator);
    if(op == null) {
      throw  new IllegalArgumentException("올바른 선택이 " + operator + "아닙니다.");
    }
    return op;
  }
}
