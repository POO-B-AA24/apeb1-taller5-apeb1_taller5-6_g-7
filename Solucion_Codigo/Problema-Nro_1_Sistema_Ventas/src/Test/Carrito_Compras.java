package Test;

import java.util.ArrayList;
import java.util.List;

public class Carrito_Compras {
    private List<Producto> productos;
    private List<Producto> tienda;

    public Carrito_Compras(List<Producto> tienda) {
        this.productos = new ArrayList<>();
        this.tienda = tienda;
    }

    public void agregarProducto(String nombre, int cantidad) {
        for (Producto producto : tienda) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                if (producto.getCantidad() >= cantidad) {
                    productos.add(new Producto(nombre, producto.getPrecio(), cantidad));
              
                    System.out.println("Producto '" + nombre + "' agregado al carrito.");
                    
                } else {
                    System.out.println("No hay suficiente cantidad del producto '" + nombre + "'.");
                }
                return;
            }
        }
        System.out.println("Producto '" + nombre + "' no encontrado en la tienda.");
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total;
    }

    public void realizarPago(double montoPagado, double descuento) {
        double totalCompra = calcularTotal();
        if (montoPagado > 1000) {
            totalCompra -= descuento;
        }
        if (montoPagado >= totalCompra) {
            actualizarInventario();
            System.out.println("Pago realizado con éxito. Total: $" + totalCompra + ". ¡Gracias por su compra!");
        } else {
            double faltante = totalCompra - montoPagado;
            System.out.println("Pago insuficiente. Faltan $" + faltante + " para completar la compra.");
        }
    }

    private void actualizarInventario() {
        for (Producto productoCarrito : productos) {
            for (Producto productoTienda : tienda) {
                if (productoCarrito.getNombre().equalsIgnoreCase(productoTienda.getNombre())) {
                    productoTienda.setCantidad(productoTienda.getCantidad() - productoCarrito.getCantidad());
                }
            }
        }
    }

    public void mostrarDetalleCompra() {
        if (productos.isEmpty()) {
            System.out.println("El carrito de compras está vacío.");
        } else {
            for (Producto producto : productos) {

                System.out.println("Producto: " + producto.getNombre() + " - Cantidad: " + producto.getCantidad() + " - Precio unitario: $" + producto.getPrecio());
                System.out.println("================================================================================");
            }
        }
    }
}

