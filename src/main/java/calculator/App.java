package calculator;


import java.util.Objects;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws IllegalAccessException {

    Scanner sc = new Scanner(System.in);
    ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator<>(Double.class);
    CircleCalculator circleCalculator = new CircleCalculator();

    while (true) {
      System.out.print("원의 넓이를 구하시겠습니까? 연산을 하시겠습니까? ['원 = 1' or '연산 = 2'] ");
      String select = sc.next();
      if (select.equals("1")) {
        System.out.print("반지름 길이를 입력하세요 : ");
        Double radius = sc.nextDouble();
        circleCalculator.getCircleList().add(circleCalculator.calculator(radius));

        System.out.print("최근 계산된 원의 넓이 값을 삭제 하시겠습니까?:[remove 출력] ");
        String remove = sc.next();
        if (remove.equals("remove")) {
          circleCalculator.resultRemove();
        }
        System.out.print("원이 넓이 리스트를 출력 하시겠습니까?:[inquiry 출력] ");
        String inquiry = sc.next();
        if (inquiry.equals("inquiry")) {
          circleCalculator.inquiryResults();
        }

      } else if (select.equals("2")) {
        System.out.print("첫 번째 숫자를 입력 하세요: ");
        Double firstNumber = sc.nextDouble();
        System.out.print("두 번째 숫자를 입력 하세요: ");
        Double secondNumber = sc.nextDouble();
        System.out.print("사칙 연산 기호를 입력 하세요: ");
        char operator = sc.next().charAt(0);
        arithmeticCalculator.getArithemeticList()
            .add((Double) arithmeticCalculator.calculator(operator, firstNumber, secondNumber));

        System.out.print("최근 계산된 연산 값을 삭제 하시겠습니까?:[remove 출력] ");
        String remove = sc.next();
        if (remove.equals("remove")) {
          arithmeticCalculator.resultRemove();
        }
        System.out.print("연산 리스트를 출력 하시겠습니까?:[inquiry 출력] ");
        String inquiry = sc.next();
        if (inquiry.equals("inquiry")) {
          arithmeticCalculator.inquiryResults();
        }
        System.out.println("저장된 연산결과 중 입력한 값보다 큰 값을 조회하시겠습니까? [lambda 입력시 조회]");
        if(Objects.equals(sc.next(), "lambda")) {
          System.out.println("기준 값을 입력하세요. ");
          Double number = sc.nextDouble();
          arithmeticCalculator.printResultGreaterThan(number);
        }

      } else {
        throw new IllegalAccessException();
      }

      System.out.print("계산 더 하시겠습니까? [ 종료 : exit] ");
      String exit = sc.next();
      if (exit.equals("exit")) {
        break;
      }
    }
    sc.close();
  }
}