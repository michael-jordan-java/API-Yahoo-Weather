package br.com.jordan.testemobile;

import org.junit.Test;

import br.com.jordan.testemobile.Activity.MainActivity;
import br.com.jordan.testemobile.Util.ConversorUtil;

import static junit.framework.Assert.assertEquals;

/**
 * Created by User on 20/09/2017.
 */

public class MainActivityTest extends ExampleUnitTest {

    @Test
    public void testIsCeulcius(){
        assertEquals(24, ConversorUtil.toCelcius(76));
        assertEquals(11, ConversorUtil.toCelcius(53));
        assertEquals(13, ConversorUtil.toCelcius(56));
        assertEquals(28, ConversorUtil.toCelcius(84));
    }

    @Test
    public void testTradutor(){
        assertEquals("tornado",ConversorUtil.traduzir("tornado"));
        assertEquals("tempestade tropical",ConversorUtil.traduzir("tropical storm"));
        assertEquals("soprando neve",ConversorUtil.traduzir("blowing snow"));
        assertEquals("poeira",ConversorUtil.traduzir("dust"));

    }
}
