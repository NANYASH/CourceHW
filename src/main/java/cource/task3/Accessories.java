package cource.task3;

/**
 * Created by nanya on 7/27/17.
 */
public class Accessories {
    private boolean flowerBase;
    private boolean wrapping;
    private boolean ribbon;
    private boolean basket;

    public Accessories(boolean flowerBase, boolean wrapping, boolean ribbon, boolean basket) {
        this.flowerBase = flowerBase;
        this.wrapping = wrapping;
        this.ribbon = ribbon;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Accessories{" +
                "flowerBase=" + flowerBase +
                ", wrapping=" + wrapping +
                ", ribbon=" + ribbon +
                ", basket=" + basket +
                '}';
    }

    public boolean isFlowerBase() {
        return flowerBase;
    }

    public void setFlowerBase(boolean flowerBase) {
        this.flowerBase = flowerBase;
    }

    public boolean isWrapping() {
        return wrapping;
    }

    public void setWrapping(boolean wrapping) {
        this.wrapping = wrapping;
    }

    public boolean isRibbon() {
        return ribbon;
    }

    public void setRibbon(boolean ribbon) {
        this.ribbon = ribbon;
    }

    public boolean isBasket() {
        return basket;
    }

    public void setBasket(boolean basket) {
        this.basket = basket;
    }
}
