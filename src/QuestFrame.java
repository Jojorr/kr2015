import javax.swing.*;

/**
 * Created by vadim on 21.12.15.
 */
public class QuestFrame extends JTextArea {
    private QuestFrameData questFrameData = new QuestFrameData();
    public QuestFrame()
    {
        this.setLineWrap(true);
        this.setOpaque(false);
        this.setWrapStyleWord(true);
        this.setEditable(false);
    }

}
