/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.donajuana.controlador;

import java.util.ArrayList;
import java.util.List;
import mx.com.donajuana.dao.ProductoDAO;
import mx.com.donajuana.datos.Producto;

/**
 *
 * @author rodrigo
 */
public class Productos {

    public List<Producto> getProducto() {
        List<Producto> productos = new ArrayList<>();
        return productos;
    }

    public static void main(String[] args) {
        List<Producto> productos = new ProductoDAO().list();

        System.out.println("Numero de productos con existencia mayor a 20");
        Long total = productos.stream().filter(a -> {
                    return a.getExistencia() > 20;}).count();
        System.out.println("Productos con existencia mayor a 20"
                            + total);
        
        System.out.println("Numero de productos con existencia menor a 15");
        Long total2 = productos.stream().filter(a -> {
                    return a.getExistencia() < 15;}).count();
        System.out.println("Productos con existencia menor a 15"
                            + total2);
        
        System.out.println("Lista de productos con la misma clasificación "
                + "y precio mayor 15.50");
        
        
        
        System.out.println("Lista de productos con precio mayor a 20.30 "
                + "y menor a 45.00");
        productos.stream().filter(a -> {return a.getPrecio() > 20.30 && 
                a.getPrecio() < 45;}).forEach(a -> {System.out.println(a);});
    }
    
}