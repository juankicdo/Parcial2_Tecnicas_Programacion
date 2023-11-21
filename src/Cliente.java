public class Cliente extends Pedido{

    char nombre;
    int direccion;

    String listadepedidos;

    //  Complejidad temporal: O(1) Tiempo constante
    public Cliente(char nombre, int direccion, String listadepedidos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listadepedidos = listadepedidos;
    }

    public char getNombre() {
        return nombre;
    }

    public void setNombre(char nombre) {
        this.nombre = nombre;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public String getListadepedidos() {
        return listadepedidos;
    }

    public void setListadepedidos(String listadepedidos) {
        this.listadepedidos = listadepedidos;
    }
}
