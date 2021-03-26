import java.util.Objects;

public class Jefe extends  Empleado{
    private int telefono;

    public Jefe() {
    }

    public Jefe(String nombre, String apellido, int telefono) {
        super(nombre, apellido);
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Jefe{" +
                "telefono=" + telefono +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Jefe)) return false;
        if (!super.equals(o)) return false;
        Jefe jefe = (Jefe) o;
        return getTelefono() == jefe.getTelefono();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTelefono());
    }


}
