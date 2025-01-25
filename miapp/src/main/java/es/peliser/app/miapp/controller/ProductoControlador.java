package es.peliser.app.miapp.controller;

import es.peliser.app.miapp.model.ProductoFile;
import es.peliser.app.miapp.model.ProductoModelo;
import es.peliser.app.miapp.view.ProductoView;

public class ProductoControlador {

    ProductoFile productoFile;

    /*Inicializar clase */

    public ProductoControlador () {
        productoFile = new ProductoFile();
    }
    

    /*Metodo agregar */
    public boolean add(ProductoView productoView) {
        return false;
    }

    /*Metodo para obtener */
    public ProductoView getById(String codigo) {
        if (codigo == null || codigo.isEmpty()) {
            return null;
            
        }
        ProductoModelo productoBuscar = new ProductoModelo(codigo);
       productoBuscar = productoFile.getProducto(productoBuscar);
       ProductoView productoView = new ProductoView(productoBuscar.getCodigo(),productoBuscar.getGenero());
        return productoView;
    }
}
