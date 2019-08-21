public class NumberOfDaysInMonth {

  public static boolean isLeapYear(int year) {
    if (year >= 1 && year <= 9999) {
      if (year % 4 == 0) {
        if (year % 100 == 0) {
          if (year % 400 == 0) {
            return true;
          }
          return false;
        }
        return true;
      }
      return false;
    }
    return false;
  }

  public static int getDaysInMonth(int monthNumber, int year) {
    if ((monthNumber < 1) || (monthNumber > 12) || (year < 1) || (year > 9999)) {
      return -1;
    } else if ((isLeapYear(year)) && (monthNumber == 2)) {
      return 29;
    } else {
      switch (monthNumber) {
        case 1:
          return 31;
        case 2:
          return 28;
        case 3:
          return 31;
        case 4:
          return 30;
        case 5:
          return 31;
        case 6:
          return 30;
        case 7:
          return 31;
        case 8:
          return 31;
        case 9:
          return 30;
        case 10:
          return 31;
        case 11:
          return 30;
        case 12:
          return 31;
        default:
          return -1;
      }
    }
  }
}