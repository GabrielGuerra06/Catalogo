package catalogoN;

import javax.swing.ImageIcon;

/**
 *
 * @author Linki
 */
abstract class Info {
    static String emision = "cine";
    String titulo;
    String sinopsis;
    String genero;
    String plataforma;
    String reparto;
    String url;
 
    int calificacion;
    
    ImageIcon fotos;
    
    
   public void calificacion(int calificacion){
       calificacion = 0;
    }
}
