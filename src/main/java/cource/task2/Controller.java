package cource.task2;

import java.util.Scanner;

/**
 * Created by nanya on 7/25/17.
 */
public class Controller {

    Model model;
    View view;

    // Constructor
    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){

        do {
            model.setCustomerValue(inputIntValueWithScanner());

        }while (checkIteration()!= 0);

    }

    // The Utility methods
    public int checkIteration(){
        if(model.compareNumbers(model.getRandomValue(),model.getCustomerValue()) == 0){
            view.printCongratulationMessage(view.CONGRATULATIONS,model.getCustomerValue());
            return 0;
        }

        return -1;

    }
    public int checkIntValue(Scanner sc) {
        view.printMessageWithInterval(view.INPUT_INT_DATA,model.getMinValue(),model.getMaxValue());

        while(!sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA + view.INPUT_INT_DATA);
            sc.next();
        }

        return sc.nextInt();
    }
    public int inputIntValueWithScanner(){
        Scanner sc = new Scanner(System.in);
        int input;
        do{
            input = checkIntValue(sc);
        }
        while (input < model.getMinValue() && input > model.getMaxValue());

        return input;
    }
}
