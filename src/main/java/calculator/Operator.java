package calculator;

public interface Operator<T extends Number> {

  T operate(T firstNumber, T secondNumber);

}
