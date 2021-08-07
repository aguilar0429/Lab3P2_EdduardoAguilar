package lab3p2_eduardoaguilar;

import java.util.ArrayList;

public class Acompaniamiento extends Comidas{
    private String nombre;
    private String tipo;
    private int precio;

    public Acompaniamiento(String nombre11, String tipo, int precio11, String ID, String nombree, String precio, String cantidad, ArrayList acomp, String ubicacion, String nombre, String RTN, String slogan, ArrayList comidas) {
        super(ID, nombree, precio, cantidad, acomp, ubicacion, nombre, RTN, slogan, comidas);
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio11;
    }

    public Acompaniamiento(String ID, String nombree, String precio, String cantidad, ArrayList acomp, String ubicacion, String nombre, String RTN, String slogan, ArrayList comidas) {
        super(ID, nombree, precio, cantidad, acomp, ubicacion, nombre, RTN, slogan, comidas);
    }

  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public int getPrecioo() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
    
}
