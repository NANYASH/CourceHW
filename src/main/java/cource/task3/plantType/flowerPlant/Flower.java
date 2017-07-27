package cource.task3.plantType.flowerPlant;

import cource.task3.plantType.Plant;


public class Flower extends Plant {

    private boolean fertilizer;
    private boolean support;
    private int number;

    public Flower(boolean fertilizer, boolean support, int number) {
        this.fertilizer = fertilizer;
        this.support = support;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "fertilizer=" + fertilizer +
                ", support=" + support +
                ", number=" + number +
                '}';
    }

    public boolean isFertilizer() {
        return fertilizer;
    }

    public void setFertilizer(boolean fertilizer) {
        this.fertilizer = fertilizer;
    }

    public boolean isSupport() {
        return support;
    }

    public void setSupport(boolean support) {
        this.support = support;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
