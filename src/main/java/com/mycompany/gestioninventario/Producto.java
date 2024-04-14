/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestioninventario;

/**
 *
 * @author Wilmer Salazar
 */

///Clase Producto

public class Producto {
    private String nombre;
    private String codigoProducto;
    private double precio;
    private int cantidadStock;
    
    //Constructor de la clase que iniciializa los atributos

    public Producto(String nombre, String codigoProducto, double precio, int cantidadStock) {
        this.nombre = nombre;
        this.codigoProducto = codigoProducto;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }
    
    //Metodos getters para acceder a los atributos 

    public String getNombre() {
        return nombre;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }
    
    //Metodo para vender una cantidad de producto
    
    public void venderProducto(int cantidad){
        //Con la condicion que si la cantidad vendida superara el stock, no se realize la accion
        if(cantidad > cantidadStock){
            System.out.println("No hay suficiente stock disponible");
        }else{
            cantidadStock -= cantidad;
            System.out.println("Venta registrada");
        }
        
    }
    
    //Metodo para agregar una cantidad de producto al stock
    
    public void agregarProducto(int cantidad){
        cantidadStock += cantidad;
    }
    
}
