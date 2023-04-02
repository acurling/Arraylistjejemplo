
package arraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;


 

public class ClsVehiculo {

 
  private static ArrayList<String> Nplaca = new ArrayList<String>();
  private static ArrayList<String> Marca = new ArrayList<String>();
  private static ArrayList<Float> Precio = new ArrayList<Float>();
  public static String Marca_Vehiculo;
  public static float Precio_Vehiculo;
    
    public ClsVehiculo(){
     Nplaca.clear();
     Precio.clear();
     Marca.clear();
    }

    
    public static void BuscarPlaca(String nplaca){
    
     for (int i = 0; i < Nplaca.size(); i++) {
           if (nplaca.equals(Nplaca.get(i)))
           {
             Marca_Vehiculo = Marca.get(i);
             Precio_Vehiculo = Precio.get(i);
             break;
           }
        }
    }
    
    public static void getNplaca(String nplaca) {
       
      
    }

    public static void getMarca() {
         
    }

    public static void getPrecio() {
       
    }
    public static void setNplaca(String vplaca) {
      Nplaca.add(vplaca);
    }

    public static void setMarca(String vMarca) {
       Marca.add(vMarca);
    }
    
      public static void setPrecio(float vPrecio) {
       Precio.add(vPrecio);
    }
    
    
    
}
