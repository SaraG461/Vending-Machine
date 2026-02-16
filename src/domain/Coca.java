package domain;

import java.util.ArrayList;
import java.util.List;

public class Coca extends Drinks{
    
     public static List<String> getAll() {
        List<String> lstAll = Drinks.getAll();
        
        List<String> CocaLst = new ArrayList();
        for (String elem : lstAll) {
           
            String[] split = elem.split("\\|");
            if ( split[1].equalsIgnoreCase("Coca") ) {
                CocaLst.add(elem);
            }
        }
        return CocaLst;
    }
    
    public static void main(String[] args) {
       // System.out.println( new Coke().getAll() );
        Coca newDrinks = new Coca();
        newDrinks.setId(3);
        newDrinks.setName("Silver Coke");
        newDrinks.setQuantity("200");   
        newDrinks.setPrice("2.00");
        newDrinks.setSupplier("Coca Company");
        newDrinks.addNew();
        
    }
}
