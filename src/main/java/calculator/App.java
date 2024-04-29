package calculator;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    Queue<Integer> que = new LinkedList<>();

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
      que.offer(result);
      System.out.println("결과: " + result);
      System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)  ");
      String remove = sc.next();
      if (remove.equals("remove")) {
        System.out.println(que.poll() + " =  최근 값 삭제");
      }
      System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)  ");
      String inquiry = sc.next();
      if (inquiry.equals("inquiry")) {
        while (!que.isEmpty()) {
          System.out.print("  " + que.poll());
        }
        System.out.println();
      }
      System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)  ");
      String answer = sc.next();
      if (answer.equals("exit")) {
        break;
      }
    }

    sc.close();
  }
}
