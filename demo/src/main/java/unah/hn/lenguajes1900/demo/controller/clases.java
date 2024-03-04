package unah.hn.lenguajes1900.demo.controller;

public class clases {

    private String codigo;
    private String nombre;
    private int uv;
    
    public clases(String codigo, String nombre, int uv) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.uv = uv;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUv(int uv) {
        this.uv = uv;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getUv() {
        return uv;
    }
    
    
    
}
