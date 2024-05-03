package calculator;

import java.util.HashMap;
import java.util.Map;

public class OperatorFactory {

  private final Map<
      OperatorType, Operator> operatorMap;

  public OperatorFactory() {
    operatorMap = new HashMap<>();
    operatorMap.put(OperatorType.ADDITION, new AddOperator());
    operatorMap.put(OperatorType.SUBTRACTION, new SubtractOperator());
    operatorMap.put(OperatorType.MULTIPLICATION, new MultiplyOperator());
    operatorMap.put(OperatorType.DIVISION, new DivideOperator());
    operatorMap.put(OperatorType.MODULO, new ModOperator());
  }

  public Operator getOperator(char operator) {
    OperatorType operatorType = OperatorType.getOperatorType(operator);
   return operatorMap.get(operatorType);

  }
}
