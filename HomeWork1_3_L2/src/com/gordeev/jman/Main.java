package com.gordeev.jman;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите четырехзначное число");
        int num = sc.nextInt();
        int temp;
        int[] numMass = new int[4];
        int indexMass = 0;

        for (int i = 1000; i > 0; i /= 10) {
            temp = num - num % i;
            num = num - temp;
            numMass[indexMass] = temp / i;
            indexMass++;
        }

        if (numMass[0] + numMass[1] == numMass[2] + numMass[3]) {
            System.out.println((numMass[0] + numMass[1]) + " = " + (numMass[2] + numMass[3]) + "\n" + "Поздравляем, Вам повезло!!!");
        } else {
            System.out.println("Не повезло...");
        }

    }
}
