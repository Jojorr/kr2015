import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import javafx.animation.*;

/**
 * Created by vadim on 20.12.15.
 */
public class QuestFrame extends JFrame {
    private JTextArea FrameArea;
    private JPanel panel1;
    private JList Inventory;
    private JTextField textField1;
    private JButton button1;
    private JScrollBar scrollBar1;
    private JScrollBar scrollBar2;
    private ImagePanel imagePanel;
    public QuestFrame()  {
        imagePanel = new ImagePanel("F:\\Laby(Java)\\TextQuest\\retro_fon.png");
        setContentPane(panel1);
        //panel1.add(imagePanel);
        FrameArea.setOpaque(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        // Set cross-platform Java L&F (also called "Metal")

        QuestFrame questFrame = new QuestFrame();
    }

}
