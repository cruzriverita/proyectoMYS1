/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.LinkedList;

/**
 *
 * @author rony
 */
public class Datos_estaticos {
   
 /*****************Lambor Veneno Roadster******************************/
    
   
    public static final int L_peso = 1490;
    public static final int L_Velocidad_max = 355 ; //km/h
    public static final float L_aceleracion = (float) 2.9;//s
    public static final float L_aceleracion2 = (float) 6.38;//s
    public static final String L_imagen  = "Imagenes/carro_lambo.png";
    public static final String L_nombre = "Lambor Veneno Roadster";
    
    
   /*****************Mclaren Spider******************************/
    public static final int M_peso = 1468;
    public static final int M_Velocidad_max = 329 ; //km/h
    public static final float M_aceleracion = (float) 3; //s
    public static final float M_aceleracion2 = (float) 8.6;//s
    public static final String M_imagen  = "Imagenes/carro_mcla.png";
    public static final String M_nombre  = "Mclaren Spider";
    
    /*****************VW Volkswagen Scirocco R 2.0 TSI DSG 265 Cv******************************/
    public static final int Vw_peso = 1393;
    public static final int Vw_Velocidad_max = 250; //km/h
    public static final float Vw_aceleracion = (float) 5.8;//s
    public static final float Vw_aceleracion2 = (float) 12.76;//s
    public static final String Vw_imagen  = "Imagenes/carro_v2w.png";
    public static final String Vw_nombre  = "Volkswagen Scirocco R 2.0";
    
   /**************************Ford Mustang Shelby GT 500 2013 *********************/
    public static final int F_peso = 1750;
    public static final int F_Velocidad_max = 321 ; //km/h
    public static final float F_aceleracion = (float) 3.8;//s
    public static final float F_aceleracion2 = (float) 8.36;//s
    public static final String F_imagen  = "Imagenes/carro_gt.png";
    public static final String F_nombre  = "Mustang Shelby GT 500";
    
    
  /************************   lista para manejar la contidad de simulaciones********************/
    public static LinkedList<Nodo_simulacion> Lista_simulacion = new LinkedList<Nodo_simulacion>();
    
    
   /************************** variables para utilizar en la ventana de leeccion de carro****************/
    public static  int distancia=500;
    public static  int tipo_carro=0;
    
   
    
}
