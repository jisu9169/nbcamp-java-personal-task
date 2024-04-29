package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {

  private int firstNumber;
  private int secondNumber;
  private char operator;

  private final Queue<Integer> result = new LinkedList<>();

  public Calculator() {
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

  public Calculator(int firstNumber, int secondNumber, char operator) {
    this.firstNumber = firstNumber;
    this.secondNumber = secondNumber;
    this.operator = operator;
  }

  public Queue<Integer> getResult() {
    return result;
  }

  public void removeResult(){
    if(!result.isEmpty()){
      result.poll();
    }
  }

  public void inquiryResults() {
    while(!result.isEmpty()){
      System.out.print(" "+ result.poll());
    }
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