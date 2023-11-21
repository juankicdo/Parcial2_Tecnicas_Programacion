public class Productos {

    String laptop;
    String telefono;
    String accesorios;

    public static void main(String[] args) {
    Laptop apple = new Laptop ("apple pro max", "50x50", "Azul", 35000, false);
    Accesorio goma = new Accesorio("goma para teclado", "50x25", "azul", 75000, "Slim Fit");
    Telefono pro = new Telefono("iphone 11", "20x15", "negro", 150000, "Slim Fit");

        Laptop.mostrarInfo();
        System.out.println("\n");
        Accesorio.mostrarInfo();
}

}
