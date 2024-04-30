package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class ArithmeticCalculator extends Calculator {

  private final Queue<Double> arithmeticQue;

  public ArithmeticCalculator() {
    this.arithmeticQue = new LinkedList<>();
  }

  @Override
  public void calculate(int firstNumber, int secondNumber, char operator) {
    switch (operator) {
      case '+'->  arithmeticQue.add((double) (firstNumber + secondNumber));
      case '-'->  arithmeticQue.add((double) (firstNumber - secondNumber));
      case '*'->  arithmeticQue.add((double) (firstNumber * secondNumber));
      case '/'->  arithmeticQue.add((double) (firstNumber / secondNumber));
      default -> throw new IllegalArgumentException("Invalid operator");
    }
  }

  @Override
  public void calculate(int radius) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void inquiry() {
    for (Double v : arithmeticQue) {
      System.out.print(v+ " ");
    }
    System.out.println();
  }
}
