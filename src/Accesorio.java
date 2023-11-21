
import java.text.NumberFormat;
import java.util.Locale;

public class Accesorio extends Productos{

    private static String nombre;
    private static String color;
    private static double precio;


    //  Complejidad temporal: O(1) Tiempo constante

    public Accesorio(String nombre, String talla, String color, double precio, String slimFit) {
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
    }


    //Complejidad temporal: O(1) Tiempo constante

    public String getPrecio() {
        NumberFormat formatoColombiano = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));

        String precioFormateado;
        precioFormateado = formatoColombiano.format(this.precio);
        return precioFormateado;
    }
     // Complejidad temporal: O(1) Tiempo constante
    public static void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Color: " + color);
        System.out.println("Precio: " + precio);
    }
}



