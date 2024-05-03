package calculator;

public class ModOperator<T extends Number> implements Operator<T> {

  public final Class<T> type;

  public ModOperator(Class<T> type) {
    this.type = type;
  }


  @Override
  public T operate(T firstNumber, T secondNumber) {
    double result = firstNumber.doubleValue() % secondNumber.doubleValue();
    return  NumberConversionUtils.convertNumberToType(result, type);
  }
}
