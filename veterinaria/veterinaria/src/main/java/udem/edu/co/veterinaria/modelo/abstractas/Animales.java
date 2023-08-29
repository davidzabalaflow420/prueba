/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.veterinaria.modelo.abstractas;

/**
 *
 * @author david
 */
public abstract class Animales implements Clasificacion {
    private String tipo;
    private int id;

    public Animales(String tipo, int id) {
        this.tipo = tipo;
        this.id = id;
    }

    public Animales(int id2) {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
