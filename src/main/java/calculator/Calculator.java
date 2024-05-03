package calculator;

import java.util.ArrayList;
import java.util.List;


public abstract class Calculator {

  List<Double> arithemeticList = new ArrayList<>();
  List<Double> circleList = new ArrayList<>();

  public List<Double> getArithemeticList() {
    return arithemeticList;
  }

  public List<Double> getCircleList() {
    return circleList;
  }
  abstract void inquiryResults();
  abstract void resultRemove();
}