/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.veterinaria.modelo.entidades;

import udem.edu.co.veterinaria.modelo.abstractas.Animales;

/**
 *
 * @author david
 */
public class Felino extends Animales {

    private int id;
    private String tipo;

    public Felino(String tipo, int id) {
        super(id);
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        String aux = "{\"Felino\":\n"
                + "        \"" + super.getId() + "\",\n"
                + "        \"" + super.getTipo() + "\",\n"

                + "    }\n"
                + "}";
        return aux;

    }

    @Override
    public String tipo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int id() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
