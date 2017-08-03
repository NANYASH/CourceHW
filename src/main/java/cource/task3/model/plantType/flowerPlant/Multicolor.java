package cource.task3.model.plantType.flowerPlant;

/**
 * Created by nanya on 7/27/17.
 */
public class Multicolor extends Flower {

    public Multicolor(boolean fertilizer, boolean support, int number) {
        super(fertilizer, support, number);
    }

    @Override
    public String toString() {
        return "Multicolor{" +
                "fertilizer=" + super.isFertilizer() +
                ", support=" + super.isSupport() +
                ", number=" + super.getNumber() +
                '}';
    }

}
