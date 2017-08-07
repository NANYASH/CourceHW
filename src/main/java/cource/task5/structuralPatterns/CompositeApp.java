package cource.task5.structuralPatterns;


import java.util.ArrayList;
import java.util.List;

public class CompositeApp {

    public static void main(String[] args) {
        Shape square1 = new Squuare();
        Shape square2 = new Squuare();
        Shape triangle1 = new Triangle();

        Shape square3 = new Squuare();
        Shape circle1 = new Cicrle();
        Shape circle2 = new Cicrle();
        Shape circle3 = new Cicrle();

        Composite composit = new Composite();
        Composite composit1 = new Composite();
        Composite composit2 = new Composite();

        composit1.addComponent(square1);
        composit1.addComponent(square2);
        composit1.addComponent(triangle1);

        composit2.addComponent(square3);
        composit2.addComponent(circle1);
        composit2.addComponent(circle2);
        composit2.addComponent(circle3);

        composit.addComponent(composit1);
        composit.addComponent(composit2);
        composit.addComponent(new Triangle());

        composit.draw();

    }

}

interface Shape {
    void draw();
}

class Squuare implements Shape {
    public void draw() {
        System.out.println("Hi,I'm square.");
    }
}

class Triangle implements Shape {
    public void draw() {
        System.out.println("Hi,I'm triangle.");
    }
}

class Cicrle implements Shape {
    public void draw() {
        System.out.println("Hi,I'm cicrle.");
    }
}

class Composite implements Shape {
    private List<Shape> components = new ArrayList<>();

    public void addComponent(Shape component) {
        components.add(component);
    }

    public void removeComponent(Shape component) {
        components.remove(component);
    }

    public void draw() {
        for (Shape component : components) {
            component.draw();
        }
    }
}

