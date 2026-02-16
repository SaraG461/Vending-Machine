package domain;

import java.util.ArrayList;
import java.util.List;

public class FantaGrape extends Drinks{
    
     public static List<String> getAll() {
        List<String> lstAll = Drinks.getAll();
        
        List<String> FantaGrapeLst = new ArrayList();
        for (String elem : lstAll) {
           
            String[] split = elem.split("\\|");
            if ( split[1].equalsIgnoreCase("Fanta Grape") ) {
                FantaGrapeLst.add(elem);
            }
        }
        return FantaGrapeLst;
    }
    
    public static void main(String[] args) {
       // System.out.println( new Coke().getAll() );
        FantaGrape newDrinks = new FantaGrape();
        newDrinks.setId(6);
        newDrinks.setName("Fanta Grape");
        newDrinks.setQuantity("70");   
        newDrinks.setPrice("2.00");
        newDrinks.setSupplier("Fanta Company");
        newDrinks.addNew();
        
    }
}
