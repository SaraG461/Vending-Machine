package domain;

import java.util.ArrayList;
import java.util.List;

public class AlmondMilk extends Drinks{
    
     public static List<String> getAll() {
        List<String> lstAll = Drinks.getAll();
        
        List<String> AlmondMilkLst = new ArrayList();
        for (String elem : lstAll) {
           
            String[] split = elem.split("\\|");
            if ( split[1].equalsIgnoreCase("Almond Milk") ) {
                AlmondMilkLst.add(elem);
            }
        }
        return AlmondMilkLst;
    }
    
    public static void main(String[] args) {
       // System.out.println( new Coke().getAll() );
        AlmondMilk newDrinks = new AlmondMilk();
        newDrinks.setId(1);
        newDrinks.setName("Silk Almond");
        newDrinks.setQuantity("200");   
        newDrinks.setPrice("4.00");
        newDrinks.setSupplier("Silk Company");
        newDrinks.addNew();
        
    }
}