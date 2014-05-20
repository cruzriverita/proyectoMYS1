/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;



/**
 *
 * @author rony
 */
public class hilo_para_simulacion extends Thread {
    
    /*************datos para la simulacion ********************/
    JLabel datos;
    Coloca_imagen pista; // puntero para manejar el panel que funciona como la pista de la simulacion
    int pos_x = 10; // puntero para la posicion x. ya que solo se va a mover en horizontal
    
    
   /******************************* variables para la simulacion **********************************/ 
    int velocidad_max=0;
    float aceleracion;
    int distancia=0;
    int velocidad =0;
    int tiempo=0;
    String nombre;
    
    /***boleano para cuando llege a la distancia se termine el bucle************/
    boolean meta=false;
    
    /************* funcion ya se llama cuando se crea una instancia del hilo ***************************/
    public hilo_para_simulacion(Coloca_imagen pista,JLabel datos,String nombre,float aceleracion,int distancia,int velocidad_max){
    this.pista= pista;
    this.distancia = distancia;
    this.velocidad_max = (velocidad_max *1000)/3600;
    this.aceleracion = (200*1000)/(3600*aceleracion);
    this.datos=datos;
    this.nombre = nombre;
    }
    
    
    @Override
    public void run(){
             while(!meta){
                 
                 if(velocidad < velocidad_max){
                 velocidad =(int)(tiempo*aceleracion);
                 if(velocidad > velocidad_max){
                         velocidad = velocidad_max;
                         }
                 }
                // velocidad =(int)(tiempo*aceleracion);
                 pos_x= pos_x+velocidad;  /*suma dias a la posicion**/
                
                 //aceleracion += aceleracion; //hay que furmarse uba formala para ver como cambia
                 try {
                   
                 this.sleep(400); // duermo el hilo con la celeracion (creo que hay que ver como se hace que para queda iteracion dismunuya)
                 } catch (InterruptedException ex) {
                 Logger.getLogger(hilo_para_simulacion.class.getName()).log(Level.SEVERE, null, ex);
                 }
              if(pos_x >= distancia){
               tiempo+=1;
               int pos = (int)((pos_x*75)/100);
               pista.pone_posicion(pos); // pone la nueva posicion en x del carro.
               pista.repaint(); // repinto el panel pista para que se vea el cambio de posicion 
               pone_datos(nombre,pos_x-10,velocidad);
               meta = true;  //*** cuando llega a la distancia acordada rompo el ciclo para que no siga caminado
              }
              else{
               tiempo+=1;
               int pos = (int)(pos_x*0.75);
               pista.pone_posicion(pos); // pone la nueva posicion en x del carro.
               pista.repaint(); // repinto el panel pista para que se vea el cambio de posicion 
               pone_datos(nombre,pos_x-10,velocidad);
             }
    
             }
             detener_hilo(); // cuando termina rompe el hilo para .. para no dejarlo correr mas
              
    }
    
    private void pone_datos(String nombre,int distancia,float velocidad){
      datos.setText(nombre+"    Distancia: "+distancia +"mts    Velocidad:"+velocidad+ "m/s" );
      datos.repaint();
    }
    ///funcion para romper el hilo
    public void detener_hilo(){
     pista.pone_posicion(distancia); // pone al carro en el fin de la distancia
     pista.repaint(); // repinto el panel pista para que se vea el cambio de posicion 
     meta = true;
     this.stop();
    }
    
    //fucion para detener el hilo de la simulacion
    public void parar_hilo(){
    this.suspend();
    }
    
    public void reanudar_hilo(){
    this.resume();
    }
}
