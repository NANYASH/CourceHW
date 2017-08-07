package cource.task5.creationalPatterns;


public class SingletonApp {
    public static void main(String[] args) {
        final int SIZE = 1000;
        Singleton[] s = new Singleton[SIZE];
        for (int i=0 ;i<SIZE;i++){
            s [i]= Singleton.getInstance();
        }
        System.out.println(Singleton.counter);


    }
}
class Singleton {
    public static int counter = 0;
    private static volatile Singleton instance;

    private Singleton() {
        counter++;
    }

    public static Singleton getInstance() {//multithreading+lazy initialization,
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null)
                    instance = new Singleton();
            }
        }

        return instance;
    }

    /*public static synchronized Singleton getInstance(){//multithreading+lazy initialization, but slow
        if (instance == null)
        instance = new Singleton();
        return instance;
    }*/

    /*public static Singleton getInstance(){//No lazy initialization
        return instance;
    }*/
   /* public static Singleton getInstance(){//No multithreading
        if (instance == null)
            instance = new Singleton();
        return instance;
    }*/


}

