/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestioninventario;

import java.util.ArrayList;

/**
 *
 * @author Wilmer Salazar
 */

//Clase Ventas

public class Ventas {
    private ArrayList<Venta> ventas;
    
    //Constructo que inicializa la lista

    public Ventas() {
    ventas = new ArrayList<>();
    }
    
    //Metodo para registrar una nueva venta
    
    public void registrarVenta(Producto producto, int cantidad, double precio){
        Venta venta = new Venta(producto, cantidad, precio);
        ventas.add(venta);
    }
    
    //Metodo para generar un informe de ventas
    
    public void generarInforme(){
        System.out.println("\nInforme de Ventas: ");
        for (Venta venta : ventas) {
            System.out.println("Producto: " + venta.getProducto().getNombre());
            System.out.println("Cantidad: " + venta.getCantidad());
            System.out.println("Precio: " + venta.getPrecio());
            System.out.println("Total: " + (venta.getCantidad() * venta.getPrecio()));
            System.out.println();
        }
    }
    
}
