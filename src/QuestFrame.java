import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

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

    public QuestFrame() throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        setContentPane(panel1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        // Set cross-platform Java L&F (also called "Metal")

        QuestFrame questFrame = new QuestFrame();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        ArrayList<Frame> frame = new ArrayList<Frame>();

    }
}
