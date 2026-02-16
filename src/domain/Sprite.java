package domain;

import java.util.ArrayList;
import java.util.List;

public class Sprite extends Drinks{
    
     public static List<String> getAll() {
        List<String> lstAll = Drinks.getAll();
        
        List<String> SpriteLst = new ArrayList();
        for (String elem : lstAll) {
           
            String[] split = elem.split("\\|");
            if ( split[1].equalsIgnoreCase("Sprite") ) {
                SpriteLst.add(elem);
            }
        }
        return SpriteLst;
    }
    
    public static void main(String[] args) {
       // System.out.println( new Coke().getAll() );
        Sprite newDrinks = new Sprite();
        newDrinks.setId(17);
        newDrinks.setName("Sprite");
        newDrinks.setQuantity("100");   
        newDrinks.setPrice("2.00");
        newDrinks.setSupplier("Coca Company");
        newDrinks.addNew();
        
    }
}