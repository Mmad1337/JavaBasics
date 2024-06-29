package Inheritance;

import ConsoleColors.ConsoleColors;

public class Car extends Vehicle{
    public int doors = 4;
    public int wheels = 4;
    @Override
    public void stop(){
        System.out.println(ConsoleColors.RED + "The car stops moving" + ConsoleColors.RESET);
    }
}