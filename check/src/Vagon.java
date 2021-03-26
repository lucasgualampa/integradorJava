import java.util.Objects;

public class Vagon {
    private float capacidadMaxima, cargaActual;

    public Vagon() {
    }

    public Vagon(float capacidadMaxima, float cargaActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cargaActual = cargaActual;
    }

    public float getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(float capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public float getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(float cargaActual) {
        if (cargaActual >= this.capacidadMaxima) {
            this.cargaActual = this.capacidadMaxima;
        } else {
            this.cargaActual = cargaActual;
        }
    }

    public float calcularCargaActual(){
        if (this.cargaActual >= this.capacidadMaxima){
            return this.capacidadMaxima;
        }
        return this.cargaActual;
    }

    @Override
    public String toString() {
        return "Vagon{" +
                "capacidadMaxima=" + capacidadMaxima +
                ", cargaActual=" + cargaActual +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vagon)) return false;
        Vagon vagon = (Vagon) o;
        return Float.compare(vagon.getCapacidadMaxima(), getCapacidadMaxima()) == 0 && Float.compare(vagon.getCargaActual(), getCargaActual()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCapacidadMaxima(), getCargaActual());
    }
}
