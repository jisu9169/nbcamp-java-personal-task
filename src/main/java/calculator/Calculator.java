package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

  List<Integer> li = new ArrayList<>();

  public List<Integer> calculate(int firstNumber, int secondNumber, char operator)
      throws IllegalAccessException {
    if (operator == '+') {
      li.add((firstNumber + secondNumber));
    } else if (operator == '-') {
      li.add((firstNumber - secondNumber));
    } else if (operator == '*') {
      li.add((firstNumber * secondNumber));
    } else if (operator == '/') {
      if (secondNumber == 0) {
        throw new IllegalAccessException(" 분모 값을" + secondNumber + " 잘못 입력하셨습니다.");
      }
      li.add( (firstNumber / secondNumber));
    } else {
      throw new IllegalAccessException("사칙 연산값이 " + operator + " 로 아닙니다.");
    }
    return li;
  }
}