package domain;

import java.util.ArrayList;
import java.util.List;

public class Monster extends Drinks{
    
     public static List<String> getAll() {
        List<String> lstAll = Drinks.getAll();
        
        List<String> MonsterLst = new ArrayList();
        for (String elem : lstAll) {
           
            String[] split = elem.split("\\|");
            if ( split[1].equalsIgnoreCase("Monster Energy Drink") ) {
                MonsterLst.add(elem);
            }
        }
        return MonsterLst;
    }
    
    public static void main(String[] args) {
       // System.out.println( new Coke().getAll() );
        Monster newDrinks = new Monster();
        newDrinks.setId(12);
        newDrinks.setName("Monster Energy Drink");
        newDrinks.setQuantity("20");   
        newDrinks.setPrice("3.00");
        newDrinks.setSupplier("Monster Company");
        newDrinks.addNew();
        
    }
}