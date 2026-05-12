package builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    @Test
    void deveCriarPizzaCompleta() {

        Pizza pizza = new PizzaBuilder()
                .setMassa("Tradicional")
                .setMolho("Tomate")
                .setQueijoExtra(true)
                .setBordaRecheada(true)
                .build();

        assertEquals("Tradicional", pizza.getMassa());
        assertEquals("Tomate", pizza.getMolho());
        assertTrue(pizza.isQueijoExtra());
        assertTrue(pizza.isBordaRecheada());
    }

    @Test
    void deveCriarPizzaSimples() {

        Pizza pizza = new PizzaBuilder()
                .setMassa("Fina")
                .setMolho("Branco")
                .build();

        assertEquals("Fina", pizza.getMassa());
        assertEquals("Branco", pizza.getMolho());
        assertFalse(pizza.isQueijoExtra());
        assertFalse(pizza.isBordaRecheada());
    }
}