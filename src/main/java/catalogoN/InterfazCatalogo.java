package catalogoN;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Linki
 */
public interface InterfazCatalogo {
    public void calificacion(int calificacion);
    public void imagenes();
    public String emision();
    public String titulo(int i);
    public String sinopsis(int i);
    public String genero(int i);
    public String plataforma(int i);
    public String reparto(int i);
    public String url(int i);

}
