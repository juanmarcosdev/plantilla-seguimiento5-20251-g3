package model;

import model.Articulo;
import model.Cliente;
import model.OrdenCompra;

public class Controladora {
    
    public Controladora() {

    }

    /**
     * Registra un nuevo articulo en el inventario.
     * @param 
     * @throws PrecioInvalidoException si el precio del articulo es negativo
     */
    public void registrarArticulo() throws PrecioInvalidoException {
        // TODO: implementar registro de articulo
    }

    /**
     * Busca un articulo por su identificador.
     * @param id identificador del articulo
     * @return el objeto articulo
     * @throws articuloNoEncontradoException si no existe un articulo con ese id
     */
    public articulo searchArticulo(String id) throws ArticuloNoEncontradoException {
        // TODO: implementar búsqueda de articulo
        return null;
    }

    /**
     * Descuenta el stock de un articulo según la cantidad comprada.
     * @param articulo el articulo a descontar
     * @param cantidad cantidad a descontar
     * @throws StockInsuficienteException si el stock es menor que la cantidad
     */
    public void descontarStock(Articulo articulo, int cantidad) throws StockInsuficienteException {
        // TODO: implementar descuento de stock
    }


}