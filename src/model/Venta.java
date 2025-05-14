package model;

public class Venta {

    private Cliente cliente;
    private Articulo articulo;
    private int cantidad;

    public Venta(Cliente cliente, Articulo articulo, int cantidad) {
        this.cliente = cliente;
        this.articulo = articulo;
        this.cantidad = cantidad;
    }

    public Venta() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Venta{" +
               "cliente=" + cliente +
               ", articulo=" + articulo +
               ", cantidad=" + cantidad +
               '}';
    }
}