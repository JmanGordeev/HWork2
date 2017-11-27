package com.gordeev.jman;
//Треугольник

public class Main {

    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = 2;

        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && b + c > a && c + a > b) {
                System.out.println("Такой треугольник существует ");
            } else {
                System.out.println("Нет такого треугольника");
            }
        } else {
            System.out.println("Сторона не может быть меньше или равна 0!!!");
        }
    }
}
