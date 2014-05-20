/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;


import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author rony
 */
public class Coloca_imagen extends JPanel{
 
    /*  variables para trabajar con el panel  /**/
  private Image imagen; // puntero para manejar la imagen del carro que va contener
  private int x=10;
  private int y=20;
  private int ancho=75;
  private int alto=40;
  public  ImageIcon carretera = new ImageIcon("Imagenes/carretera.png"); // imagen predeterminada de la carretera
  
   public Coloca_imagen(){
      
     
                    }
   
   
 /************* esta funcion es para colocar la imagen en el panel *****************/  
 public void pone_imagen(Image imagen) {
        if (imagen != null) {
            this.imagen = imagen;
        } else {
            this.imagen = null;
        }
        repaint();
    }
    
   
 /********************funcion para  poner posicion **********************************/
    public void pone_posicion(int x){
    this.x = x;
    }

    public void pone_tamaño(int ancho,int alto){
      this.alto = alto;
      this.ancho=ancho;
    }
    
  /**********funcion de graphis que se activa cada ves que un valor cambia**********/  
    @Override
    public void paint(Graphics g) {
         g.drawImage(carretera.getImage(),5,5,1200,80,this); //agrego la imagen de la carretera
         g.drawImage(imagen,x,y,ancho,alto,this); // agrego la imagen del carro
         setOpaque(false);
         super.paint(g); // pinto 

       
    }
}
