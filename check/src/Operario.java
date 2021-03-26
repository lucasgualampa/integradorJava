import java.util.Objects;

public class Operario extends Empleado{
    private int hrsDisponibles;

    public Operario() {
    }

    public Operario(String nombre, String apellido, int hrsDisponibles) {
        super(nombre, apellido);
        this.hrsDisponibles = hrsDisponibles;
    }

    public int getHrsDisponibles() {
        return hrsDisponibles;
    }

    public void setHrsDisponibles(int hrsDisponibles) {
        this.hrsDisponibles = hrsDisponibles;
    }

    @Override
    public String toString() {
        return "Operario{" +
                "hrsDisponibles=" + hrsDisponibles +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Operario)) return false;
        if (!super.equals(o)) return false;
        Operario operario = (Operario) o;
        return getHrsDisponibles() == operario.getHrsDisponibles();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getHrsDisponibles());
    }
}
