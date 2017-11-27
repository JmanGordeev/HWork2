package com.gordeev.jman;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int stage;
        int entrance;
        //дом 4*9*4 = 144 квартирный, на решение потратил 4 часа времени)))

        System.out.println("Введите номер квартиры: ");
        number = sc.nextInt();

        if (number != 0 && number > 144) {
            System.out.println(" >_< квартиры под номером " + number + " нет в этом доме, введите правильный номер...");
        }

        if (number >= 1 && number <= 36) {
            entrance = 1;
            if (number % 4 == 0) {
                stage = number / 4;
            } else stage = (number / 4) + 1;
            System.out.println("этаж - " + stage + "\n" + "подъезд -" + entrance);
        } else if (number >= 37 && number <= 72) {
            entrance = 2;
            if ((number - 36) % 4 == 0) {
                stage = (number - 36) / 4;
            } else stage = ((number - 36) / 4) + 1;
            System.out.println("этаж - " + stage + "\n" + "подъезд - " + entrance);
        } else if (number >= 73 && number <= 108) {
            entrance = 3;
            if ((number - 36 * 2) % 4 == 0) {
                stage = (number - 36 * 2) / 4;
            } else stage = ((number - 36 * 2) / 4) + 1;
            System.out.println("этаж - " + stage + "\n" + "подъезд - " + entrance);
        } else if (number >= 109 && number <= 144) {
            entrance = 4;
            if ((number - 36 * 3) % 4 == 0) {
                stage = (number - 36 * 3) / 4;
            } else stage = ((number - 36 * 3) / 4) + 1;
            System.out.println("этаж - " + stage + "\n" + "подъезд - " + entrance);
        }

    }
}