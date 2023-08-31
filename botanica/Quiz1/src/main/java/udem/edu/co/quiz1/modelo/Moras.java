/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.quiz1.modelo;

/**
 *
 * @author david
 */
public class Moras extends Frutas {

    private String color;
    private String nombre;
    private String reino;
    private int edad;

    public Moras(String color, String nombre, int edad) {
        super(nombre, color, edad);
        this.color = color;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString() {
        String aux = "{\"Moras\":\n"
                + "        \"Nombre\":\n"
                + "        \"" + super.getNombre() + "\",\n"
                + "        \"Color\":\n"
                + "        \"" + super.getColor() + "\",\n"
                + "        \"Edad\":\n"
                + "        \"" + super.getEdad() + "\",\n"
                + "    }\n"
                + "}";
        return aux;

    }

    @Override
    public String color() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int vida() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'vida'");
    }

    @Override
    public String toXml() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toXml'");
    }

}
