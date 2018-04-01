/*
Написать программу которая вычислит и выведет на экран
площадь треугольника если известны его стороны.
 */

package lesson02;

import java.util.Scanner;

public class LessonTaskThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input r");
        double r = sc.nextDouble();

        double p = Math.PI * 2.0 * r;
        System.out.println("Perimeter = " + p);
        sc.close();
    }
}
