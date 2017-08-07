package cource.task5.creationalPatterns;


public class AbstractFactoryApp {
    public static void main(String[] args) {

        DeviceFactory deviceFactory = getFactoryByCountryCod("EN");
        Mouse mouse = deviceFactory.getMouse();
        Keyboard keyboard = deviceFactory.getKeyboard();
        Touchpad touchpad = deviceFactory.getTouchpad();
        mouse.click();
        keyboard.print();
        touchpad.track(10,10);

    }
    private static DeviceFactory getFactoryByCountryCod(String lang){
        switch (lang){
            case "RU":
                return new RuDeviceFactory();

            case "EN":
                return new EnDeviceFactory();

            default:
                throw new RuntimeException("Unsupported country code:" + lang);
        }
    }
}
interface Mouse{
    void click();
    void dblClick();
    void scroll(int direction);
}
interface Keyboard{
    void print();
    void println();
}
interface Touchpad{
    void track(int deltaX,int deltaY);
}
interface DeviceFactory{
    Mouse getMouse();
    Keyboard getKeyboard();
    Touchpad getTouchpad();
}
class RuMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("Щелчок мышью");

    }

    @Override
    public void dblClick() {
        System.out.println("Двойной щелчок мышью");

    }

    @Override
    public void scroll(int direction) {
        if (direction>0)
            System.out.println("Скролим вверх");
        if (direction<0)
            System.out.println("Скролим вниз");
        else
            System.out.println("Не скролим");

    }
}
class RuKeyboard implements Keyboard{
    @Override
    public void print() {
        System.out.println("Печатаем строку");

    }

    @Override
    public void println() {
        System.out.println("Печатаем строку с новой строки");
    }
}
class RuTouchpad implements Touchpad{
    @Override
    public void track(int deltaX, int deltaY) {
        int s = (int) Math.sqrt(Math.pow(deltaX,2)+Math.pow(deltaY,2));
        System.out.println("Передвинулись на "+s+" пикселей");

    }
}
class EnMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("Mouse click");

    }

    @Override
    public void dblClick() {
        System.out.println("Mouse double click");

    }

    @Override
    public void scroll(int direction) {
        if (direction>0)
            System.out.println("Scroll up");
        if (direction<0)
            System.out.println("Scroll down");
        else
            System.out.println("No scrolling");

    }
}
class EnKeyboard implements  Keyboard{
    @Override
    public void print() {
        System.out.println("Print string");

    }

    @Override
    public void println() {
        System.out.println("Print string in new line");
    }
}
class EnTouchpad implements Touchpad{
    @Override
    public void track(int deltaX, int deltaY) {
        int s = (int) Math.sqrt(Math.pow(deltaX,2)+Math.pow(deltaY,2));
        System.out.println("Moved on "+s+" pixels");

    }
}
class RuDeviceFactory implements DeviceFactory{

    @Override
    public Mouse getMouse() {
        return new RuMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new RuKeyboard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new RuTouchpad();
    }
}
class EnDeviceFactory implements DeviceFactory{


    @Override
    public Mouse getMouse() {
        return new EnMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new EnKeyboard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new EnTouchpad();
    }
}
