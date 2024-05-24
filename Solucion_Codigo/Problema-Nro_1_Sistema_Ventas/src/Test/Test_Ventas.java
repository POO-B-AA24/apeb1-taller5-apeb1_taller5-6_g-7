package Test;

import java.util.ArrayList;
import java.util.List;

public class Test_Ventas {
    public static void main(String[] args) {
        // Crear algunos productos para la tienda
        List<Producto> tienda = new ArrayList<>();
        tienda.add(new Producto("Laptop Gamer", 1200, 10));
        tienda.add(new Producto("Smartphone", 800, 15));
        tienda.add(new Producto("Auriculares", 150, 30));

        // Crear un carrito de compras
        Carrito_Compras carrito = new Carrito_Compras(tienda);

        // Agregar productos al carrito
        carrito.agregarProducto("Laptop", 1);
        carrito.agregarProducto("Smartphone", 2);

        // Mostrar detalle de la compra
        carrito.mostrarDetalleCompra();

        // Calcular total de la compra
        double total = carrito.calcularTotal();
        System.out.println("Total de la compra: $" + total);

        // Realizar pago
        carrito.realizarPago(3000, 100);

        // Mostrar detalle de la compra después del pago
        carrito.mostrarDetalleCompra();

        // Mostrar inventario actualizado
        System.out.println("\nInventario actualizado:");
        for (Producto producto : tienda) {
            System.out.println(producto);
        }
    }
}

