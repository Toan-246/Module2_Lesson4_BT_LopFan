package com.codegym;

public class Main {

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        System.out.println("Fan1");
        System.out.println(fan1.getSpeed());
        System.out.println(fan1.getRadius());
        System.out.println(fan1.getColor());

        Fan fan2 = new Fan();
        System.out.println("Fan2");
        fan2.setSpeed(Fan.FAST);
        fan2.setOn(true);
        fan2.setRadius(10);
        fan2.setColor("yellow" );

        System.out.println(fan2.getSpeed());
        System.out.println(fan2.getRadius());
        System.out.println(fan2.getColor());
    }
}
