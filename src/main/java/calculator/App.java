package calculator;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    int[] arr = new int[10];
    int index = 0;

    Scanner sc = new Scanner(System.in);
    System.out.print("첫 번째 숫자를 입력하세요: ");
    int result = sc.nextInt();

    while (true) {
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
      arr[index++ % 10] = result;
      System.out.println(index + "번째 계산 결과: " + result);
      System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)");
      String answer = sc.next();
      if (answer.equals("exit")) {
        break;
      }
    }
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
