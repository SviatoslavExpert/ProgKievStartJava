/*
Определить количество дней в году, который вводит пользователь. В
високосном годе - 366 дней, тогда как в обычном 365. Високосный год
определяется по следующему правилу:
Год високосный, если он делится на четыре без остатка, но если он
делится на 100 без остатка, это не високосный год. Однако, если он
делится без остатка на 400, это високосный год.
 */

package lesson03;

import java.util.Scanner;

public class LessonLevelOneTaskThreeB {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is a leap year.");
        }
    }
}
