package CAP10;

import java.util.ArrayList;

public class Carrito {

    private ArrayList<Elemento> productos;

    public Carrito() {
        productos = new ArrayList<>();
    }

    public void agrega(Elemento e) {
        int indice = 0;
        boolean dentro = false;
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getNombreProducto().equals(e.getNombreProducto())) {
                dentro = true;
                indice = i;
            }
        }
        if (dentro)
            productos.get(indice).setCantidad(productos.get(indice).getCantidad() + e.getCantidad());
        else
            productos.add(e);
    }

    public double importeTotal() {
        double suma = 0;
        for (int i = 0; i < productos.size(); i++) {
            suma += (productos.get(i).getPrecio() * productos.get(i).getCantidad());
        }
        return suma;
    }

    public int numeroDeElementos() {
        return productos.size();
    }

    @Override
    public String toString() {
        String devolver = "Contenido del carrito\n=====================\n";
        for (int i = 0; i < productos.size(); i++) {
            devolver = devolver + productos.get(i).toString() + "\n";
        }
        return devolver;
    }

}
