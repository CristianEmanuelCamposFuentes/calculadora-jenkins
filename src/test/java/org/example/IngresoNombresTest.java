package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IngresoNombresTest {
    private IngresoNombres instanciaNueva;

    @BeforeEach
    void setUp() {
        // Creo esa instancia para acceder a los metodos de Ingreso Nombres
        // en cada test que hago
        instanciaNueva = new IngresoNombres();
    }

    @Test
    void getNombreCompleto() {
        // Le seteo el nombre y despues el apellido y despues compruebo si coincide
        instanciaNueva.setPrimerNombre("Bart");
        instanciaNueva.setPrimerApellido("Simpson");
        assertEquals("Bart Simpson", instanciaNueva.getNombreCompleto());
    }

    @Test
    void getPrimerNombre() {
        instanciaNueva.setPrimerNombre("bart");
        assertEquals("bart", instanciaNueva.getPrimerNombre());
    }

    @Test
    void getPrimerApellido() {
        instanciaNueva.setPrimerApellido("simpson");
        assertEquals("simpson", instanciaNueva.getPrimerApellido());

    }
}