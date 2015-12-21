import java.util.ArrayList;

/**
 * Created by Вадим on 20.12.2015.
 */
public class QuestFrameData {
    private String text; //mb String[]
    private ArrayList<Item> items = new ArrayList<Item>();

    public void addItemToFrame(Item item){
        items.add(item);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
