
package unah.hn.lenguajes1900.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
@HttpExchange
public class homeController {
    

    @PostMapping("/crear-alumno")
    public String crearAlumno(
            @PathVariable int numeroCuenta,
            @PathVariable String nombre,
            @PathVariable String apellido,
            @PathVariable String correo,
            @PathVariable List<String> clases) {
        Alumno alumno = new Alumno(numeroCuenta, nombre, apellido, correo, clases);
        return "Alumno creado: " + alumno;
    }
    
    @PostMapping("/crear-clase")
    public String crearClase(
        @PathVariable String codigo,
        @PathVariable String Nombre,
        @PathVariable int uv ) {
        clases clase = new clases(codigo, Nombre, uv);
        return "Clase creado: " + clase;
    }
    
    @PostMapping("/{numeroCuenta}/agregar-clase")
    public String agregarClaseAlumno(
            @PathVariable int numeroCuenta,
            @PathVariable int codigoClase) {
        return "Clase agregada al alumno con número de cuenta: " + numeroCuenta;
    }

     @GetMapping("/{numeroCuenta}")
    public Alumno verAlumno(@PathVariable int numeroCuenta) {
        // Aquí buscarías al alumno por su número de cuenta en tu lista de alumnos
        // y luego retornarías el objeto Alumno correspondiente
        // Supongamos que ya tienes la lógica implementada para encontrar al alumno
        return null; // retornar el alumno encontrado
    }
}
