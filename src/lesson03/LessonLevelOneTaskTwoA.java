/*
Есть девятиэтажный дом, в котором 4 подъезда. Номер подъезда
начинается с единицы. На одном этаже 4 квартиры. Напишите программу
которая получит номер квартиры с клавиатуры, и выведет на экран на
каком этаже, какого подъезда расположенна эта квартира. Если такой
квартиры нет в этом доме то нужно сообщить об этом пользователю.
 */

package lesson03;

import java.util.Scanner;

public class LessonLevelOneTaskTwoA {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int floor = 0;
        int access = 0;
        System.out.println("Input numbers and press Enter");
        int number = sc.nextInt();

        if (number > 0 && number <= 4 * 9 * 4) {
            access = (number - 1) / 36 + 1;
            number = number - 36 * (access - 1);
            floor = (number + 3) / 4;
            System.out.println("Access: " + access);
            System.out.println("Floor: " + floor);
        } else {
            System.out.println("There is no such apartment");
        }
        sc.close();
    }
}
