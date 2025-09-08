package custom;

public class Agecalculator {
    public static void main(String[] args) {
        int currentYear = 2023;
        int currentMonth = 6;
        int currentDay = 12;

        int birthYear = 1990;
        int birthMonth = 5;
        int birthDay = 15;

        int ageYears, ageDays, ageHours, ageMinutes;

        // Calculate the age in years
        ageYears = currentYear - birthYear;

        // Calculate the age in days
        int daysInCurrentYear = calculateDaysInYear(currentYear);
        int daysInBirthYear = calculateDaysInYear(birthYear);
        int daysInBetweenYears = 0;
        for (int i = birthYear + 1; i < currentYear; i++) {
            daysInBetweenYears += calculateDaysInYear(i);
        }
        ageDays = daysInCurrentYear - calculateDaysPassed(currentMonth, currentDay) + daysInBirthYear + calculateDaysPassed(birthMonth, birthDay) + daysInBetweenYears;

        // Calculate the age in hours and minutes
        ageHours = ageDays * 24;
        ageMinutes = ageHours * 60;

        // Print the age in years, days, hours, and minutes
        System.out.println("Age: " + ageYears + " years");
        System.out.println("Age in days: " + ageDays + " days");
        System.out.println("Age in hours: " + ageHours + " hours");
        System.out.println("Age in minutes: " + ageMinutes + " minutes");
    }

    // Helper method to calculate the number of days in a year
    public static int calculateDaysInYear(int year) {
        if (isLeapYear(year)) {
            return 366;
        } else {
            return 365;
        }
    }

    // Helper method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Helper method to calculate the number of days passed in a month
    public static int calculateDaysPassed(int month, int day) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int daysPassed = 0;
        for (int i = 1; i < month; i++) {
            daysPassed += daysInMonth[i];
        }
        daysPassed += day;
        return daysPassed;
    }
}
