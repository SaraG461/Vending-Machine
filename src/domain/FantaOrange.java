package domain;

import java.util.ArrayList;
import java.util.List;

public class FantaOrange extends Drinks{
    
     public static List<String> getAll() {
        List<String> lstAll = Drinks.getAll();
        
        List<String> FantaOrangeLst = new ArrayList();
        for (String elem : lstAll) {
           
            String[] split = elem.split("\\|");
            if ( split[1].equalsIgnoreCase("Fanta Orange") ) {
                FantaOrangeLst.add(elem);
            }
        }
        return FantaOrangeLst;
    }
    
    public static void main(String[] args) {
       // System.out.println( new Coke().getAll() );
        FantaOrange newDrinks = new FantaOrange();
        newDrinks.setId(7);
        newDrinks.setName("Fanta Orange");
        newDrinks.setQuantity("80");   
        newDrinks.setPrice("2.00");
        newDrinks.setSupplier("Fanta Company");
        newDrinks.addNew();
        
    }
}