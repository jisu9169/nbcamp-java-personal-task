package calculator;


import java.util.Scanner;

public class App {

  public static void main(String[] args) throws IllegalAccessException {

    Calculator arithmeticCalculator = new ArithmeticCalculator();
    Calculator circleCalculator = new CircleCalculator();

    Scanner sc = new Scanner(System.in);

    System.out.println("원의 넓이는 값 구한다 (원의 넓이값 구하면 'true' 입력 사칙 연산 계산이면 'false' 입력:)");
    boolean circleIs = sc.nextBoolean();
    if (circleIs) {
      System.out.print("반 지름을 입력 하세요:");
      int radius = sc.nextInt();
      circleCalculator.calculate(radius);
      circleCalculator.inquiry();
    } else {
      System.out.print("첫 번째 숫자를 입력 하세요:");
      int num1 = sc.nextInt();
      System.out.print("두 번째 숫자를 입력 하세요:");
      int num2 = sc.nextInt();
      System.out.print("사칙 연산 기호를 입력 하세요: ");
      char operator = sc.next().charAt(0);

      arithmeticCalculator.calculate(num1, num2, operator);
      arithmeticCalculator.inquiry();
    }

    sc.close();
  }
}