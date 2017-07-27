
import cource.task2.Model;
import cource.task2.View;
import cource.task2.Controller;


import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;


/**
 * Created by nanya on 7/25/17.
 */
public class TestController {


    Model model= new Model();
    Controller controller = new Controller(model,new View());

    @Test
    public void testCheckIteration1(){
        model.setCustomerValue(10);
        model.setRandomValue(10);
        int result = controller.checkIteration();
        Assert.assertTrue(result==0);
    }
    @Test
    public void testCheckIteration2(){
        model.setCustomerValue(20);
        model.setRandomValue(10);
        int result = controller.checkIteration();
        Assert.assertTrue(result==-1);
    }

    @Test
    public void testCheckIntValue(){
        Assert.assertEquals(controller.checkIntValue(new Scanner("20")),20);
        Assert.assertFalse(controller.checkIntValue(new Scanner("21"))==20);

    }



}
