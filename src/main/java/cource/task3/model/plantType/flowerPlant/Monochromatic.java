package cource.task3.model.plantType.flowerPlant;

/**
 * Created by nanya on 7/27/17.
 */
public class Monochromatic extends Flower {


    public Monochromatic(boolean fertilizer, boolean support, int number) {
        super(fertilizer, support, number);
    }

    @Override
    public String toString() {
        return "Monochromatic{" +
                "fertilizer=" + super.isFertilizer() +
                ", support=" + super.isSupport() +
                ", number=" + super.getNumber() +
                '}';
    }


}
