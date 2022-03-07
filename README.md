# Leap_Years
 Program to find whether the year the user entered is a leap year with Java

## What is a leap year?

A leap year is a year with 366 days instead of 365 in the Gregorian calendar. This extra day (leap day) is obtained by adding February 29 to February, which is normally 28 days.

![](https://c.tadst.com/gfx/600x337/leap-year-calculation.png?1)

##How is a leap year calculated?

As a general rule, leap years are years that are a multiple of 4:

* Like 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024.

Years that are a multiple of 100 are leap years that are only divisible by 400 without a remainder:

* For example, the years 1200, 1600, 2000 are leap years, but 1700, 1800, and 1900 are not leap years.
The reason why only those exactly divisible by 400 are considered leap years is to correct the error that an astronomical year is approximately 365.242 days, not 365.25 days.


```
leap4 = year % 4;
leap100 = year % 100;
leap400 = year % 400;

```


```
 if (leap4 == 0) {
            if (leap100 == 0) {
                if (leap400 == 0) {
                    isError = false;
                } else isError = true;
            } else isError = false;

        }
 else isError = true;

```
