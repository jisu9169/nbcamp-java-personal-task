package calculator;


import java.util.Scanner;

public class App {

  public static void main(String[] args) throws IllegalAccessException {

    Scanner sc = new Scanner(System.in);

    System.out.print("첫 번째 숫자를 입력 하세요:");
    int num1 = sc.nextInt();
    System.out.print("두 번째 숫자를 입력 하세요:");
    int num2 = sc.nextInt();
    System.out.print("사칙 연산 기호를 입력 하세요: ");
    char operator = sc.next().charAt(0);
    switch (operator) {
      case '+' -> {
        Calculator calculator = new Calculator(new AddOperator());
        System.out.println(calculator.getArithmeticCalculator().operate(num1, num2));
      }
      case '-' -> {
        Calculator calculator = new Calculator(new SubtractOperator());
        System.out.println(calculator.getArithmeticCalculator().operate(num1, num2));
      }
      case '*' -> {
        Calculator calculator = new Calculator(new MultiplyOperator());
        System.out.println(calculator.getArithmeticCalculator().operate(num1, num2));
      }
      case '/' -> {
        Calculator calculator = new Calculator(new DivideOperator());
        System.out.println(calculator.getArithmeticCalculator().operate(num1, num2));
      }
      case '%' -> {
        Calculator calculator = new Calculator(new ModOperator());
        System.out.println(calculator.getArithmeticCalculator().operate(num1, num2));
      }
      default -> throw new IllegalAccessException();
    }


    sc.close();
  }
}