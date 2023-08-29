package udem.edu.co.veterinaria.vista;

import java.util.ArrayList;
import java.util.List;

import udem.edu.co.veterinaria.modelo.abstractas.Clasificacion;
import udem.edu.co.veterinaria.modelo.entidades.Canino;
import udem.edu.co.veterinaria.modelo.entidades.Felino;

public class Veterinaria {

    public static void main(String[] args) {
        List<Clasificacion> lista = new ArrayList<>();

        lista.add(new Canino("Canino", 1));
        lista.add(new Felino("Felino", 1));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }
    }

    public void mostrarDatos() {
    }
}
