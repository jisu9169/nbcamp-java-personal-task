package calculator;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    int[] arr = new int[10];
    int index = 0;

    Scanner sc = new Scanner(System.in);
    System.out.print("첫 번째 숫자를 입력하세요: ");
    int result = sc.nextInt();

    while (index != 10) {
      System.out.print("숫자를 입력하세요: ");
      int secondNumber = sc.nextInt();
      System.out.print("사칙연산 기호를 입력하세요: ");
      String operator = sc.next();
      result = switch (operator) {
        case "+" -> result + secondNumber;
        case "-" -> result - secondNumber;
        case "*" -> result * secondNumber;
        case "/" -> result / secondNumber;
        case "%" -> result % secondNumber;

        default -> throw new IllegalStateException("사칙 연산 기호가 '" + operator + "' 아닙니다. ");
      };
      System.out.println("결과: " + result);
      arr[index++] = result;
    }

  }
}
