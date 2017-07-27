package cource.task2;

import java.util.Random;


public class Model {
    // The Program logic

    private int maxValue;
    private int minValue;
    private int randomValue;
    private int customerValue;


    //Constructor
    public Model() {
        Random random = new Random();
        this.maxValue = 100;
        this.minValue = 0;
        this.randomValue = random.nextInt(100);
    }

    public int compareNumbers(int randomValue, int customerValue) {

        if (customerValue > randomValue && customerValue < maxValue) {
            maxValue = customerValue;
        }

        if (customerValue < randomValue && customerValue > minValue) {
            minValue = customerValue;
        }

        if (customerValue == randomValue) {
            return 0;
        }

        return -1;

    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getRandomValue() {
        return randomValue;
    }

    public void setRandomValue(int randomValue) {
        this.randomValue = randomValue;
    }

    public int getCustomerValue() {
        return customerValue;
    }

    public void setCustomerValue(int customerValue) {
        this.customerValue = customerValue;
    }


}
