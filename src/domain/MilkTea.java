package domain;

import java.util.ArrayList;
import java.util.List;

public class MilkTea extends Drinks{
    
     public static List<String> getAll() {
        List<String> lstAll = Drinks.getAll();
        
        List<String> MilkTeaLst = new ArrayList();
        for (String elem : lstAll) {
           
            String[] split = elem.split("\\|");
            if ( split[1].equalsIgnoreCase(" Milk Tea") ) {
                MilkTeaLst.add(elem);
            }
        }
        return MilkTeaLst;
    }
    
    public static void main(String[] args) {
       // System.out.println( new Coke().getAll() );
        MilkTea newDrinks = new MilkTea();
        newDrinks.setId(11);
        newDrinks.setName("Pokka Milk Tea");
        newDrinks.setQuantity("50");   
        newDrinks.setPrice("3.00");
        newDrinks.setSupplier("Pokka Company");
        newDrinks.addNew();
        
    }
}