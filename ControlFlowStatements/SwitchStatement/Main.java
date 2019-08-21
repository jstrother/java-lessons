public class Main {
  public static void main(String[] args) {
    int value = 88;

    // below code will work, but switch statement would be better
    // if (value == 1) {
    //   System.out.println("Value was 1");
    // } else if (value == 2) {
    //   System.out.println("Value was 2");
    // } else {
    //   System.out.println("Value was not 1 or 2");
    // }

    switch (value) { // works on any dataType, not just int
      case 1:
        System.out.println("Value was 1");
        break;
      case 2:
        System.out.println("Value was 2");
        break;
      case 3:
      case 4:
      case 5:
        System.out.println("Value was 3, 4, or 5");
        break;
      default:
        System.out.println("Value was 6 or larger");
        break;
    }

    SwitchStatementChallenge.whichLetter('A');
    SwitchStatementChallenge.whichLetter('B');
    SwitchStatementChallenge.whichLetter('C');
    SwitchStatementChallenge.whichLetter('D');
    SwitchStatementChallenge.whichLetter('E');
    SwitchStatementChallenge.whichLetter('F');

    DayOfTheWeekChallenge.printDayOfWeek(0);
    DayOfTheWeekChallenge.printDayOfWeek(1);
    DayOfTheWeekChallenge.printDayOfWeek(2);
    DayOfTheWeekChallenge.printDayOfWeek(3);
    DayOfTheWeekChallenge.printDayOfWeek(4);
    DayOfTheWeekChallenge.printDayOfWeek(5);
    DayOfTheWeekChallenge.printDayOfWeek(6);
    DayOfTheWeekChallenge.printDayOfWeek(77);
  }
}