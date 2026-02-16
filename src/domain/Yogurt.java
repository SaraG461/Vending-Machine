package domain;

import java.util.ArrayList;
import java.util.List;

public class Yogurt extends Drinks{
    
     public static List<String> getAll() {
        List<String> lstAll = Drinks.getAll();
        
        List<String> YogurtLst = new ArrayList();
        for (String elem : lstAll) {
           
            String[] split = elem.split("\\|");
            if ( split[1].equalsIgnoreCase("Yogurt") ) {
                YogurtLst.add(elem);
            }
        }
        return YogurtLst;
    }
    
    public static void main(String[] args) {
       // System.out.println( new Coke().getAll() );
        Yogurt newDrinks = new Yogurt();
        newDrinks.setId(20);
        newDrinks.setName("Sliss Yogurt");
        newDrinks.setQuantity("200");   
        newDrinks.setPrice("3.00");
        newDrinks.setSupplier("Sliss Company");
        newDrinks.addNew();
        
    }
}