package model;

public class Articulo {

    private String id;
    private String titulo;
    private double precio;
    private int stock;


    public Articulo(String id, String titulo, double precio, int stock) {
        this.id = id;
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
    }

    public Articulo() {
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Articulo{" +
               "id='" + id + '\'' +
               ", titulo='" + titulo + '\'' +
               ", precio=" + precio +
               ", stock=" + stock +
               '}';
    }
}