/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestioninventario;

import java.util.Scanner;

/**
 *
 * @author Wilmer Salazar
 */
public class GestionInventario {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Ventas ventas = new Ventas();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        //Bucle do while 
        try{
        do{
            //Menu interactivo
            
            System.out.println("Sistema de Gestion de inventario");
            System.out.println("1. Agregar un producto");
            System.out.println("2. Vender un producto");
            System.out.println("3. Consultar stock");
            System.out.println("4. Informe de ventas");
            System.out.println("5. Mostrar productos");
            System.out.println("6. Agregar stocks a un producto ya existente");
            System.out.println("7. Salir");
            System.out.println("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            
            switch (opcion) {
            case 1:
                    System.out.println("Nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Codigo del producto: ");
                    String codigoProducto = scanner.nextLine();
                    System.out.println("Precio del producto: ");
                    double precio = scanner.nextDouble();
                    System.out.println("Cantidad en stock: ");
                    int cantidadStock = scanner.nextInt();
                    scanner.nextLine(); //Limpiar el buffer
                    if(precio > 0 && cantidadStock > 0){
                    Producto producto = new Producto(nombre, codigoProducto, precio, cantidadStock);
                    inventario.agregarProducto(producto);
                    System.out.println("Producto agregado");
                     }else{
                        System.out.println("Las cantidades y el dinero no puede ser negativo, no se puede almacenar ese producto ");
                        }
                    break;
                case 2:
                    System.out.println("Codigo del producto: ");
                    String codigoProducto2 = scanner.nextLine();
                    System.out.println("Cantidad a vender: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine(); //Limpiar el buffer
                    if(cantidad > 0){
                        int cantidadrevisar = inventario.consultarStock(codigoProducto2);
                    if(cantidad > cantidadrevisar){
                        System.out.println("No hay suficiente stock");
                    }else{
                     inventario.venderProducto(codigoProducto2, cantidad);
                    Producto producto2 = inventario.obtenerProductoCodigo(codigoProducto2);
                    ventas.registrarVenta(producto2, cantidad, producto2.getPrecio());
                    }
                    }else{
                        System.out.println("Ingrese una cantidad positiva");
                    }
                    
                    break;
                case 3:
                    System.out.println("Codigo del producto: ");
                    String codigoProducto3 = scanner.nextLine();
                    int stock = inventario.consultarStock(codigoProducto3);
                    System.out.println("Cantidad en stock: " + stock);
                    break;
                case 4:
                    ventas.generarInforme();
                    break;
                case 5:
                    inventario.mostrarProductos();
                    break;
                case 6:
                    System.out.println("Ingrese el codigo del producto: ");
                    String codigoProducto4 = scanner.nextLine();
                    System.out.println("Cantidad que incrementara: ");
                    int cantidadIncrementar = scanner.nextInt();
                    scanner.nextLine(); //Limpiar el buffer
                    if(cantidadIncrementar > 0){
                    inventario.incrementarStock(codigoProducto4, cantidadIncrementar);
                    }else{
                        System.out.println("No inserte cantidades negativas");
                    }
                    break;
                case 7:
                    System.out.println("Gracias por utilizar");
                default:
                    System.out.println("Eliga una opcion valida");
            }
            
        }while(opcion !=7);
    }catch(Exception e){
            System.out.println("Ingrese opciones validas");
}
}
}
