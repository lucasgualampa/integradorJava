import java.util.Objects;

public class MaquinaTractora {
    private float fuerzaDeCarga;
    private Operario conductor;

    public MaquinaTractora() {
    }

    public MaquinaTractora(float fuerzaDeCarga, Operario conductor) {
        this.fuerzaDeCarga = fuerzaDeCarga;
        this.conductor = conductor;
    }

    public float getFuerzaDeCarga() {
        return fuerzaDeCarga;
    }

    public void setFuerzaDeCarga(float fuerzaDeCarga) {
        this.fuerzaDeCarga = fuerzaDeCarga;
    }

    public Operario getConductor() {
        return conductor;
    }

    public void setConductor(Operario conductor) {
        this.conductor = conductor;
    }

    @Override
    public String toString() {
        return "MaquinaTractora{" +
                "fuerzaDeCarga=" + fuerzaDeCarga +
                ", conductor=" + conductor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MaquinaTractora)) return false;
        MaquinaTractora that = (MaquinaTractora) o;
        return Float.compare(that.getFuerzaDeCarga(), getFuerzaDeCarga()) == 0 && Objects.equals(getConductor(), that.getConductor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFuerzaDeCarga(), getConductor());
    }
}
