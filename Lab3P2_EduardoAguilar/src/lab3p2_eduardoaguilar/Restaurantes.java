
package lab3p2_eduardoaguilar;

import java.util.ArrayList;

public class Restaurantes {
   private String ubicacion;
    private String nombre;
    private String RTN;
    private String slogan;
    private ArrayList comidas;

    public Restaurantes() {
    }

    public Restaurantes(String ubicacion, String nombre, String RTN, String slogan, ArrayList comidas) {
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.RTN = RTN;
        this.slogan = slogan;
        this.comidas = comidas;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRTN() {
        return RTN;
    }

    public void setRTN(String RTN) {
        this.RTN = RTN;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public ArrayList getComidas() {
        return comidas;
    }

    public void setComidas(ArrayList comidas) {
        this.comidas = comidas;
    }
    
    
}
