package domain;

import java.util.ArrayList;
import java.util.List;

public class Coffee extends Drinks{
    
     public static List<String> getAll() {
        List<String> lstAll = Drinks.getAll();
        
        List<String> CoffeeLst = new ArrayList();
        for (String elem : lstAll) {
           
            String[] split = elem.split("\\|");
            if ( split[1].equalsIgnoreCase("Nescafe") ) {
                CoffeeLst.add(elem);
            }
        }
        return CoffeeLst;
    }
    
    public static void main(String[] args) {
       // System.out.println( new Coke().getAll() );
        AlmondMilk newDrinks = new AlmondMilk();
        newDrinks.setId(4);
        newDrinks.setName("Nescafe Mocha");
        newDrinks.setQuantity("100");   
        newDrinks.setPrice("3.00");
        newDrinks.setSupplier("Nescafe Company");
        newDrinks.addNew();
        
    }
}