package domain;

import java.util.ArrayList;
import java.util.List;

public class Lemond extends Drinks{
    
     public static List<String> getAll() {
        List<String> lstAll = Drinks.getAll();
        
        List<String> LemondLst = new ArrayList();
        for (String elem : lstAll) {
           
            String[] split = elem.split("\\|");
            if ( split[1].equalsIgnoreCase("Lemond Tea") ) {
                LemondLst.add(elem);
            }
        }
        return LemondLst;
    }
    
    public static void main(String[] args) {
       // System.out.println( new Coke().getAll() );
        Lemond newDrinks = new Lemond();
        newDrinks.setId(9);
        newDrinks.setName("Seasons Lemond Tea");
        newDrinks.setQuantity("90");   
        newDrinks.setPrice("3.00");
        newDrinks.setSupplier("Seasons Company");
        newDrinks.addNew();
        
    }
}