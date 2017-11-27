package com.gordeev.jman;

import java.util.Scanner;
//точка в(на) окружности

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение Х");
        double x = sc.nextDouble();
        System.out.println("Введите значение Y");
        double y = sc.nextDouble();
        double r = 4.0;

        if ((x-0)*(x-0)+(y-0)*(y-0)<= r*r){
            System.out.println("Точка лежит внутри окружности...");
        } else {
            System.out.println("Мимо :)");
        }





    }
}