
package arraylist;

import java.util.ArrayList;

public class Arraylist {


    public static void main(String[] args) {
   ArrayList<String> carro = new ArrayList<String>();
   
   carro.add("Volvo");
   carro.add("Mercedez");
   carro.add("BMW");
   carro.add("Chevrolet");
        

   
        System.out.println(carro.get(1));
        
        carro.remove(3);
        
        for (int i = 0; i < carro.size(); i++) {
            System.out.println(carro.get(i));
        }
           }
}
