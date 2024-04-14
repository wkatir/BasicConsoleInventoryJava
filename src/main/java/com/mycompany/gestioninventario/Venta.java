/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestioninventario;

/**
 *
 * @author Wilmer Salazar
 */

//Clase venta auxiliar :D

public class Venta {
    private Producto producto;
    private int cantidad;
    private double precio;
    
    //Constructor que inicializa los atributos

    public Venta(Producto producto, int cantidad, double precio) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    //Metodos getters para acceder a los atributos

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }
    
}
