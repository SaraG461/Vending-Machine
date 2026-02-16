package domain;

import java.util.ArrayList;
import java.util.List;

public class Chocolate extends Drinks{
    
     public static List<String> getAll() {
        List<String> lstAll = Drinks.getAll();
        
        List<String> ChocolateLst = new ArrayList();
        for (String elem : lstAll) {
           
            String[] split = elem.split("\\|");
            if ( split[1].equalsIgnoreCase("Chocolate Milk") ) {
                ChocolateLst.add(elem);
            }
        }
        return ChocolateLst;
    }
    
    public static void main(String[] args) {
       // System.out.println( new Coke().getAll() );
        Chocolate newDrinks = new Chocolate();
        newDrinks.setId(2);
        newDrinks.setName("Caburry Choco");
        newDrinks.setQuantity("200");   
        newDrinks.setPrice("2.00");
        newDrinks.setSupplier("Caburry Company");
        newDrinks.addNew();
        
    }
}