package com.gordeev.jman;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double xA = 0;
        double yA = 0;
        double xB = 4;
        double yB = 4;
        double xC = 6;
        double yC = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты точки по х ");
        double xP = sc.nextDouble();
        System.out.println("Введите координаты точки по y ");
        double yP = sc.nextDouble();

        Triangle triangle = new Triangle(xA, yA, xB, yB, xC, yC);
        Triangle oneTria = new Triangle(xA, yA, xB, yB, xP, yP);
        Triangle twoTria = new Triangle(xB, yB, xC, yC, xP, yP);
        Triangle treeTria = new Triangle(xC, yC, xA, yA, xP, yP);

        if (triangle.getArea(xA, yA, xB, yB, xC, yC) >= oneTria.getArea(xA, yA, xB, yB, xP, yP) + twoTria.getArea(xB, yB, xC, yC, xP, yP) + treeTria.getArea(xC, yC, xA, yA, xP, yP)) {
            System.out.println("Точка лежит в плоскости треугольника");
        }
        else {
            System.out.println("Точка не в треугольнике");
        }
    }


    static class Triangle {

        public Triangle(double aX, double aY, double bX, double bY, double cX, double cY) {
        }

        public double getArea(double aX, double aY, double bX, double bY, double cX, double cY) {

            double lA = Math.sqrt(((aX - bX) * (aX - bX)) + (((aY - bY) * (aY - bY))));
            double lB = Math.sqrt(((bX - cX) * (bX - cX)) + (((bY - cY) * (bX - cY))));
            double lC = Math.sqrt(((cX - aX) * (cX - aX)) + (((cY - aY) * (cX - aY))));
            double p = (lA + lB + lC) / 2;
            double s = Math.sqrt(p * (p - lA) * (p - lB) * (p - lC));
            return s;

        }


    }
}

