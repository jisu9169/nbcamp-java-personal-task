package calculator;


import java.util.Scanner;

public class App {

  public static void main(String[] args) throws IllegalAccessException {

    Scanner sc = new Scanner(System.in);
    Calculator calculator = new Calculator();

    while (true) {
      System.out.print("원의 넓이를 구하시겠습니까? ['원 = 1' or '연산 = 2'] ");
      String select = sc.nextLine();
      if (select.equals("1")) {
        System.out.print("반지름의 길이를 입력하세요 : ");
        Double radius = sc.nextDouble();
        calculator.selectCircleAreas(radius);

        System.out.print("최근 계산된 원의 넓이 값을 삭제 하시겠습니까?:[yes 출력] ");
        String remove = sc.next();
        if(remove.equals("remove")) {
          calculator.circleListRemove();
        }
        System.out.print("원이 넓이 리스트를 출력 하시겠습니까?:[yes 출력] ");
        String inquiry = sc.next();
        if(inquiry.equals("inquiry")) {
          calculator.CircleListInquiry();
        }

      } else if(select.equals("2")) {
        System.out.print("첫 번째 숫자를 입력 하세요: ");
        Double firstNumber = sc.nextDouble();
        System.out.print("두 번째 숫자를 입력 하세요: ");
        Double secondNumber = sc.nextDouble();
        System.out.print("사칙 연산 기호를 입력 하세요: ");
        char operator = sc.next().charAt(0);
        calculator.selectArithmeticCalculator(operator, firstNumber, secondNumber);
      }else{
        throw new IllegalAccessException();
      }

      System.out.print("최근 계산된 연산 값을 삭제 하시겠습니까?:[yes 출력] ");
      String remove = sc.next();
      if(remove.equals("remove")) {
        calculator.arithmeticListRemove();
      }
      System.out.print("연산 리스트를 출력 하시겠습니까?:[yes 출력] ");
      String inquiry = sc.next();
      if(inquiry.equals("inquiry")) {
        calculator.arithmeticListInquiry();
      }

      System.out.print("계산 더 하시겠습니까? [ 종료 : exit] ");
      String exit = sc.next();
      if(exit.equals("exit")){
        break;
      }
    }
    sc.close();
  }
}