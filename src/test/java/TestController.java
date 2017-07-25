
import cource.Task2.Model;
import cource.Task2.View;
import cource.Task2.Controller;


import org.junit.Assert;
import org.junit.Test;



/**
 * Created by nanya on 7/25/17.
 */
public class TestController {

    Model model= new Model();
    Controller controller = new Controller(model,new View());

    @Test
    public void testCheckIteration(){
        model.setCustomerValue(10);
        model.setRandomValue(10);
        int result = controller.checkIteration();
        Assert.assertTrue(result==0);
    }



}
