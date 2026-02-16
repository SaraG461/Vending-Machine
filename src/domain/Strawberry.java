package domain;

import java.util.ArrayList;
import java.util.List;

public class Strawberry extends Drinks{
    
     public static List<String> getAll() {
        List<String> lstAll = Drinks.getAll();
        
        List<String> StrawberryLst = new ArrayList();
        for (String elem : lstAll) {
           
            String[] split = elem.split("\\|");
            if ( split[1].equalsIgnoreCase("Strawberry Milk") ) {
                StrawberryLst.add(elem);
            }
        }
        return StrawberryLst;
    }
    
    public static void main(String[] args) {
       // System.out.println( new Coke().getAll() );
        Strawberry newDrinks = new Strawberry();
        newDrinks.setId(18);
        newDrinks.setName("Cowhead Strawberry");
        newDrinks.setQuantity("90");   
        newDrinks.setPrice("3.00");
        newDrinks.setSupplier("Cowhead Company");
        newDrinks.addNew();
        
    }
}