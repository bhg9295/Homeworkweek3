public class Program4leapyear {

    //leap year
    // static method
    public static boolean isLeapYear(int year) {
        boolean result = false;

        if (year >= 1 && year <= 9999) {

            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                result = true;
                System.out.println(result + "      " + year + " is a leap year.");
            } else {
                System.out.println(result + "     " + year + " is not a leap year.");
            }

        } else {
            System.out.println(result + "     The parameter is not in the range (1-9999)");
        }
        return result;
    }

    // static method
    public static void getDaysInMonth(int month, int year) {
        int numberOfDaysInMonth = 0;
        String monthName = "Unknown";

        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            System.out.println("-1");
        } else {
            switch (month) {
                case 1:
                    monthName = "January";
                    numberOfDaysInMonth = 31;
                    break;
                case 2:
                    monthName = "February";
                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                        numberOfDaysInMonth = 29;
                    } else {
                        numberOfDaysInMonth = 28;
                    }
                    break;
                case 3:
                    monthName = "March";
                    numberOfDaysInMonth = 31;
                    break;
                case 4:
                    monthName = "April";
                    numberOfDaysInMonth = 30;
                    break;
                case 5:
                    monthName = "May";
                    numberOfDaysInMonth = 31;
                    break;
                case 6:
                    monthName = "June";
                    numberOfDaysInMonth = 30;
                    break;
                case 7:
                    monthName = "July";
                    numberOfDaysInMonth = 31;
                    break;
                case 8:
                    monthName = "August";
                    numberOfDaysInMonth = 31;
                    break;
                case 9:
                    monthName = "September";
                    numberOfDaysInMonth = 30;
                    break;
                case 10:
                    monthName = "October";
                    numberOfDaysInMonth = 31;
                    break;
                case 11:
                    monthName = "November";
                    numberOfDaysInMonth = 30;
                    break;
                case 12:
                    monthName = "December";
                    numberOfDaysInMonth = 31;
            }
            System.out.print(monthName + " " + year + " has " + numberOfDaysInMonth + " days\n");
        }
    }


    public static void main(String[] args) {
        isLeapYear(-1600);  // calling static method
        isLeapYear(1600);   // calling static method
        isLeapYear(2017);   // calling static method
        isLeapYear(2000);   // calling static method

        getDaysInMonth(1, 2020);  // calling static method
        getDaysInMonth(2, 2020);  // calling static method
        getDaysInMonth(2, 2018);  // calling static method
        getDaysInMonth(-1, 2020); // calling static method
        getDaysInMonth(1, -2020); // calling static method
    }
}




