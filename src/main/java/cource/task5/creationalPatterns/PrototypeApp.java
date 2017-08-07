package cource.task5.creationalPatterns;

public class PrototypeApp {
    public static void main(String[] args) {
        Human original = new Human(18,"Vasya");
        System.out.println(original.toString());

        Human copy1 = (Human) original.copy();
        System.out.println(copy1.toString());

        HumanFactory humanFactory = new HumanFactory(copy1);
        Human copy2 = humanFactory.makeCopy();
        System.out.println(copy2.toString());

    }
}
interface Copyable{
    Object copy();
}
class Human implements Copyable{
    int age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public Object copy() {
        Human copy = new Human(age,name);
        return copy;
    }

}
class HumanFactory{
    Human human;

    public HumanFactory(Human human) {
        this.human = human;
    }
    public void setPrototype(Human human){
        this.human = human;
    }

    Human makeCopy(){
        return (Human) human.copy();
    }
}

