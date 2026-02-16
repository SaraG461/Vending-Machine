package domain;

import java.util.ArrayList;
import java.util.List;

public class Milk extends Drinks{
    
     public static List<String> getAll() {
        List<String> lstAll = Drinks.getAll();
        
        List<String> MilkLst = new ArrayList();
        for (String elem : lstAll) {
           
            String[] split = elem.split("\\|");
            if ( split[1].equalsIgnoreCase("Milk") ) {
                MilkLst.add(elem);
            }
        }
        return MilkLst;
    }
    
    public static void main(String[] args) {
       // System.out.println( new Coke().getAll() );
        Milk newDrinks = new Milk();
        newDrinks.setId(10);
        newDrinks.setName("Cowhead Milk");
        newDrinks.setQuantity("150");   
        newDrinks.setPrice("3.00");
        newDrinks.setSupplier("Cowhead Company");
        newDrinks.addNew();
        
    }
}