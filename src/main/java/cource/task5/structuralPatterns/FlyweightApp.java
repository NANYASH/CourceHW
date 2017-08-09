package cource.task5.structuralPatterns;


import java.util.*;

public class FlyweightApp {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        List<Shape1> shapes = new ArrayList<>();

        shapes.add(shapeFactory.getShape("square"));
        shapes.add(shapeFactory.getShape("circle"));
        shapes.add(shapeFactory.getShape("circle"));
        shapes.add(shapeFactory.getShape("point"));
        shapes.add(shapeFactory.getShape("square"));
        shapes.add(shapeFactory.getShape("circle"));

        Random random = new Random();
        for (Shape1 shape : shapes){
            int x = random.nextInt(100);
            int y = random.nextInt(100);
            shape.draw(x,y);

        }

    }
}

interface Shape1 {
    void draw(int x, int y);
}

class Point implements Shape1 {

    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + "+" + y + ") : draw point");
    }

}
class Circle1 implements Shape1{
    int r = 5;
    @Override
    public void draw(int x, int y) {
        System.out.println("("+x+"+"+y+") : draw circle with radius "+r);
    }
}

class Square implements Shape1{
    int a = 10;
    @Override
    public void draw(int x, int y) {
        System.out.println("("+x+"+"+y+") : draw square with side "+a);
    }
}


class ShapeFactory {
    private static final Map<String, Shape1> shapes = new HashMap<>();

    public Shape1 getShape(String shapeName) {

        Shape1 shape = shapes.get(shapeName);
        if (shape == null) {
            switch (shapeName) {
                case "circle":
                    shape = new Circle1();
                    break;
                case "square":
                    shape = new Square();
                    break;
                case "point":
                    shape = new Point();
                    break;
            }
            shapes.put(shapeName, shape);
        }
        return shape;

    }
}
