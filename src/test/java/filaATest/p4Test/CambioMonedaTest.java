package filaATest.p4Test;

import filaA.p4.CambioMoneda;
import filaA.p4.Util;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
@RunWith(value= Parameterized.class)
public class CambioMonedaTest {



    private int amount;
    private String monedaOriginal;
    private String monedaDestino;
    private String expectedResult;
    private int expectedMock;

    public CambioMonedaTest(int amount, String monedaOriginal, String monedaDestino, String expectedResult, int expectedMock) {
        this.amount = amount;
        this.monedaOriginal = monedaOriginal;
        this.monedaDestino = monedaDestino;
        this.expectedResult = expectedResult;
        this.expectedMock = expectedMock;
    }


    @Parameterized.Parameters
        public static Iterable<Object[]> getData(){
            List<Object[]> objects= new ArrayList<>();
            objects.add(new Object[]{100,"Dolares","Bolivianos","[700] Bolivianos"});
        objects.add(new Object[]{-100,"Dolares","Bolivianos","Cantidad incorrecta"});




            return objects;
        }

        //PASO 2
    Util util=Mockito.mock(Util.class);

        @Test
        public void verify_calculate_credit() {
            // Paso 3

            Mockito.when(util.obtenerTipoDeCambio(this.monedaOriginal, this.monedaDestino)).thenReturn(this.expectedMock);

            // Paso 4
            CambioMoneda cambioMoneda = new CambioMoneda(util);

            String actualResult = cambioMoneda.saveInNewMoney (this.amount, this.monedaOriginal, this.monedaDestino);
            Assert.assertEquals("ERROR! ", this.expectedResult, actualResult);
        }

}
