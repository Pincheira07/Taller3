import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class RAMTest {
    @BeforeEach
    public void before(){


    }

    @org.junit.jupiter.api.Test
    void testToString() {
        RAM rtest = new RAM("Kingston",8, 3500 );
        String prueba = "RAM{" + "marca:" + "Kingston" + ", capacidad:" + 8 + ", frecuencia:" + 3500 + '}';
        assertEquals(prueba,rtest.toString());
    }

    @org.junit.jupiter.api.Test
    void testValidarFrecuencia() {
        RAM rtest = new RAM("Kingston",8, 3500 );
        boolean prueba = rtest.validarFrecuencia(0);
        assertEquals(false,prueba);

    }

    @org.junit.jupiter.api.Test
    void testValidarCapacidad() {
        RAM rtest = new RAM("Kingston",8, 3500 );
        boolean prueba = rtest.validarCapacidad(40000);
        assertEquals(false,prueba);
    }
}