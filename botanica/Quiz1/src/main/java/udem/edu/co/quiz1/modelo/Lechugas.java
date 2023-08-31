package udem.edu.co.quiz1.modelo;

public class Lechugas extends Vegetales {
    private String color;
    private String nombre;
    private int edad;

    public Lechugas(String color, String nombre, int edad) {
        super(color, nombre, nombre, edad);
        this.color = color;
        this.nombre = nombre;
        this.edad = edad;
    }

    // ... other methods ...

    public String toXml() {
        return "<Lechugas>\n" +
                "    <Nombre>" + getNombre() + "</Nombre>\n" +
                "    <Color>" + getColor() + "</Color>\n" +
                "    <Edad>" + getEdad() + "</Edad>\n" +
                "</Lechugas>";
    }

    @Override
    public String color() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'color'");
    }

    @Override
    public int vida() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'vida'");
    }

}
