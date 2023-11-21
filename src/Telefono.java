import java.text.NumberFormat;
import java.util.Locale;

public class Telefono extends Productos{
    private String nombre;
    private String color;
    private double precio;


    //  Complejidad temporal: O(1) Tiempo constante

    public Telefono(String nombre, String talla, String color, double precio, String slimFit) {
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;

    }


    //Complejidad temporal: O(1) Tiempo constante

    public String getPrecio() {
        NumberFormat formatoColombiano = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));

        String precioFormateado = formatoColombiano.format(this.precio);
        return precioFormateado;
    }
    // Complejidad temporal: O(1) Tiempo constante.
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Color: " + color);
        System.out.println("Precio: " + getPrecio());

    }




}
