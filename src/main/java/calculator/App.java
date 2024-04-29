package calculator;


import java.util.List;
import java.util.Scanner;

public class App {

  static List<Integer> result;
  public static void main(String[] args) throws IllegalAccessException {

    Calculator calculator = new Calculator();

    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.print("첫 번째 숫자를 입력하세요:");
      int num1 = sc.nextInt();
      System.out.print("두 번째 숫자를 입력하세요:");
      int num2 = sc.nextInt();

      System.out.print("사칙연산 기호를 입력하세요: ");
      char operator = sc.next().charAt(0);

      result = calculator.calculate(num1, num2, operator);

      System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
      String exit = sc.next();
      if (exit.equals("exit")) {
        break;
      }
    }
    sc.close();
    for (Integer r: result) {
      System.out.print(r+ " ");
    }
  }
}