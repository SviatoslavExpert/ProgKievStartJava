/*
Написать программу которая вычислит и выведет на экран
площадь треугольника если известны его стороны.
 */

package lesson02;

public class LessonTaskTwo {
    public static void main(String[] args) {

        double a = 0.3;
        double b = 0.5;
        double c = 0.4;

        double p = (a + b + c) / 2.0;   /*  очень важно: деление на вещественное число   */

        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Area = " + area);
    }
}
