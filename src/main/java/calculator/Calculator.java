package calculator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Calculator {

  private int firstNumber;
  private int secondNumber;
  private char operator;
  private final Queue<Integer> result;

  private static final double pie = 3.14;
  private int radius;
  private final List<Double> circleResult;


  public Calculator() {
    result = new LinkedList<>();
    circleResult = new ArrayList<>();
  }

  public void setFirstNumber(int firstNumber) {
    this.firstNumber = firstNumber;
  }

  public void setSecondNumber(int secondNumber) {
    this.secondNumber = secondNumber;
  }

  public void setOperator(char operator) {
    this.operator = operator;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public Queue<Integer> getResult() {
    return result;
  }

  public void removeResult() {
    if (!result.isEmpty()) {
      result.poll();
    }
  }

  public void inquiryCircleResult() {
    for (Double c : circleResult) {
      System.out.print(c+" ");
    }
    System.out.println();
  }

  public void inquiryResults() {
    if(result.isEmpty()) {
      return;
    }
    for (Integer integer : result) {
      System.out.print(" " + integer);
    }
    System.out.println();
  }

  public void calculateCircleArea() {
    circleResult.add(radius * radius * pie);
  }

  public void calculate()
      throws IllegalAccessException {
    if (operator == '+') {
      result.add((firstNumber + secondNumber));
    } else if (operator == '-') {
      result.add((firstNumber - secondNumber));
    } else if (operator == '*') {
      result.add((firstNumber * secondNumber));
    } else if (operator == '/') {
      if (secondNumber == 0) {
        throw new IllegalAccessException(" 분모 값을" + secondNumber + " 잘못 입력하셨습니다.");
      }
      result.add((firstNumber / secondNumber));
    } else {
      throw new IllegalAccessException("사칙 연산값이 " + operator + " 로 아닙니다.");
    }
  }
}