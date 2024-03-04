package unah.hn.lenguajes1900.demo.controller;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private int numeroCuenta;
    private String nombre;
    private String apellido;
    private String correo;
    List<String> clases = new ArrayList<>();

    public Alumno(int numeroCuenta, String nombre, String apellido, String correo, List<String> clases) {
        this.numeroCuenta = numeroCuenta;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.clases = clases;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public List<String> getClases() {
        return clases;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setClases(List<String> clases) {
        this.clases = clases;
    }

    
}
