package cource.task7;

public class AdapterApp {
    public static void main(String[] args) {
       ConnectorDVI connectorDVI = new DVIAdapterFromSVGA();
       connectorDVI.hookUp();
    }
}
interface ConnectorDVI{
    void hookUp();
}
class ConnectorSVGA{
    void hookUpSVGA(){
        System.out.println("Hooked up SVGA connector");
    }
}
class DVIAdapterFromSVGA extends ConnectorSVGA implements ConnectorDVI{

    @Override
    public void hookUp() {
        hookUpSVGA();
    }
}


