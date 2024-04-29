package calculator;


import java.util.Queue;
import java.util.Scanner;

public class App {

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

      calculator.setFirstNumber(num1);
      calculator.setSecondNumber(num2);
      calculator.setOperator(operator);
      calculator.calculate();

      System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
      String exit = sc.next();
      if (exit.equals("exit")) {
        break;
      }
    }
    Queue<Integer> result = calculator.getResult();
    sc.close();
    while (!result.isEmpty()) {
      System.out.println(result.poll());
    }
  }
}