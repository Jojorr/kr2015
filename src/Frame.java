import java.util.ArrayList;

/**
 * Created by Вадим on 20.12.2015.
 */
public class Frame {
    private String text; //mb String[]
    private ArrayList<Item> items = new ArrayList<Item>();

    public void addItemToFrame(Item item){
        items.add(item);
    }

}
