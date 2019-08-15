public class OperatorChallenge {
  public static void main(String[] args) {
    double firstDouble = 20.00d;
    double secondDouble = 80.00d;
    double thirdDouble = (firstDouble + secondDouble) * 100.00d;
    // removing the () above will change the order of operations
    System.out.println("thirdDouble = " + thirdDouble);
    double fourthDouble = thirdDouble % 40.00d;
    System.out.println("fourthDouble = " + fourthDouble);
    boolean isZero = fourthDouble == 0 ? true : false;
    System.out.println("isZero equals " + isZero);
    if (!isZero) {
      System.out.println("There is a remainder. isZero equals false. this won't print");
    }
  }
}