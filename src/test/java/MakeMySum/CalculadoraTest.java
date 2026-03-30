package MakeMySum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    @Test
    public void testSoma() {
        Calculadora calc = new Calculadora();

        assertEquals(3, calc.soma(1, 2));
    }
}
