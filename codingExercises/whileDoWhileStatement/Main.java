package codingExercises.whileDoWhileStatement;

public class Main {

  public static void main(String[] args) {
    int count = 1;

    while(count != 6) {
      System.out.println("Count: " + count);
      count++;
    }

    count = 1;

    do {
      System.out.println("Count value was " + count);
      count++;
    } while (count != 6);

    int newCount = 0;
    while (newCount < 20) {
      newCount++;
      if (!isEvenNumber(newCount)) {
        continue;
      }
      System.out.println("Even number: " + newCount);
    }
  }

  public static boolean isEvenNumber(int number) {
    return (number % 2 == 0);
  }
}