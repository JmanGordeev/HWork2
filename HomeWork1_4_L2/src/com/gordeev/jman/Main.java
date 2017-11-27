package com.gordeev.jman;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ввведите шестизначное число");
        String num = sc.next();
        char[] arr = num.toCharArray();

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }


        if (arr[0] == arr[5] &&arr[1] == arr[4] &&arr[2] == arr[3] ){
            System.out.println("Таки да - палиндром");
        }
        else{
            System.out.println("нет симетрии");
        }


    }
}
