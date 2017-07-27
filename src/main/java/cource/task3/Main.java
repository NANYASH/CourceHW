package cource.task3;

import cource.task3.bouquetСharacteristic.*;
import cource.task3.plantType.flowerPlant.Monochromatic;
import cource.task3.plantType.flowerPlant.Multicolor;

/**
 * Created by nanya on 7/27/17.
 */
public class Main {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet(
                new Monochromatic(false,true,10),
                Freshness.NORMAL, Price.VIP, Size.HUGE, Stem.LONG, Type.BRIDAL,
                new Accessories(false,true,true,false));

        System.out.println(bouquet.toString());






    }
}
