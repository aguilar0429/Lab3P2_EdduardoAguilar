package lab3p2_eduardoaguilar;

public class Administradores {
    private String nombre;
    private String apellido;
    private long ID;
    private String puesto;
    private int anios;
    private int salario;
    private int experiencia;

    public Administradores() {
    }

    public Administradores(String nombre, String apellido, long ID, String puesto, int anios, int salario, int experiencia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        this.puesto = puesto;
        this.anios = anios;
        this.salario = salario;
        this.experiencia = experiencia;
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

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Administradores{" + "nombre=" + nombre + ", apellido=" + apellido + ", ID=" + ID + ", puesto=" + puesto + ", anios=" + anios + ", salario=" + salario + ", experiencia=" + experiencia + '}';
    }
    
    
    
}
