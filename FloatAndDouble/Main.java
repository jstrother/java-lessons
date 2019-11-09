package FloatAndDouble;

public class Main {
  public static void main(String[] args) {
    float myMinFloatValue = Float.MIN_VALUE;
    float myMaxFloatValue = Float.MAX_VALUE;
    System.out.println("Float Mininmum Value = " + myMinFloatValue);
    System.out.println("Float Maximum Value = " + myMaxFloatValue);

    double myMinDoubleValue = Double.MIN_VALUE;
    double myMaxDoubleValue = Double.MAX_VALUE;
    System.out.println("Double Mininmum Value = " + myMinDoubleValue);
    System.out.println("Double Maximum Value = " + myMaxDoubleValue);

    int myIntValue = 5 / 3;
    float myFloatValue = 5f / 3f;
    double myDoubleValue = 5.00 / 3.00;
    System.out.println("myIntValue = " + myIntValue);
    System.out.println("myFloatValue = " + myFloatValue);
    System.out.println("myDoubleValue = " + myDoubleValue);
  }
}