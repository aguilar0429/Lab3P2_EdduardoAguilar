package lab3p2_eduardoaguilar;

import java.util.ArrayList;

public class Tiendas {
    private String nombre;
    private String ubicacion;
    private int empleados;
    private int espera;
    private ArrayList articulos;

    public Tiendas(String nombre, String ubicacion, int empleados, int espera, ArrayList articulos) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.empleados = empleados;
        this.espera = espera;
        this.articulos = articulos;
    }
    
}
