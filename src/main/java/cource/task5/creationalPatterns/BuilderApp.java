package cource.task5.creationalPatterns;


public class BuilderApp {
    public static void main(String[] args) {

       Director director = new Director();
       director.setBuilder(new SubaruBuilder());
       director.builder.createCar();
       Car car = director.buildCar();
        System.out.println(car.toString());

    }
}
enum Transmission{
    MANUAL,AUTOM
}
class Car{
    String make;
    Transmission transmission;
    int maxSpeed;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", transmission=" + transmission +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
abstract class CarBuilder{
    Car car;
    void createCar(){
        car = new Car();
    }
    abstract void buildMake();
    abstract void buildTransmission();
    abstract void buildMaxSpeed();

    public Car getCar() {
        return car;
    }
}
class FordMondeoBuilder extends CarBuilder{

    @Override
    void buildMake() {
        car.setMake("Ford Mondeo");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.AUTOM);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(260);
    }
}
class SubaruBuilder extends CarBuilder{

    @Override
    void buildMake() {
        car.setMake("Subaru");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(320);
    }
}
class Director{
    CarBuilder builder;
    void setBuilder(CarBuilder b){
        builder = b;
    }
    Car buildCar(){
        builder.buildMake();
        builder.buildTransmission();
        builder.buildMaxSpeed();
        Car car = builder.getCar();
        return car;
    }
}

