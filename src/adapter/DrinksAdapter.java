package adapter;

import domain.AlmondMilk;
import domain.Chocolate;
import domain.Drinks;
import domain.Coca;
import domain.Coffee;
import domain.CreamSoda;
import domain.FantaGrape;
import domain.FantaOrange;
import domain.Ginger;
import domain.Lemond;
import domain.Milk;
import domain.MilkTea;
import domain.Monster;
import domain.Pepsi;
import domain.RedBull;
import domain.Ricemilk;
import domain.RootBeer;
import domain.Sprite;
import domain.Strawberry;
import domain.Water;
import domain.Yogurt;
import java.util.ArrayList;
import java.util.List;

public class DrinksAdapter {
    
    public static List<Drinks> getDrinks(){
        List<String> drks = Drinks.getAll();
        
        //temp collection
        List<Drinks> temp = new ArrayList();
        
        for (String line : drks) {
            String[] split = line.split("\\|");
            Drinks newDrinks = new Drinks();
            newDrinks.setId( Integer.parseInt(split[0]) );
            newDrinks.setName( split[1] ); 
            newDrinks.setQuantity( split[2] );
            newDrinks.setPrice( split[3] );
            newDrinks.setSupplier( split[4] );
            temp.add(newDrinks);
        }
        return temp;
    }
    
    public static List<Coca> getCoca(){
        List<String> drks = Coca.getAll();
        
        //temp collection
        List<Coca> temp = new ArrayList();
        
        for (String line : drks) {
            String[] split = line.split("\\|");
            Coca newCoca = new Coca();
            newCoca.setId( Integer.parseInt(split[0]) );
            newCoca.setName( split[1] );
            newCoca.setQuantity( split[2] );
            newCoca.setPrice( split[3] );
            newCoca.setSupplier( split[4] );
            temp.add(newCoca);
        }
        return temp;
    }
    
    public static List<Pepsi> getPepsi(){
        List<String> drks = Pepsi.getAll();
        
        //temp collection
        List<Pepsi> temp = new ArrayList();
        
        for (String line : drks) {
            String[] split = line.split("\\|");
            Pepsi newPepsi = new Pepsi();
            newPepsi.setId( Integer.parseInt(split[0]) );
            newPepsi.setName( split[1] );
            newPepsi.setQuantity( split[2] );
            newPepsi.setPrice( split[3] );
            newPepsi.setSupplier( split[4] );
            temp.add(newPepsi);
        }
        return temp;
    }
    
    public static List<AlmondMilk> getAlmondMilk(){
        List<String> drks = AlmondMilk.getAll();
        
        //temp collection
        List<AlmondMilk> temp = new ArrayList();
        
        for (String line : drks) {
            String[] split = line.split("\\|");
            AlmondMilk newAlmondMilk = new AlmondMilk();
            newAlmondMilk.setId( Integer.parseInt(split[0]) );
            newAlmondMilk.setName( split[1] );
            newAlmondMilk.setQuantity( split[2] );
            newAlmondMilk.setPrice( split[3] );
            newAlmondMilk.setSupplier( split[4] );
            temp.add(newAlmondMilk);
        }
        return temp;
    }
        
    public static List<Chocolate> getChocolate(){
        List<String> drks = Chocolate.getAll();
        
        //temp collection
        List<Chocolate> temp = new ArrayList();
        
        for (String line : drks) {
            String[] split = line.split("\\|");
            Chocolate newChocolate = new Chocolate();
            newChocolate.setId( Integer.parseInt(split[0]) );
            newChocolate.setName( split[1] );
            newChocolate.setQuantity( split[2] );
            newChocolate.setPrice( split[3] );
            newChocolate.setSupplier( split[4] );
            temp.add(newChocolate);
        }
        return temp;
    }
                
    public static List<Sprite> getSprite(){
        List<String> drks = Sprite.getAll();
        
        //temp collection
        List<Sprite> temp = new ArrayList();
        
        for (String line : drks) {
            String[] split = line.split("\\|");
            Sprite newSprite = new Sprite();
            newSprite.setId( Integer.parseInt(split[0]) );
            newSprite.setName( split[1] );
            newSprite.setQuantity( split[2] );
            newSprite.setPrice( split[3] );
            newSprite.setSupplier( split[4] );
            temp.add(newSprite);
        }
        return temp;
    }
                
    public static List<Coffee> getCoffee(){
        List<String> drks = Coffee.getAll();
        
        //temp collection
        List<Coffee> temp = new ArrayList();
        
        for (String line : drks) {
            String[] split = line.split("\\|");
            Coffee newCoffee = new Coffee();
            newCoffee.setId( Integer.parseInt(split[0]) );
            newCoffee.setName( split[1] );
            newCoffee.setQuantity( split[2] );
            newCoffee.setPrice( split[3] );
            newCoffee.setSupplier( split[4] );
            temp.add(newCoffee);
        }
        return temp;
    }
    
    public static List<CreamSoda> getCincau(){
        List<String> drks = CreamSoda.getAll();
        
        //temp collection
        List<CreamSoda> temp = new ArrayList();
        
        for (String line : drks) {
            String[] split = line.split("\\|");
            CreamSoda newCreamSoda = new CreamSoda();
            newCreamSoda.setId( Integer.parseInt(split[0]) );
            newCreamSoda.setName( split[1] );
            newCreamSoda.setQuantity( split[2] );
            newCreamSoda.setPrice( split[3] );
            newCreamSoda.setSupplier( split[4] );
            temp.add(newCreamSoda);
        }
        return temp;
    }
    
    public static List<FantaOrange> getFantaOrange(){
        List<String> drks = FantaOrange.getAll();
        
        //temp collection
        List<FantaOrange> temp = new ArrayList();
        
        for (String line : drks) {
            String[] split = line.split("\\|");
            FantaOrange newFantaOrange = new FantaOrange();
            newFantaOrange.setId( Integer.parseInt(split[0]) );
            newFantaOrange.setName( split[1] );
            newFantaOrange.setQuantity( split[2] );
            newFantaOrange.setPrice( split[3] );
            newFantaOrange.setSupplier( split[4] );
            temp.add(newFantaOrange);
        }
        return temp;
    }
    
    public static List<FantaGrape> getFantaGrape(){
        List<String> drks = FantaGrape.getAll();
        
        //temp collection
        List<FantaGrape> temp = new ArrayList();
        
        for (String line : drks) {
            String[] split = line.split("\\|");
            FantaGrape newFantaGrape = new FantaGrape();
            newFantaGrape.setId( Integer.parseInt(split[0]) );
            newFantaGrape.setName( split[1] );
            newFantaGrape.setQuantity( split[2] );
            newFantaGrape.setPrice( split[3] );
            newFantaGrape.setSupplier( split[4] );
            temp.add(newFantaGrape);
        }
        return temp;
    }
    
    public static List<Ginger> getGinger(){
        List<String> drks = Ginger.getAll();
        
        //temp collection
        List<Ginger> temp = new ArrayList();
        
        for (String line : drks) {
            String[] split = line.split("\\|");
            Ginger newGinger = new Ginger();
            newGinger.setId( Integer.parseInt(split[0]) );
            newGinger.setName( split[1] );
            newGinger.setQuantity( split[2] );
            newGinger.setPrice( split[3] );
            newGinger.setSupplier( split[4] );
            temp.add(newGinger);
        }
        return temp;
    }
    
    public static List<Lemond> getLemond(){
        List<String> drks = Lemond.getAll();
        
        //temp collection
        List<Lemond> temp = new ArrayList();
        
        for (String line : drks) {
            String[] split = line.split("\\|");
            Lemond newLemond = new Lemond();
            newLemond.setId( Integer.parseInt(split[0]) );
            newLemond.setName( split[1] );
            newLemond.setQuantity( split[2] );
            newLemond.setPrice( split[3] );
            newLemond.setSupplier( split[4] );
            temp.add(newLemond);
        }
        return temp;
    }
    
    public static List<Milk> getMilk(){
        List<String> drks = Milk.getAll();
        
        //temp collection
        List<Milk> temp = new ArrayList();
        
        for (String line : drks) {
            String[] split = line.split("\\|");
            Milk newMilk = new Milk();
            newMilk.setId( Integer.parseInt(split[0]) );
            newMilk.setName( split[1] );
            newMilk.setQuantity( split[2] );
            newMilk.setPrice( split[3] );
            newMilk.setSupplier( split[4] );
            temp.add(newMilk);
        }
        return temp;
    }
    
    public static List<MilkTea> getMilkTea(){
        List<String> drks = MilkTea.getAll();
        
        //temp collection
        List<MilkTea> temp = new ArrayList();
        
        for (String line : drks) {
            String[] split = line.split("\\|");
            MilkTea newMilkTea = new MilkTea();
            newMilkTea.setId( Integer.parseInt(split[0]) );
            newMilkTea.setName( split[1] );
            newMilkTea.setQuantity( split[2] );
            newMilkTea.setPrice( split[3] );
            newMilkTea.setSupplier( split[4] );
            temp.add(newMilkTea);
        }
        return temp;
    }
    
    public static List<Monster> getMonster(){
        List<String> drks = Monster.getAll();
        
        //temp collection
        List<Monster> temp = new ArrayList();
        
        for (String line : drks) {
            String[] split = line.split("\\|");
            Monster newMonster = new Monster();
            newMonster.setId( Integer.parseInt(split[0]) );
            newMonster.setName( split[1] );
            newMonster.setQuantity( split[2] );
            newMonster.setPrice( split[3] );
            newMonster.setSupplier( split[4] );
            temp.add(newMonster);
        }
        return temp;
    }
    
    public static List<RedBull> getRedBull(){
        List<String> drks = RedBull.getAll();
        
        //temp collection
        List<RedBull> temp = new ArrayList();
        
        for (String line : drks) {
            String[] split = line.split("\\|");
            RedBull newRedBull = new RedBull();
            newRedBull.setId( Integer.parseInt(split[0]) );
            newRedBull.setName( split[1] );
            newRedBull.setQuantity( split[2] );
            newRedBull.setPrice( split[3] );
            newRedBull.setSupplier( split[4] );
            temp.add(newRedBull);
        }
        return temp;
    }
    
    public static List<Ricemilk> getRicemilk(){
        List<String> drks = Ricemilk.getAll();
        
        //temp collection
        List<Ricemilk> temp = new ArrayList();
        
        for (String line : drks) {
            String[] split = line.split("\\|");
            Ricemilk newRicemilk = new Ricemilk();
            newRicemilk.setId( Integer.parseInt(split[0]) );
            newRicemilk.setName( split[1] );
            newRicemilk.setQuantity( split[2] );
            newRicemilk.setPrice( split[3] );
            newRicemilk.setSupplier( split[4] );
            temp.add(newRicemilk);
        }
        return temp;
    }
    
    public static List<RootBeer> getRootBeer(){
        List<String> drks = RootBeer.getAll();
        
        //temp collection
        List<RootBeer> temp = new ArrayList();
        
        for (String line : drks) {
            String[] split = line.split("\\|");
            RootBeer newRootBeer = new RootBeer();
            newRootBeer.setId( Integer.parseInt(split[0]) );
            newRootBeer.setName( split[1] );
            newRootBeer.setQuantity( split[2] );
            newRootBeer.setPrice( split[3] );
            newRootBeer.setSupplier( split[4] );
            temp.add(newRootBeer);
        }
        return temp;
    }
    
    public static List<Strawberry> getStrawberry(){
        List<String> drks = Strawberry.getAll();
        
        //temp collection
        List<Strawberry> temp = new ArrayList();
        
        for (String line : drks) {
            String[] split = line.split("\\|");
            Strawberry newStrawberry = new Strawberry();
            newStrawberry.setId( Integer.parseInt(split[0]) );
            newStrawberry.setName( split[1] );
            newStrawberry.setQuantity( split[2] );
            newStrawberry.setPrice( split[3] );
            newStrawberry.setSupplier( split[4] );
            temp.add(newStrawberry);
        }
        return temp;
    }
    
    public static List<Water> getWater(){
        List<String> drks = Water.getAll();
        
        //temp collection
        List<Water> temp = new ArrayList();
        
        for (String line : drks) {
            String[] split = line.split("\\|");
            Water newWater = new Water();
            newWater.setId( Integer.parseInt(split[0]) );
            newWater.setName( split[1] );
            newWater.setQuantity( split[2] );
            newWater.setPrice( split[3] );
            newWater.setSupplier( split[4] );
            temp.add(newWater);
        }
        return temp;
    }
    
    public static List<Yogurt> getYogurt(){
        List<String> drks = Yogurt.getAll();
        
        //temp collection
        List<Yogurt> temp = new ArrayList();
        
        for (String line : drks) {
            String[] split = line.split("\\|");
            Yogurt newYogurt = new Yogurt();
            newYogurt.setId( Integer.parseInt(split[0]) );
            newYogurt.setName( split[1] );
            newYogurt.setQuantity( split[2] );
            newYogurt.setPrice( split[3] );
            newYogurt.setSupplier( split[4] );
            temp.add(newYogurt);
        }
        return temp;
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}