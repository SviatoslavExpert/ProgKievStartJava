/*
Написать программу которая считает 4 числа c клавиатуры и выведет на
экран самое большое из них.
 */

package lesson03;

import java.util.Scanner;

public class LessonTaskOneA {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a");
        int a = sc.nextInt();

        System.out.println("Input b");
        int b = sc.nextInt();

        System.out.println("Input c");
        int c = sc.nextInt();

        System.out.println("Input d");
        int d = sc.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        System.out.println(max);
        sc.close();
    }
}
