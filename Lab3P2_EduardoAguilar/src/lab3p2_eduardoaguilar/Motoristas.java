package lab3p2_eduardoaguilar;


public class Motoristas {
    private String nombre;
    private String apellido;
    private long ID;
    private String puesto;
    private int anios;
    private int salario;
    private int comisiones;
    private String medio;
    private int encargos;

    public Motoristas() {
    }

    public Motoristas(String nombre, String apellido, long ID, String puesto, int anios, int salario, String medio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        this.puesto = puesto;
        this.anios = anios;
        this.salario = salario;
        this.medio = medio;
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

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getComisiones() {
        return comisiones;
    }

    public void setComisiones(int comisiones) {
        this.comisiones = comisiones;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    public int getEncargos() {
        return encargos;
    }

    public void setEncargos(int encargos) {
        this.encargos = encargos;
    }

    @Override
    public String toString() {
        return "Motoristas{" + "nombre=" + nombre + ", apellido=" + apellido + ", ID=" + ID + ", puesto=" + puesto + ", anios=" + anios + ", salario=" + salario + ", comisiones=" + comisiones + ", medio=" + medio + ", encargos=" + encargos + '}';
    }
    
   
    
}
