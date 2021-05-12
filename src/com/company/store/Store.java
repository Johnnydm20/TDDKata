package com.company.store;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Store {
    private List<Productos> carrito =  new ArrayList<>();

    public void agregarProducto(String nombre, int valor) {
        carrito.add(new Productos(nombre, valor));
    }

    public int calcularCostoTotal() {
        int costo =0;
        for (Productos productos: carrito){
            costo += productos.getPrice();
        }
        return costo;
    }

    public void eliminarProducto(String nombre) {
        List<Productos> aux = new ArrayList<>();
        aux.addAll(carrito);

        for (Productos productos: carrito){
            if (productos.getNombre().equals(nombre)){
                carrito.remove(productos);
            }
        }
    }
}
