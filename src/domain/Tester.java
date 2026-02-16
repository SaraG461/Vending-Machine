package domain;

import adapter.DrinksAdapter;
import java.util.List;

public class Tester {
    
    public static void main(String[] args) {
        
        List<Drinks> all = DrinksAdapter.getDrinks();
        System.out.println("Total of drinks: " + all.size());
        for (Drinks d : all) {
            System.out.println( d.getId() );
            System.out.println( d.getName() );
            System.out.println( d.getQuantity() );
            System.out.println( d.getPrice() );
            System.out.println( d.getSupplier() );
        }
        System.out.println("\n\n");
        
        List<Coca> allCoca = DrinksAdapter.getCoca();
        System.out.println("Total of Coca: " + allCoca.size());
        for (Coca d : allCoca) {
            System.out.println( d.getId() );
            System.out.println( d.getName() );
            System.out.println( d.getQuantity() );
            System.out.println( d.getPrice() );
            System.out.println( d.getSupplier() );
        }
    }
    
}

