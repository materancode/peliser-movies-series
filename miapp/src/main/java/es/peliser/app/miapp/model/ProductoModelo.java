package es.peliser.app.miapp.model;

public class ProductoModelo {
    String codigo;
    String genero;

    /*Constructor con su codigo */

    public ProductoModelo(String codigo) {
        this.codigo = codigo;
    }

    /*Constructor con todos los elementos */

    public ProductoModelo(String codigo, String genero) {
        this.codigo = codigo;
        this.genero = genero;
    }

    /*Getters & Setters */
    public String getCodigo() {
        return this.codigo;
    }

    public String getGenero() {
        return this.genero;
    }
    
}
