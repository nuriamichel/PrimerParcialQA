package filaATest.p6;

import filaA.p1.Ej1UtilsNumeros;
import filaATest.p1Test.Ej1UtilsNumerosTest;
import filaATest.p2Test.Ej2NotasTest;
import filaATest.p3Test.Ej3UtilsTest;
import filaATest.p4Test.CambioMonedaTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


    @RunWith(value =  Suite.class)
    @Suite.SuiteClasses(
            {
                    Ej1UtilsNumerosTest.class,
                    Ej2NotasTest.class,
                    Ej3UtilsTest.class,
                    CambioMonedaTest.class
            }

    )
    public class TestSuite{
    }

