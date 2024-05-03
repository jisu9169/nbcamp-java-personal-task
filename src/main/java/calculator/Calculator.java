package calculator;

import java.util.ArrayList;
import java.util.List;


public abstract class Calculator<T extends Number> {

  List<T> arithemeticList = new ArrayList<>();
  List<T> circleList = new ArrayList<>();

  public List<T> getArithemeticList() {
    return arithemeticList;
  }

  public List<T> getCircleList() {
    return circleList;
  }
  abstract void inquiryResults();
  abstract void resultRemove();
}