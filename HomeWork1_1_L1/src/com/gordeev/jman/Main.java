package com.gordeev.jman;

import java.util.Scanner;
//4 числа c клавиатуры

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Input a ");
        a = sc.nextInt();

        int b;
        System.out.println("Input b ");
        b = sc.nextInt();

        int c;
        System.out.println("Input c ");
        c = sc.nextInt();

        int d;
        System.out.println("Input d ");
        d = sc.nextInt();


        int max;

        max = a;

        if (b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }

        if (d > max){
            max = d;
        }
        System.out.println(max);


    }
}
