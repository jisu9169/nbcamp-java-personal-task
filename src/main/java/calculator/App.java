package calculator;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("첫 번째 숫자를 입력하세요: ");
    int firstNumber = sc.nextInt();
    System.out.print("두 번째 숫자를 입력하세요: ");
    int secondNumber = sc.nextInt();
    System.out.print("사칙연산 기호를 입력하세요: ");
    String operator = sc.next();
    int result = switch (operator){
      case "+" -> firstNumber + secondNumber;
      case "-" -> firstNumber - secondNumber;
      case "*" -> firstNumber * secondNumber;
      case "/" -> firstNumber / secondNumber;
      case "%" -> firstNumber % secondNumber;

      default -> throw new IllegalStateException("사칙 연산 기호가 '" + operator + "' 아닙니다. ");
    };
    System.out.println("결과: " + result);

  }
}
