import exceptions.ExceptionCustom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testMain {

    public static void main(String[] args) {

        System.out.println("EMPLEADOS");
        Jefe jefeDelTren1 = new Jefe("Miguel", "Rovira", 23002563);
        Jefe jefeDelTren2 = new Jefe("Pamela", "Sarara", 2315263);
        Operario operarioDeLaMaquinaTractora1 = new Operario("Juan", "Hernández", 45);
        Operario operarioDeLaMaquinaTractora2 = new Operario("Juana", "DeArco", 40);

        List<Empleado> empleados = new ArrayList<>(Arrays.asList(jefeDelTren1, operarioDeLaMaquinaTractora1));
        System.out.println(empleados);

        System.out.println("MÁQUINAS TRACTORAS");
        MaquinaTractora maquinaTractora1 = new MaquinaTractora(24.0f, operarioDeLaMaquinaTractora1);
        MaquinaTractora maquinaTractora2 = new MaquinaTractora(20.0f, operarioDeLaMaquinaTractora2);
        System.out.println(maquinaTractora1);
        System.out.println(maquinaTractora2);

        System.out.println("TRENES Y VAGONES");
        Vagon vagon1 = new Vagon(25000.0f, 24500.0f);
        Vagon vagon2 = new Vagon(100.0f, 100.0f);
        Vagon vagon3 = new Vagon(80.0f, 40.0f);
        Vagon vagon4 = new Vagon(70.0f, 65.0f);
        Vagon vagon5 = new Vagon(200.0f, 150.0f);
        Vagon vagon6 = new Vagon(170.0f, 100.0f);

        Tren tren1 = new Tren(jefeDelTren1, maquinaTractora1);
        Tren tren2 = new Tren(jefeDelTren2, maquinaTractora2);
        System.out.println(tren1);
        System.out.println(tren2);

        try {
            tren1.agregarVagon(vagon2);
            tren2.agregarVagon(vagon3);
            tren1.agregarVagon(vagon1);
        } catch (ExceptionCustom e) {
            System.out.println(e.getMessage());
        }

        List<Tren> trenes = new ArrayList<>(Arrays.asList(tren1, tren2));
        System.out.println("List trenes : " + trenes);

        System.out.println("COMPAÑÍAS FERROVIARIAS");
        CompaniaFerroviaria AFE = new CompaniaFerroviaria(10021, trenes, empleados);
        System.out.println(AFE);
        try {
            AFE.agregar(tren2);
        } catch (ExceptionCustom e) {
            System.out.println(e.getMessage());
        }
        try {
            AFE.agregar(operarioDeLaMaquinaTractora1);
        } catch (ExceptionCustom e) {
            System.out.println(e.getMessage());
        }
    }
}
