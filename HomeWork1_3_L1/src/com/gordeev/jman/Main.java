package com.gordeev.jman;

import java.util.Scanner;
// Определение высокосный или нет год
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Какой год Вас интересует? ");

        int year = sc.nextInt();

        if (year < 0) {
            System.out.println("о_О" + "\n" + "Не может быть, а как это?");
        }

        if (year % 400 == 0 || year % 4 == 0 && year%100!=0) {
            System.out.println("Год высокосный, дней 366 ");
        } else {
            System.out.println("Год !высокосный, дней 365");
        }
    }
}
