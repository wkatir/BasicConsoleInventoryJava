# Gestión de Inventario en Java

## Descripción

Este es un proyecto de desarrollo de un sistema de gestión de inventario en Java con un enfoque en el diseño de un código desacoplado y mantenible.

## Solución Propuesta

### Clase Producto

- Atributos:
  - nombre
  - código de producto
  - precio
  - cantidad en stock
- Métodos:
  - Getters y setters para acceder y modificar los atributos.
  - `venderProducto(cantidad)`: Reduce la cantidad en stock en la cantidad indicada.
  - `agregarProducto(cantidad)`: Aumenta la cantidad en stock en la cantidad indicada.

### Clase Inventario

- Atributo:
  - `Lista productos`
- Métodos:
  - `agregarProducto(producto)`: Agrega un nuevo producto a la lista de productos.
  - `venderProducto(codigoProducto, cantidad)`: Llama al método `venderProducto()` del producto con el código de producto especificado y la cantidad a vender.
  - `consultarStockProducto(codigoProducto)`: Devuelve la cantidad en stock del producto con el código de producto especificado.

### Clase Ventas

- Atributos:
  - `Lista ventas`
- Métodos:
  - `registrarVenta(producto, cantidad, precio)`: Crea una nueva instancia de `Venta` con los datos proporcionados y la agrega a la lista de ventas.
  - `generarInformeVentas()`: Genera un informe de todas las ventas registradas, mostrando detalles como el producto vendido, cantidad, precio y total.

### Clase Principal (Main)

- Contiene el método `main()` que crea instancias de `Inventario` y `Ventas`, y permite al usuario interactuar con el sistema de gestión de inventario a través de un menú de opciones.

## Decisiones de Diseño

1. **Bajo acoplamiento**: Las clases `Producto`, `Inventario` y `Ventas` están diseñadas de manera desacoplada, donde cada una tiene responsabilidades y métodos. Esto permite una mayor flexibilidad y mantenibilidad del código, ya que los cambios en una clase no afectan necesariamente a las otras.

2. **Encapsulamiento**: Los atributos de las clases están marcados como privados, y se accede a ellos a través de métodos públicos (getters y setters). Esto protege la integridad de los datos y evita el acceso directo desde otras clases.

3. **Interfaz de usuario**: La clase `Main` se encarga de proporcionar una interfaz de usuario clara y amigable, utilizando un menú de opciones para que el usuario pueda interactuar fácilmente con el sistema de gestión de inventario.

Este diseño cumple con los requisitos planteados y permite una mayor flexibilidad y mantenibilidad del código.
