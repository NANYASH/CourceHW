package cource.task3;

import cource.task3.bouquetСharacteristic.*;
import cource.task3.plantType.Plant;
import cource.task3.plantType.flowerPlant.Flower;

/**
 * Created by nanya on 7/27/17.
 */
public class Bouquet {

   private Plant plant;
   private Freshness freshness;
   private Price price;
   private Size size;
   private Stem stem;
   private Type type;
   private Accessories accessories;

    public Bouquet(Plant plant, Freshness freshness, Price price, Size size, Stem stem, Type type, Accessories accessories) {
        this.plant = plant;
        this.freshness = freshness;
        this.price = price;
        this.size = size;
        this.stem = stem;
        this.type = type;
        this.accessories = accessories;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "plant=" + plant +
                ", freshness=" + freshness +
                ", price=" + price +
                ", size=" + size +
                ", stem=" + stem +
                ", type=" + type +
                ", accessories=" + accessories +
                '}';
    }

    public Plant getPlant() {
        return plant;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    public Freshness getFreshness() {
        return freshness;
    }

    public void setFreshness(Freshness freshness) {
        this.freshness = freshness;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Stem getStem() {
        return stem;
    }

    public void setStem(Stem stem) {
        this.stem = stem;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Accessories getAccessories() {
        return accessories;
    }

    public void setAccessories(Accessories accessories) {
        this.accessories = accessories;
    }


}
