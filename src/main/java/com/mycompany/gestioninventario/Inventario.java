/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestioninventario;

import java.util.ArrayList;

/**
 *
 * @author Wilmer Salazar
 * 
 */

//Clase Inventario

public class Inventario {
    private ArrayList<Producto> productos;

    
    //Constructor que inicializa la lista
    
    public Inventario() {
    productos = new ArrayList<>();
    }
    
    //Metodo para agregar un producto al inventario
    
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    
    //Metodo auxiliar para buscar un producto en especifico
    
    public Producto obtenerProductoCodigo(String codigoProducto){
        //Se usa una each for loop
        for (Producto producto : productos) {
            //Con la condicion que si un codigo de producto es igual al dado, se retorne el producto encontrado
            if(producto.getCodigoProducto().equals(codigoProducto)){
                return producto;
            }
        }//De lo contrario retorna nulo
        return null;
    }
    
    //Metodo para obtener una lista de todos los productos
    
    public ArrayList<Producto> listarProductos(){
        return productos;
    }
    
    //Metodo para vender una cantidad de producto
    
    public void venderProducto(String codigoProducto, int cantidad){
        Producto producto = obtenerProductoCodigo(codigoProducto);
        if(producto == null){
            System.out.println("El producto con el codigo: " + codigoProducto +" no esta disponible");
        }else{
            producto.venderProducto(cantidad);
        }
    }
    
    //Metodo para consultar el stock disponible, retorna 0 si no existe, de lo contrario la cantidad
    
    public int consultarStock(String codigoProducto){
        Producto producto = obtenerProductoCodigo(codigoProducto);
        if(producto == null){
            return 0;
        }else{
            return producto.getCantidadStock();
        }
    }
    
    //Metodo para mostar los producots reservados
    
    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario ");
        } else {
            System.out.println("Productos en el inventario:");
            for (Producto producto : productos) {
                System.out.println("Nombre: " + producto.getNombre());
                System.out.println("Código: " + producto.getCodigoProducto());
                System.out.println("Precio: " + producto.getPrecio());
                System.out.println("Cantidad en stock: " + producto.getCantidadStock());
                System.out.println();
            }
        }
    }
    
    
    
    
    
}
