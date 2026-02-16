package domain;

import java.util.ArrayList;
import java.util.List;

public class Pepsi extends Drinks{
    
     public static List<String> getAll() {
        List<String> lstAll = Drinks.getAll();
        
        List<String> PepsiLst = new ArrayList();
        for (String elem : lstAll) {
           
            String[] split = elem.split("\\|");
            if ( split[1].equalsIgnoreCase("Pepsi") ) {
                PepsiLst.add(elem);
            }
        }
        return PepsiLst;
    }
    
    public static void main(String[] args) {
       // System.out.println( new Coke().getAll() );
        Pepsi newDrinks = new Pepsi();
        newDrinks.setId(13);
        newDrinks.setName("Pepsi Berry");
        newDrinks.setQuantity("200");   
        newDrinks.setPrice("2.00");
        newDrinks.setSupplier("Coca Company");
        newDrinks.addNew();
        
    }
}