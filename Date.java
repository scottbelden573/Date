// Exercise 8.15 Date class
// Create class Date with the following capabilities:
// a) Output the date in multiple formats, such as
// MM/DD/YYYY
// June 14, 1992
// DDD YYYY
// b) Use overloaded constructors to create Date objects initialized with dates
// of the formats in part (a). In the first case the constructor should receive
// three integer values. In the second case it should receive a String and two
// integer values. In the third case it should receive two integer values, the
// first of which represents the day number in the year.

public class Date {
    private int day; // 0-30
    private int month; // 0-11
    private int year; // >0
    // make constructors
    public Date(int day, int month, int year) {

    }

    public Date(String month, int day, int year) {

    }

    public Date(int day, int year) {

    }

    public static void main(String[] args) {
      System.out.println("Happy");
      Date date1 = new Date(14, 6, 1992);
      Date date2 = new Date("June", 14, 1992);
      Date date3 = new Date(214, 1992);


      System.out.println(date1.toMMDDYYYYFormat());
      System.out.println(date2.toJune141992Format());
      System.out.println(date3.dayYearFormat());

    }


    // set a new date value using MM/DD/YYYY formats
    // exception if the day, month or year are invalid
  public void setDate(int day, int month, int year) {
    // validate day, month, year
    if (day < 0 || day >=31 || month < 1 || month >= 12 ||
    year < 0) {
      throw new IllegalArgumentException(
      "hour, minute and/or second was out of range");
    }

      this.day = day;
      this.month = month;
      this.year = year;

  }



  public String toMMDDYYYYFormat() {

    return "06 14 1992 format";
  }

  // convert to String in June 14, 1992 format
  public String toJune141992Format() {
    switch(month) {
      case 1:
        System.out.println("January");
        break;
      case 2:
        System.out.println("February");
        break;
      case 3:
        System.out.println("March");
        break;
      case 4:
        System.out.println("April");
        break;
      case 5:
        System.out.println("May");
        break;
      case 6:
        System.out.println("June");
        break;
      case 7:
        System.out.println("July");
        break;
      case 8:
        System.out.println("August");
        break;
      case 9:
        System.out.println("September");
        break;
      case 10:
        System.out.println("October");
        break;
      case 11:
        System.out.println("November");
        break;
      case 12:
        System.out.println("December");
        break;
      default:
        break;
  } // End switch statement
    return String.format("June 14 1992 format");
  }

  public String dayYearFormat() {
    return String.format("214 1992 format");
  }

  // public String leapYear() {
  //   // account for leap years
  //   if (year % 4 == 0) {
  //     if ((year % 100 != 0) || (year % 400 == 0)) {
  //       dayCount[1] = 29;
  //     }
  //   }
  // }

}
