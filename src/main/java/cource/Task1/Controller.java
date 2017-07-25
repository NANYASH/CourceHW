package cource.Task1;

import java.util.Scanner;

/**
 * Created by nanya on 7/20/17.
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


        model.setFirstWord(inputStringValueWithScanner(view.FIRST_WORD));
        model.setSecondWord(inputStringValueWithScanner(view.SECOND_WORD));
        view.printMessage(model.addOurWords());

    }

    // The Utility methods
    public String inputStringValueWithScanner( String word) {

        view.printMessage(view.INPUT_FIRST_WORD + word);
        Scanner scanner = new Scanner(System.in);

        while( !scanner.next().equals(word.substring(1,word.length()-1))) {
            view.printMessage(view.WRONG_INPUT_WORD + view.INPUT_FIRST_WORD);
        }
        return word.substring(1,word.length()-1);
    }
}
