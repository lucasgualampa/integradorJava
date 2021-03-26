import java.util.Objects;

public abstract class Empleado {
    private int id;
    private String nombre,apellido;
    private static int idGlobal = 1;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido) {
        this.id = idGlobal++;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public static int getIdGlobal() {
        return idGlobal;
    }

    public static void setIdGlobal(int idGlobal) {
        Empleado.idGlobal = idGlobal;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empleado)) return false;
        Empleado empleado = (Empleado) o;
        return getId() == empleado.getId() && Objects.equals(getNombre(), empleado.getNombre()) && Objects.equals(getApellido(), empleado.getApellido());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNombre(), getApellido());
    }
}
