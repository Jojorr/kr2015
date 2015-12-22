/**
 * Created by Вадим on 20.12.2015.
 */
public class Item {
    private String name;
    private String description;

    public Item(String name,String description){
        this.name = name;
        this.description = description;
    }
    public Item(String name){
        this.name = name;
    }

    public static Item combine(Item item1, Item item2){
        //TODO decide which is better: separate item classes, or item array and combine by name
        if((item1.getName().equals("Ножницы") && item2.getName().equals("Конверт")) &&
                (item2.getName().equals("Ножницы") && item1.getName().equals("Конверт")))return new Item("Ключ");
        //if (())
        else return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
