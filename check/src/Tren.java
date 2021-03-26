import exceptions.ExceptionCustom;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tren {
    private int id;
    private Jefe jefe;
    private MaquinaTractora maquina;
    private List<Vagon> vagones;
    private static int idGlobalTren = 2000;

    public Tren() {
    }

    public Tren(Jefe jefe, MaquinaTractora maquina) {
        this.id = idGlobalTren++;
        this.jefe = jefe;
        this.maquina = maquina;
        this.vagones = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Jefe getJefe() {
        return jefe;
    }

    public void setJefe(Jefe jefe) {
        this.jefe = jefe;
    }

    public MaquinaTractora getMaquina() {
        return maquina;
    }

    public void setMaquina(MaquinaTractora maquina) {
        this.maquina = maquina;
    }

    public List<Vagon> getVagones() {
        return vagones;
    }

    public void setVagones(List<Vagon> vagones) {
        this.vagones = vagones;
    }

    public static int getIdGlobalTren() {
        return idGlobalTren;
    }

    public static void setIdGlobalTren(int idGlobalTren) {
        Tren.idGlobalTren = idGlobalTren;
    }

    public float calcularCargaTotal(){
        float cargaTotal = 0;
        for (Vagon vagon:
             vagones) {
            cargaTotal += vagon.calcularCargaActual();
        }
        return cargaTotal;
    }

    public boolean validarRelacionCargaPotencia(float cargaAdicional) {
        if (1000 * maquina.getFuerzaDeCarga() >= calcularCargaTotal() + cargaAdicional){
            return true;
        }
        return false;
    }

    public Vagon agregarVagon(Vagon vagon) throws ExceptionCustom {
        Vagon vagonReturn = null;
        if (!validarRelacionCargaPotencia(vagon.getCargaActual())){
            throw new ExceptionCustom("Exceso de carga");
        }
        vagones.add(vagon);
        vagonReturn = vagon;
        return vagonReturn;
    }

    public float calcularCargaDisponible() {
        return 1000 * maquina.getFuerzaDeCarga() - this.calcularCargaTotal();
    }

    @Override
    public String toString() {
        return "Tren{" +
                "id=" + id +
                ", jefe=" + jefe +
                ", maquina=" + maquina +
                ", vagones=" + vagones +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tren)) return false;
        Tren tren = (Tren) o;
        return getId() == tren.getId() && Objects.equals(getJefe(), tren.getJefe()) && Objects.equals(getMaquina(), tren.getMaquina()) && Objects.equals(getVagones(), tren.getVagones());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getJefe(), getMaquina(), getVagones());
    }
}
