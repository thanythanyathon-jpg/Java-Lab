// Thanyathon Kitsakun
// 6887101

public class MyDate {
    public int year;
    public int month;
    public int day;
    public int objectNumber;
    public int objectCounter = 0;
    public String[] strMonths = {"January", "February", "March", "April", "May", "June","July", "August", "September", "October", "November","December"};

    public MyDate(int aYear, int aMonth, int aDay){
        year = aYear;
        month = aMonth;
        day = aDay;
        objectCounter++;
        objectNumber = objectCounter;
    }

    public MyDate(){
        year = 1900;
        month = 1;
        day = 1;
        objectCounter++;
        objectNumber = objectCounter;
    }

    public static boolean isLeapYear(int year){
        if (year % 4 != 0){
            return false;
        }
        if (year % 100 != 0){
            return true;
        }
        if (year % 400 != 0){
            return false;
        }
        if (year % 400 == 0){
            return true;
        }
        return true;
    }

    public int getObjectNumber(){
        return objectNumber;
    }
    public void setDate(int aYear, int aMonth, int aDay){
        year = aYear;
        month = aMonth;
        day = aDay;
    }

    public void setYear(int aYear){
        year = aYear;
    }

    public void setMonth(int aMonth){
        month = aMonth;
    }

    public void setDay(int aDay){
        day = aDay;
    }

    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }
    
    public String toString(){
        return (day + " " + month + " " + year);
    }
}
