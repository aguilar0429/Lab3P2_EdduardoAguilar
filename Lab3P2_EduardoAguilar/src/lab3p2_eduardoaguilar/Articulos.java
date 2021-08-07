package lab3p2_eduardoaguilar;

import java.util.ArrayList;

public class Articulos extends Tiendas{
    private String nombre;
    private String categoria;
    private int precio;

    public Articulos(String nombre1, String categoria, int precio, String nombre, String ubicacion, int empleados, int espera, ArrayList articulos) {
        super(nombre, ubicacion, empleados, espera, articulos);
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }
    
    
}
