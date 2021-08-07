package lab3p2_eduardoaguilar;

public class Clientes {
    private String nombre;
    private String apellido;
    private String domicilio;
    private int ID;
    private int pedidas;

    public Clientes() {
    }

    public Clientes(String nombre, String apellido, String domicilio, int ID) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPedidas() {
        return pedidas;
    }

    public void setPedidas(int pedidas) {
        this.pedidas = pedidas;
    }

    @Override
    public String toString() {
        return "Clientes{" + "nombre=" + nombre + ", apellido=" + apellido + ", domicilio=" + domicilio + ", ID=" + ID + ", pedidas=" + pedidas + '}';
    }
    
    
    
    
}
