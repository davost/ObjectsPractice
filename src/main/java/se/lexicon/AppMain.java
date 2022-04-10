package se.lexicon;

import org.w3c.dom.css.Rect;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {

        //car app
        Car car1;
        car1 = new Car();
        car1.setModel("Mercedes");
        car1.setMotorSize("5 Liter");
        car1.drive();

        //rectangle app
        Rectangle rect = new Rectangle();
        System.out.println("Please enter the height: ");
        Scanner dimension = new Scanner(System.in);
        double h = dimension.nextDouble();
        rect.setHeight(h);

        System.out.println("Please enter the width: ");
        Scanner dimension2 = new Scanner(System.in);
        double w = dimension2.nextDouble();
        rect.setWidth(w);
        rect.getArea();
        System.out.println(rect.getArea());
        //I am just going around in circles at this point and don't know what I am doing wrong....
    }
}
