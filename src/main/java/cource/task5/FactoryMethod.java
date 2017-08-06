package cource.task5;

import java.util.Date;

/**
 * Created by nanya on 8/5/17.
 */
public class FactoryMethod {
    public static void main(String[] args) {


        WatchMaker watchMaker = getMakerByName("Digital");


    }
    public static WatchMaker getMakerByName(String maker){
        if (maker.equals("Digital"))
            return new DigitalWatchMaker();
        if (maker.equals("Rome"))
            return new RomeWatchMaker();

        throw new  RuntimeException("Not found maker!"+maker);

    }
}
interface Watch{
    void showTime();

}
class DigitalWatch implements Watch {

    public void showTime() {
        System.out.println(new Date());
    }
}


class RomeWatch implements Watch{
    public void showTime() {
        System.out.println("VII-XX");
    }
}
interface WatchMaker {
    Watch createWatch();
}

class DigitalWatchMaker implements WatchMaker{

    public Watch createWatch() {
       return new DigitalWatch();
    }
}
class RomeWatchMaker implements WatchMaker{
    public Watch createWatch() {
        return new RomeWatch();
    }
}