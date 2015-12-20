import java.util.ArrayList;

/**
 * Created by Вадим on 20.12.2015.
 */
public class Hero {
    private String name = "Cool dude";
    private ArrayList<Item> inventory = new ArrayList<Item>();

    public void pick(Item item){
        inventory.add(item);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }
}
