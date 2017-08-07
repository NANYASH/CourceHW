package cource.task5.structuralPatterns;


public class AdapterApp {
    public static void main(String[] args) {
        //1-й способ через наследование
        VectorGraphicsInterface g1 = new VectorAdapterFromRaster();
        g1.drawLine();
        g1.drawSquare();
        //2-й способчерез композицию
        VectorGraphicsInterface g2 = new VectorAdapterFromRaster2();
        g2.drawLine();
        g2.drawSquare();
    }
}
interface VectorGraphicsInterface{
    void drawLine();
    void drawSquare();
}
class RasterGrafic {
    void drawRasterLine(){
        System.out.println("Draw line");
    }
    void drawRasterSquare(){
        System.out.println("Draw square");
    }

}
class VectorAdapterFromRaster extends RasterGrafic implements VectorGraphicsInterface{

    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}
class VectorAdapterFromRaster2 implements VectorGraphicsInterface{
    RasterGrafic rasterGrafic = new RasterGrafic();

    @Override
    public void drawLine() {
        rasterGrafic.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        rasterGrafic.drawRasterSquare();
    }
}
