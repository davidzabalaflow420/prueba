package udem.edu.co.quiz1.vista;

import java.util.ArrayList;
import java.util.List;

import udem.edu.co.quiz1.modelo.Clasificacion;
import udem.edu.co.quiz1.modelo.Lechugas;
import udem.edu.co.quiz1.modelo.Moras;
import udem.edu.co.quiz1.modelo.Zanahorias;

public class Quiz1 {
    public static void main(String[] args) {
        List<Clasificacion> lista = new ArrayList<>();

        lista.add(new Lechugas("verde", "Crespa", 1));
        lista.add(new Zanahorias("Naranja", "Bugs", 3));
        lista.add(new Moras("morada", "Cali", 6));

        for (Clasificacion clasificacion : lista) {
            System.out.println(clasificacion.toXml());
        }
    }

    public void mostrarDatos() {
        // ...
    }
}
