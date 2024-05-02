package calculator;

import java.util.ArrayList;
import java.util.List;


public class Calculator {

  List<Double> arithemeticList = new ArrayList<>();
  List<Double> circleList = new ArrayList<>();

  public void selectCircleAreas(Double radius) {
    CircleArea circleArea = new CircleArea();
    circleList.add(circleArea.operate(radius));
  }

  public void selectArithmeticCalculator(char operator,Double firstNumber, Double secondNumber) throws IllegalAccessException {
    switch (operator) {
      case '+' -> {
        AddOperator addOperator = new AddOperator();
        double operate = addOperator.operate(firstNumber, secondNumber);
        arithemeticList.add(operate);
      }
      case '-' -> {
        SubtractOperator subtractOperator = new SubtractOperator();
        double operate = subtractOperator.operate(firstNumber, secondNumber);
        arithemeticList.add(operate);
      }
      case '*' -> {
        MultiplyOperator multiplyOperator = new MultiplyOperator();
        double operate = multiplyOperator.operate(firstNumber, secondNumber);
        arithemeticList.add(operate);
      }
      case '/' -> {
        DivideOperator divideOperator = new DivideOperator();
        double operate = divideOperator.operate(firstNumber, secondNumber);
        arithemeticList.add(operate);
      }
      case '%' -> {
        ModOperator modOperator = new ModOperator();
        double operate = modOperator.operate(firstNumber, secondNumber);
        arithemeticList.add(operate);
      }
      default -> throw new IllegalAccessException();
    }
  }
  public void CircleListInquiry() {
    for (Double circle : circleList) {
      System.out.print(circle + " ");
    }
    System.out.println();
  }
  public void arithmeticListInquiry() {
    for (Double  arithemetic : arithemeticList) {
      System.out.print( arithemetic + " ");
    }
    System.out.println();
  }

  public void circleListRemove() {
    circleList.removeFirst();
  }

  public void arithmeticListRemove() {
    arithemeticList.removeFirst();
  }
}