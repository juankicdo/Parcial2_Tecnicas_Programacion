import java.text.NumberFormat;
import java.util.Locale;

public class Laptop extends Productos {
    private static String nombre;
    private static String color;



    //  Complejidad temporal: O(1) Tiempo constante

    public Laptop(String nombre, String talla, String color, int i, boolean b) {
        this.nombre = nombre;
        this.color = color;



    }


    //Complejidad temporal: O(1) Tiempo constante

    public String getPrecio() {
        NumberFormat formatoColombiano = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));


        return null;
    }
    // Complejidad temporal: O(1) Tiempo constante
    public static void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Color: " + color);


    }


}
