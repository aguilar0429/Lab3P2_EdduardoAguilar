package lab3p2_eduardoaguilar;


public class Programadores {
    private String nombre;
    private String apellido;
    private long ID;
    private String puesto;
    private int anios;
    private int salario;
    private String lenguaje;
    private String horario;

    public Programadores() {
    }

    public Programadores(String nombre, String apellido, long ID, String puesto, int anios, int salario, String lenguaje, String horario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        this.puesto = puesto;
        this.anios = anios;
        this.salario = salario;
        this.lenguaje = lenguaje;
        this.horario = horario;
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

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Programadores{" + "nombre=" + nombre + ", apellido=" + apellido + ", ID=" + ID + ", puesto=" + puesto + ", anios=" + anios + ", salario=" + salario + ", lenguaje=" + lenguaje + ", horario=" + horario + '}';
    }
    
    
    
}
