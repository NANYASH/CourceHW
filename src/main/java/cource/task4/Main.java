package cource.task4;

import cource.task4.Controller.Controller;
import cource.task4.Model.Model;
import cource.task4.View.View;

/**
 * Created by nanya on 7/28/17.
 */
public class Main {
    public static void main(String[] args) {
        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.processUser();
    }

}
