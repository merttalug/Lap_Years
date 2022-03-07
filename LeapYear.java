package Statements;

import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        int year, leap4, leap400, leap100;
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Please input the Year that you want to decide whether it is a Leap Year or not : ");
        year = input.nextInt();

        leap4 = year % 4;
        leap100 = year % 100;
        leap400 = year % 400;

        if (leap4 == 0) {
            if (leap100 == 0) {
                if (leap400 == 0) {
                    isError = false;
                } else isError = true;
            } else isError = false;

        } else isError = true;

        if (isError==false){
            System.out.println(+year + " is a lap Year");
        }
        else System.out.println(+year + " is not a lap Year");

    }
}
