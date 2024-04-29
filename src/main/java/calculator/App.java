package calculator;


import java.util.Queue;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws IllegalAccessException {

    Calculator calculator = new Calculator();

    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("원의 넓이는 값 구한다 (원의 넓이값 구하면 'true' 입력 사칙 연산 계산이면 'false' 입력:)");
      boolean circleIs = sc.nextBoolean();
      if (circleIs) {
        System.out.print("반 지름을 입력 하세요:");
        int radius = sc.nextInt();
        calculator.setRadius(radius);
        calculator.calculateCircleArea();
        calculator.inquiryCircleResult();
      } else {
        System.out.print("첫 번째 숫자를 입력 하세요:");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력 하세요:");
        int num2 = sc.nextInt();
        System.out.print("사칙 연산 기호를 입력 하세요: ");
        char operator = sc.next().charAt(0);

        calculator.setFirstNumber(num1);
        calculator.setSecondNumber(num2);
        calculator.setOperator(operator);
        calculator.calculate();

        System.out.println("최근 저장된 결과값 '삭제' 하시겠습니까? (remove 입력시 삭제)");
        String remove = sc.next();
        if (remove.equals("remove")) {
          calculator.removeResult();
        }

        System.out.println("계산된 결과 값들을 '출력' 하시겠습니까? (inquiry 입력 시 종료)");
        String inquiry = sc.next();
        if (inquiry.equals("inquiry")) {
          calculator.inquiryResults();
        }
      }

      System.out.println("계산을 더 하시겠습니까? (exit 입력 시 종료)");
      String exit = sc.next();
      if (exit.equals("exit")) {
        break;
      }
    }
    sc.close();
  }
}