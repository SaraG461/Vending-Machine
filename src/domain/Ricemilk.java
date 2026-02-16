package domain;

import java.util.ArrayList;
import java.util.List;

public class Ricemilk extends Drinks{
    
     public static List<String> getAll() {
        List<String> lstAll = Drinks.getAll();
        
        List<String> RicemilkLst = new ArrayList();
        for (String elem : lstAll) {
           
            String[] split = elem.split("\\|");
            if ( split[1].equalsIgnoreCase("Koko Rice Milk") ) {
                RicemilkLst.add(elem);
            }
        }
        return RicemilkLst;
    }
    
    public static void main(String[] args) {
       // System.out.println( new Coke().getAll() );
        Ricemilk newDrinks = new Ricemilk();
        newDrinks.setId(15);
        newDrinks.setName("Koko Rice Milk");
        newDrinks.setQuantity("50");   
        newDrinks.setPrice("3.00");
        newDrinks.setSupplier("Koko Company");
        newDrinks.addNew();
        
    }
}