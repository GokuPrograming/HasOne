import org.example.hasOne;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHasOne {
    hasOne h = new hasOne();
    @Test
    public void testeo_de_si_es_uno() {

        assertEquals(true, h.hasOne(10));
    }

    @Test
    public void testValidarNumero() {
        assertEquals(true,h.validar_Numero("20"));
        assertEquals(false,h.validar_Numero("h"));
        assertEquals(true,h.validar_Numero("10"));

    }
}
