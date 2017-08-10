package cource.task7;


public class FacadeApp {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startSession();

    }
}
class Computer{
    Monitor monitor = new Monitor();
    SystemUnit systemUnit = new SystemUnit();
    Mouse mouse = new Mouse();
    Keyboard keyboard = new Keyboard();

    void startSession(){
        mouse.hookUp();
        keyboard.hookUp();
        systemUnit.turnOn();
        monitor.turnOn();
    }

}
class Monitor{
    void turnOn(){
        System.out.println("Monitor is on");
    }
    void turnOff(){
        System.out.println("Monitor is off");
    }
}
class SystemUnit{
    void turnOn(){
        System.out.println("System unit is on");
    }
    void turnOff(){
        System.out.println("System unit is off");
    }
    void reload(){
        System.out.println("System unit is reloading");
    }
}
class Mouse{
    void hookUp(){
        System.out.println("Mouse is hooked up");
    }
    void hookDown(){
        System.out.println("Mouse is hooked down");
    }
}
class Keyboard{
    void hookUp(){
        System.out.println("Keyboard is hooked up");
    }
    void hookDown(){
        System.out.println("Keyboard is hooked down");
    }
}

