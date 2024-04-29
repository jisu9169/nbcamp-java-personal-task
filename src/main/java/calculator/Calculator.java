package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
  List<Double> li = new ArrayList<>();

  public double calculate(int firstNumber, int secondNumber, char operator) throws IllegalAccessException {
    if(operator == '+') {
      return firstNumber + secondNumber;
    }else if(operator == '-') {
      return firstNumber - secondNumber;
    }else if(operator == '*') {
      return firstNumber * secondNumber;
    }else if(operator == '/') {
      if(secondNumber == 0) {
        throw new IllegalAccessException(" 분모 값을" + secondNumber + " 잘못 입력하셨습니다.");
      }
      return (double) firstNumber / secondNumber;
    }else{
      throw new IllegalAccessException("사칙 연산값이 " + operator+" 로 아닙니다.");
    }
  }
}