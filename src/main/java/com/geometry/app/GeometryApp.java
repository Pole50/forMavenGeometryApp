package com.geometry.app;

import com.geometry.Circle;
import com.geometry.Rectangle;
import com.geometry.Triangle;
import com.geometry.Shape;
import com.geometry.utils.UnitConverter;

public class GeometryApp {
    public static void main(String[] args) {
        // Создание геометрических фигур
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape triangle = new Triangle(3.0, 4.0, 5.0);

        // Вывод информации о фигурах
        System.out.println("=== Geometry Library Demo ===");
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(triangle);

        // Дополнительная информация
        System.out.println("\n=== Detailed Information ===");
        printShapeInfo(circle);
        printCircleDiameter(new Circle(5.0));
        printShapeInfo(rectangle);
        printShapeInfo(triangle);

        printUtilsInfo(new Circle(5.0));
    }

    private static void printShapeInfo(Shape shape) {
        System.out.printf("Area: %.2f, Perimeter: %.2f%n",
                shape.calculateArea(),
                shape.calculatePerimeter());
    }

    private static void printCircleDiameter(Circle circle) {
        System.out.printf("Diameter: %.2f%n", circle.calculateDiameter());
    }

    private static void printUtilsInfo(Circle circle) {
        System.out.println("let it seem to convert from centimetersToInches: " + UnitConverter.centimetersToInches(circle.calculateDiameter()).toString());
    }

}