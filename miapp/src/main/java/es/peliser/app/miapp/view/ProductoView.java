package es.peliser.app.miapp.view;
import java.util.Objects;

public class ProductoView {
    String codigo;
    String genero;

    /*Constructor */
    
    public ProductoView(String codigo, String genero) {
        this.codigo = codigo;
        this.genero = genero;
    }

    /*Getters & Setters */

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "{" +
            " codigo='" + codigo + "'" +
            ", genero='" + genero + "'" +
            "}";
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProductoView)) {
            return false;
        }
        ProductoView productoView = (ProductoView) o;
        return Objects.equals(codigo, productoView.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
    


}
