package week6;

import week5.MapHash;

public class Car {
    String color;
    int speed;
    int gear;
    MapHash a;

    void speedUp(int addSpeed){
        this.speed += addSpeed;
    }
    void printData(){
        System.out.println(
                 "color : " + color + " "
                + "// speed : " + speed
                + "// gear : " + gear
        );
    }
}