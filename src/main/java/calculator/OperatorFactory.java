package calculator;

import java.util.HashMap;
import java.util.Map;

public class OperatorFactory<T extends Number> {

  public final Class<T> type;

  private final Map<
      OperatorType, Operator> operatorMap;

  public OperatorFactory(Class<T> type) {
    this.type = type;
    operatorMap = new HashMap<>();
    operatorMap.put(OperatorType.ADDITION, new AddOperator(type));
    operatorMap.put(OperatorType.SUBTRACTION, new SubtractOperator(type));
    operatorMap.put(OperatorType.MULTIPLICATION, new MultiplyOperator(type));
    operatorMap.put(OperatorType.DIVISION, new DivideOperator(type));
    operatorMap.put(OperatorType.MODULO, new ModOperator(type));
  }

  public Operator getOperator(char operator) {
    OperatorType operatorType = OperatorType.getOperatorType(operator);
   return operatorMap.get(operatorType);

  }
}
