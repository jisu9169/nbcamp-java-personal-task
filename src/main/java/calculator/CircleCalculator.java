package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class CircleCalculator extends Calculator {

  private static final Double pie = 3.14;

  private final Queue<Double> circleQue;

  public CircleCalculator() {
    this.circleQue = new LinkedList<>();
  }

  @Override
  public void calculate(int firstNumber, int secondNumber, char operator) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void calculate(int radius) {
    circleQue.add(pie * radius * radius);
  }

  @Override
  public void inquiry() {
    for (Double v : circleQue) {
      System.out.print(v+" ");
    }
    System.out.println();
  }
}
