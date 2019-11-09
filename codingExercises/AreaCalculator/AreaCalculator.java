package codingExercises.AreaCalculator;

public class AreaCalculator {
  public static double area(double radius) {
    if (radius < 0) {
      return -1.0;
    }
    return (radius * radius * Math.PI);
  }
  public static double area(double width, double height) {
    if (width < 0 || height < 0) {
      return -1.0;
    }
    return (width * height);
  }
}