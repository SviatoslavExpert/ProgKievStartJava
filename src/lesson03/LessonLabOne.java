package lesson03;

import java.util.Scanner;

public class LessonLabOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input price one:");
        int priceOne = sc.nextInt();

        System.out.println("Input price two:");
        int priceTwo = sc.nextInt();

        System.out.println("Input price three:");
        int priceThree = sc.nextInt();

        int maxPrice = priceOne;
        if(priceTwo > maxPrice) {
            maxPrice = priceTwo;
        }
        if(priceThree > maxPrice) {
            maxPrice = priceThree;
        }
        System.out.println("Max price: " + maxPrice + " UAH");
    }
}
