package domain;

import java.util.ArrayList;
import java.util.List;

public class Ginger extends Drinks{
    
     public static List<String> getAll() {
        List<String> lstAll = Drinks.getAll();
        
        List<String> GingerLst = new ArrayList();
        for (String elem : lstAll) {
           
            String[] split = elem.split("\\|");
            if ( split[1].equalsIgnoreCase("Ginger Tea") ) {
                GingerLst.add(elem);
            }
        }
        return GingerLst;
    }
    
    public static void main(String[] args) {
       // System.out.println( new Coke().getAll() );
        AlmondMilk newDrinks = new AlmondMilk();
        newDrinks.setId(8);
        newDrinks.setName("Yogi Tea");
        newDrinks.setQuantity("40");   
        newDrinks.setPrice("2.00");
        newDrinks.setSupplier("Yogi Company");
        newDrinks.addNew();
        
    }
}