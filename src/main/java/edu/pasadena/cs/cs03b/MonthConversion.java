package edu.pasadena.cs.cs03b;

public class MonthConversion {

    public static void main(String[] args) {
        int month = 0;
        // TODO: allow user to input the month        
        String strMonth = MonthConversion.convertMonthWithSwitch(month);
        System.out.println("The month is " + strMonth);
    }

    //TODO: complete the implementation with nested if
    public static String convertMonthWithNestedIf(int nMonth) {
        String monthString = "WRONG";

        if (nMonth==1) {
            monthString = "January";
        }
        // add nested if from Feburary to November
        else if (nMonth==12) {
            monthString = "December";
        } else {
            monthString = "No Such Month";
        }

        return monthString;
    }

    // TODO: complete the implementation with switch
    public static String convertMonthWithSwitch(int nMonth) {
        
        String monthString = "WRONG";
        switch (nMonth) {
            case 1:
                monthString = "January";
                break;
            case 2:  monthString = "February";
            // TODO: what is missing here
            case 3:  monthString = "March";
                     break;
            // TODO: Add the rest of the months here
            // TODO: add a default case to output "No Such Month"
        }
        
        return monthString;
    }
}
