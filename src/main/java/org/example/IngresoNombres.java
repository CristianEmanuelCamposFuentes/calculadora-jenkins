package org.example;

public class IngresoNombres {
    private String primerNombre;
    private String primerApellido;

    public IngresoNombres() {
    }

    public String getNombreCompleto(){
        return primerNombre + " " + primerApellido;
    }
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
}
