package lesson02;

import java.util.Scanner;

public class LessonLabOne {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        double price = 28.89;
        double fuel = 8.5;
        System.out.println("Input r (km) and press Enter");
        int r = sc.nextInt();
        double total;

        total = fuel / 100.0 * price * r * 2.0;

        System.out.println(total + " UAH");
        sc.close();
    }
}
