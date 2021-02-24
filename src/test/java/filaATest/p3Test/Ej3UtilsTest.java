package filaATest.p3Test;

import filaA.p3.Ej3Utils;
import org.junit.Assert;
import org.junit.Test;

public class Ej3UtilsTest {
    Ej3Utils ej3Utils;

    @Test(expected = Exception.class)
    public void exception1() throws Exception {
        ej3Utils.isCorrectCI("");
    }
    @Test(expected = Exception.class)
    public void exception2() throws Exception {
        ej3Utils.isCorrectCI("qweqd");
    }
    @Test(timeout = 2000)
    public void multiTime() throws Exception {
        boolean actualResult= ej3Utils.isCorrectCI("9689792");
        boolean expectedResult= true;
        Assert.assertEquals("error tiempo de ejecucion",expectedResult,actualResult);
    }
    @Test
    public void test1() throws Exception {
        boolean actualResult= ej3Utils.isCorrectCI("9689792");
        boolean expectedResult= true;
        Assert.assertEquals("error",expectedResult,actualResult);

    }

    @Test
    public void test2() throws Exception {
        boolean actualResult= ej3Utils.isCorrectCI("-792");
        boolean expectedResult= false;
        Assert.assertEquals("error",expectedResult,actualResult);
    }

}
