package cource.task7;


public class StateApp {
    public static void main(String[] args) {
        Activity context = new Activity();
        context.setHuman("see animal");
        context.introduce();
        context.setHuman("mushroom field");
        context.introduce();

    }
}

//State
interface Human{
    void introduce();
}
class Hunter implements Human{
    public void introduce() {
        System.out.println("I'm a hunter");}
}
class Fisher implements Human{
    public void introduce() {
        System.out.println("I'm a fisher");}
}
class MushroomerPicker implements Human{
    public void introduce() {
        System.out.println("I'm a mushroom picker");}
}

//Context
class Activity {
    Human human;
    void setHuman(String position){
        switch (position){
            case "bank":
                human = new Fisher();
                break;
            case "see animal":
                human = new Hunter();
                break;
            case "mushroom field":
                human = new MushroomerPicker();
                break;
            default:
                System.out.println("No such activity!");
        }
    }
    void introduce(){
        human.introduce();
    }
}