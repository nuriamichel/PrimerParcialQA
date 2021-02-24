package filaATest.p2Test;

import filaA.p2.Ej2Notas;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.ArrayList;
import java.util.List;

@RunWith(value= Parameterized.class)
public class Ej2NotasTest {

    private int notaFinal;
    private String expectedResult;

    public Ej2NotasTest(int notaFinal, String expectedResult) {
        this.notaFinal = notaFinal;
        this.expectedResult = expectedResult;

    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData() {
        List<Object[]> objects = new ArrayList<>();
        objects.add(new Object[]{0,"REGULAR"});
        objects.add(new Object[]{1,"REGULAR"});
        objects.add(new Object[]{2,"REGULAR"});
        objects.add(new Object[]{68,"REGULAR"});
        objects.add(new Object[]{69,"REGULAR"});
        objects.add(new Object[]{70,"REGULAR"});

        objects.add(new Object[]{71,"BUENO"});
        objects.add(new Object[]{72,"BUENO"});
        objects.add(new Object[]{73,"BUENO"});
        objects.add(new Object[]{78,"BUENO"});
        objects.add(new Object[]{79,"BUENO"});
        objects.add(new Object[]{80,"BUENO"});

        objects.add(new Object[]{81,"MUY BUENO"});
        objects.add(new Object[]{82,"MUY BUENO"});
        objects.add(new Object[]{83,"MUY BUENO"});
        objects.add(new Object[]{88,"MUY BUENO"});
        objects.add(new Object[]{89,"MUY BUENO"});
        objects.add(new Object[]{90,"MUY BUENO"});

        objects.add(new Object[]{91,"EXCELENTE"});
        objects.add(new Object[]{92,"EXCELENTE"});
        objects.add(new Object[]{93,"EXCELENTE"});
        objects.add(new Object[]{98,"EXCELENTE"});
        objects.add(new Object[]{99,"EXCELENTE"});
        objects.add(new Object[]{100,"EXCELENTE"});

        objects.add(new Object[]{-1,"VALOR INCORRECTO"});
        objects.add(new Object[]{101,"VALOR INCORRECTO"});

        return objects;
    }

    @Test
    public void verify_nota_final(){

        Ej2Notas ej2Notas = new Ej2Notas();
        String actualResult= ej2Notas.notasCualitativas(this.notaFinal);
        Assert.assertEquals("ERROR! ",this.expectedResult,actualResult);

    }
}
