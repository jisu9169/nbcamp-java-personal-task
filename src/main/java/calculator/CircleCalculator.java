package calculator;

public class CircleCalculator extends Calculator {

  static double PI = Math.PI;

  @Override
  void inquiryResults() {
    for (Object v : super.getCircleList()) {
      System.out.print(v+" ");
    }
    System.out.println();
  }

  @Override
  void resultRemove() {
    super.circleList.removeFirst();
  }

  public Double calculator(Double radius) {
    return PI * radius * radius;
  }
}
