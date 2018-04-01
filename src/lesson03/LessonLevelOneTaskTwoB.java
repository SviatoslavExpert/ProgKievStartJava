/*
Есть девятиэтажный дом, в котором 4 подъезда. Номер подъезда
начинается с единицы. На одном этаже 4 квартиры. Напишите программу
которая получит номер квартиры с клавиатуры, и выведет на экран на
каком этаже, какого подъезда расположенна эта квартира. Если такой
квартиры нет в этом доме то нужно сообщить об этом пользователю.
 */

package lesson03;

import java.util.Scanner;

public class LessonLevelOneTaskTwoB {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter apartment number (1 - 144):");
        int apartmentNumber = sc.nextInt();

        if(apartmentNumber > 0 && apartmentNumber <= 144) {
            int entrance = ((int) ((apartmentNumber - 1) / 36)) + 1;
            int floor = (int) (((apartmentNumber - 1) % 36) / 4 + 1);

            System.out.println("Entrance is: " + entrance);
            System.out.println("Floor is: " + floor);
        }else{
            System.out.print("There is no such apartment.");
        }
    }
}
