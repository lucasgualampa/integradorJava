import Interfaces.IAcciones;
import exceptions.ExceptionCustom;

import java.util.List;
import java.util.Objects;

public class CompaniaFerroviaria implements IAcciones {
    private Integer codigoEmpresa;
    private List<Tren> trenes;
    private List<Empleado> empleados;



    public CompaniaFerroviaria(Integer codigoEmpresa, List<Tren> trenes, List<Empleado> empleados) {
        this.codigoEmpresa = codigoEmpresa;
        this.trenes = trenes;
        this.empleados = empleados;
    }

    public Integer getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(Integer codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public List<Tren> getTrenes() {
        return trenes;
    }

    public void setTrenes(List<Tren> trenes) {
        this.trenes = trenes;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CompaniaFerroviaria)) return false;
        CompaniaFerroviaria that = (CompaniaFerroviaria) o;
        return Objects.equals(getCodigoEmpresa(), that.getCodigoEmpresa()) && Objects.equals(getTrenes(), that.getTrenes()) && Objects.equals(getEmpleados(), that.getEmpleados());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoEmpresa(), getTrenes(), getEmpleados());
    }

    @Override
    public String toString() {
        return "CompaniaFerroviaria{" +
                "codigoEmpresa=" + codigoEmpresa +
                ", trenes=" + trenes +
                ", empleados=" + empleados +
                '}';
    }

    /*
    //for each
    public void listarTrenes(){
        for (Tren t:
                trenes) {
            System.out.println(t.toString());
        }
    }
     */


    public void listarTrenes(){
        // for
        for (int i = 0; i < trenes.size(); i++) {
            System.out.println(trenes.get(i));
        }
    }

    @Override
    public void agregar(Object obj) throws ExceptionCustom {
        if (obj instanceof Tren) {
            if (trenes.contains(obj)){
                throw new ExceptionCustom("Tren repetido");
            }
            trenes.add((Tren) obj);
        }
        if (obj instanceof Empleado){
            if (empleados.contains(obj)){
                throw new ExceptionCustom("Empleado repetido");
            }
            empleados.add((Empleado) obj);
        }
    }

    @Override
    public Object buscar(Object obj) {
        Object objReturn = null;
        if (obj instanceof Tren){
            if (trenes.contains(obj)){
                return obj;
            }
        }
        if (obj instanceof Empleado){
            if (empleados.contains(obj)){
                return obj;
            }
        }
        return objReturn;
    }

    @Override
    public void quitar(Object obj) throws ExceptionCustom {
        if (obj instanceof Tren){
            if (!trenes.contains(obj)){
                throw new ExceptionCustom("Tren inexistente");
            }
            trenes.remove((Tren) obj);
        }
        if (obj instanceof Empleado){
            if (empleados.contains(obj)){
                throw new ExceptionCustom("Empleado inexistente");
            }
            empleados.remove((Empleado) obj);
        }

    }

}
