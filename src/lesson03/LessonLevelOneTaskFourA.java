/*
Треугольник существует только тогда, когда сумма любых двух его
сторон больше третьей. Дано: a, b, c – стороны предполагаемого
треугольника. Напишите программу которая укажет существует такой
треугольник или нет.
 */

package lesson03;

public class LessonLevelOneTaskFourA {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double a = 0.4;
        double b = 0.3;
        double c = 0.5;
        if (a + b > c && a + c > b && c + b > a) {
            System.out.println("Triangular exist");
        } else {
            System.out.println("Triangular not exist");
        }
    }
}
