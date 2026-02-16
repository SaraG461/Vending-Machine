package domain;

import java.util.ArrayList;
import java.util.List;

public class RootBeer extends Drinks{
    
     public static List<String> getAll() {
        List<String> lstAll = Drinks.getAll();
        
        List<String> RootBeerLst = new ArrayList();
        for (String elem : lstAll) {
           
            String[] split = elem.split("\\|");
            if ( split[1].equalsIgnoreCase("A&W Root Beer") ) {
                RootBeerLst.add(elem);
            }
        }
        return RootBeerLst;
    }
    
    public static void main(String[] args) {
       // System.out.println( new Coke().getAll() );
        RootBeer newDrinks = new RootBeer();
        newDrinks.setId(16);
        newDrinks.setName("A&W Root Beer");
        newDrinks.setQuantity("70");   
        newDrinks.setPrice("4.00");
        newDrinks.setSupplier("A&W Company");
        newDrinks.addNew();
        
    }
}