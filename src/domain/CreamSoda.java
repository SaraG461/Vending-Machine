package domain;

import java.util.ArrayList;
import java.util.List;

public class CreamSoda extends Drinks{
    
     public static List<String> getAll() {
        List<String> lstAll = Drinks.getAll();
        
        List<String> CreamSodaLst = new ArrayList();
        for (String elem : lstAll) {
           
            String[] split = elem.split("\\|");
            if ( split[1].equalsIgnoreCase("A&W") ) {
                CreamSodaLst.add(elem);
            }
        }
        return CreamSodaLst;
    }
    
    public static void main(String[] args) {
       // System.out.println( new Coke().getAll() );
        AlmondMilk newDrinks = new AlmondMilk();
        newDrinks.setId(5);
        newDrinks.setName("A&W Cream Soda");
        newDrinks.setQuantity("150");   
        newDrinks.setPrice("2.00");
        newDrinks.setSupplier("A&W Company");
        newDrinks.addNew();
        
    }
}