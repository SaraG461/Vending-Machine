package domain;

import java.util.ArrayList;
import java.util.List;

public class RedBull extends Drinks{
    
     public static List<String> getAll() {
        List<String> lstAll = Drinks.getAll();
        
        List<String> RedBullLst = new ArrayList();
        for (String elem : lstAll) {
           
            String[] split = elem.split("\\|");
            if ( split[1].equalsIgnoreCase("RedBull Energy Drink") ) {
                RedBullLst.add(elem);
            }
        }
        return RedBullLst;
    }
    
    public static void main(String[] args) {
       // System.out.println( new Coke().getAll() );
        RedBull newDrinks = new RedBull();
        newDrinks.setId(14);
        newDrinks.setName("Red Bull Energy Drink");
        newDrinks.setQuantity("100");   
        newDrinks.setPrice("3.00");
        newDrinks.setSupplier("ABC Company");
        newDrinks.addNew();
        
    }
}