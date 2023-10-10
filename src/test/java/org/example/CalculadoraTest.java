package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    // Creamos la variable cual va a ser la instancia antes de cada prueba
    private Calculadora calculadora;
    @BeforeEach
    void setUp() {
        // Instancia con dos argumentos dados
        calculadora = new Calculadora(10, 5);

    }

    @Test
    void getPrimerNumero() {
    }

    @Test
    void getSegundoNumero() {
    }

    @Test
    void sumar() {
        assertEquals(15, calculadora.sumar());
    }

    @Test
    void restar() {
        assertEquals(5, calculadora.restar());
    }

    @Test
    void multiplicar() {
        assertEquals(50, calculadora.multiplicar());
    }

    @Test
    void dividir() {
        assertEquals(2,calculadora.dividir());
    }

    @Test
    void dividirPorCero(){
        // Verificar que dividir por cero arroje una Arithmetic Exception

        assertThrows(ArithmeticException.class, () -> {
            Calculadora calculadoraInvalida = new Calculadora(10,0);
            calculadoraInvalida.dividir();
        });
    }
}