import org.junit.Assert;
import org.junit.Test;
import cource.Task2.Model;

/**
 * Created by nanya on 7/25/17.
 */
public class TestModel {

    @Test
    public void testCompareNumbers1(){
        Model model = new Model();
        int result=model.compareNumbers(10,20);
        Assert.assertTrue(result==-1);
        //Assert.assertEquals(result,-1);

    }

    @Test
    public void testCompareNumbers2(){
        Model model = new Model();
        int result=model.compareNumbers(10,10);
        Assert.assertTrue(result==0);
    }

    public @Test void testRandomValue(){
        Model model = new Model();
        int result=model.getRandomValue();
        Assert.assertTrue(result > 0 && result <100);

    }
}
