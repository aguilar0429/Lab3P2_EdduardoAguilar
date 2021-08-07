package lab3p2_eduardoaguilar;

import java.util.ArrayList;

public class Comidas extends Restaurantes {
    private String ID;
    private String nombre;
    private String precio;
    private String cantidad;
    private ArrayList acomp;

    public Comidas(String ubicacion, String nombre, String RTN, String slogan, ArrayList comidas) {
        super(ubicacion, nombre, RTN, slogan, comidas);
    }

    public Comidas(String ID, String nombree, String precio, String cantidad, ArrayList acomp, String ubicacion, String nombre, String RTN, String slogan, ArrayList comidas) {
        super(ubicacion, nombre, RTN, slogan, comidas);
        this.ID = ID;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.acomp = acomp;
    }

    

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public ArrayList getAcomp() {
        return acomp;
    }

    public void setAcomp(ArrayList acomp) {
        this.acomp = acomp;
    }
    
    
    
    
    
}
