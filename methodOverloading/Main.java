package methodOverloading;

public class Main {
  public static void main(String[] args) {
    int newScore = calculatorScore("Jim", 500);
    System.out.println("New score is " + newScore);
    calculatorScore(75);
    calculatorScore();
    calcFeetAndInchesToCentimeters(6, 2);
    calcFeetAndInchesToCentimeters(4, 15);
    calcFeetAndInchesToCentimeters(15);
    calcFeetAndInchesToCentimeters(10);
    calcFeetAndInchesToCentimeters(-77);
  }

  public static int calculatorScore(String playerName, int score) {
    System.out.println("Player " + playerName + " scored " + score + " points");
    return score *= 1000;
  }

  public static int calculatorScore(int score) {
    System.out.println("Unnamed Player scored " + score + " points");
    return score *= 1000;
  }

  public static int calculatorScore() {
    System.out.println("No player name, no player score");
    return 0;
  }

  // It is the number of arguments that determines whether a method is overloaded or not.
  // Declaring a different return type, an example below, will not work

  // public static void calculatorScore() {
  //   System.out.println("No player name, no player score");
  // }

  // * * * * * * * * * * * * * * *
  // MEHTOD OVERLOADING CHALLENGE
  // * * * * * * * * * * * * * * *
       
  public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
    if ((feet < 0) || (inches < 0) || (inches > 12)) {
      System.out.println("Returned -1 (First Function)");
      return -1;
    } else {
      double centimeters = ((inches * 2.54) + ((feet * 12) * 2.54));
      System.out.println(feet + "ft " + inches + "in " + "equals " + centimeters + "cm");
      return centimeters;
    }
  }

  public static double calcFeetAndInchesToCentimeters(double inches) {
    if ((inches < 0) || (inches > 12)) {
      System.out.println("Returned -1 (Second Function)");
      return -1;
    } else if ((inches >= 0) && (inches <= 12)) {
      double centimeters = (inches * 2.54);
      System.out.println(inches + "in equals " + centimeters + "cm" + " Else If Block");
      return centimeters;
    } else if (inches > 12) {
      double inchesToFeet = inches / 12;
      double newFeet = Math.floor(inchesToFeet);
      double newInches = Math.floor((inchesToFeet - newFeet) * 12);
      double centimeters = calcFeetAndInchesToCentimeters(newFeet, newInches);
      System.out.println(inches + "in equals " + centimeters + "cm" + " Else Block");
      return centimeters;
    } else {
      System.out.println("Something Else Happened");
      return -1;
    }
  }  
}