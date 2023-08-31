/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.quiz1.modelo;

/**
 *
 * @author david
 */
public class Zanahorias extends Vegetales {

    private String color;
    private String nombre;
    private static int edad;

    public Zanahorias(String color, String nombre, int vida) {
        super(nombre, color, nombre, edad);
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString() {
        String aux = "{\"Zanahorias\":\n"
                + "        \"Nombre\":\n"
                + "        \"" + super.getNombre() + "\",\n"
                + "        \"Color\":\n"
                + "        \"" + super.getColor() + "\",\n"
                + "        \"Vida\":\n"
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toXml() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toXml'");
    }

}
