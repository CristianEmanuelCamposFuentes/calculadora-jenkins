package org.example;

public class Calculadora {
    private int primerNumero;

    private int segundoNumero;

    public Calculadora() {
    }

    public Calculadora(int primerNumero, int segundoNumero) {
        this.primerNumero = primerNumero;
        this.segundoNumero = segundoNumero;
    }

    public int getPrimerNumero() {
        return primerNumero;
    }

    public void setPrimerNumero(int primerNumero) {
        this.primerNumero = primerNumero;
    }

    public int getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(int segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    public int sumar() {
        return primerNumero + segundoNumero;
    }

    public int restar() {
        return primerNumero - segundoNumero;
    }

    public int multiplicar() {
        return primerNumero * segundoNumero;
    }

    public int dividir() {
        if (segundoNumero == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return primerNumero / segundoNumero;
    }
}
