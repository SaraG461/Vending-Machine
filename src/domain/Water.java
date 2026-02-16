package domain;

import java.util.ArrayList;
import java.util.List;

public class Water extends Drinks{
    
     public static List<String> getAll() {
        List<String> lstAll = Drinks.getAll();
        
        List<String> WaterLst = new ArrayList();
        for (String elem : lstAll) {
           
            String[] split = elem.split("\\|");
            if ( split[1].equalsIgnoreCase("Mineral Water") ) {
                WaterLst.add(elem);
            }
        }
        return WaterLst;
    }
    
    public static void main(String[] args) {
       // System.out.println( new Coke().getAll() );
        Water newDrinks = new Water();
        newDrinks.setId(19);
        newDrinks.setName("Fuji Water");
        newDrinks.setQuantity("100");   
        newDrinks.setPrice("1.00");
        newDrinks.setSupplier("Fuji Company");
        newDrinks.addNew();
        
    }
}