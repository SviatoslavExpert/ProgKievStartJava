package lesson03;

import java.util.Scanner;

public class LessonLevelOneTaskFourA {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину первой стороны треугольника:");
        double a = sc.nextDouble();
        System.out.println("Введите длину второй стороны треугольника:");
        double b = sc.nextDouble();
        System.out.println("Введите длину третьей стороны треугольника:");
        double c = sc.nextDouble();

        if((a + b) > c && (a + c) > b && (b + c) > a){
            System.out.println("Треугольник существует.");
        }
        else{
            System.out.println("Треугольник не существует.");
        }
    }
}
