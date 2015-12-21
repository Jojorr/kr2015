import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * Created by vadim on 21.12.15.
 */
public class MainFrame extends JFrame {

    private QuestFrame FrameArea = new QuestFrame();
    private JPanel questPanel = new JPanel();
    private JPanel itemPanel = new JPanel();
    private JPanel surroundingPanel = new JPanel();
    private JButton jButton1 = new JButton();
    private JButton jButton2 = new JButton();
    private JButton jButton3 = new JButton();
    private JButton jButton4 = new JButton();
    private JButton jButton5 = new JButton();
    private ImagePanel imagePanel;
    public MainFrame() throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        imagePanel = new ImagePanel("39.jpg");
        questPanel.setLayout(new GridLayout(0,2));
        //this.add(imagePanel);//TODO Fix background picture
        //FrameArea
        questPanel.add(FrameArea);
        itemPanel.setLayout(new BorderLayout());
        JScrollPane TextScroll = new JScrollPane(FrameArea);
        TextScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        //
        questPanel.add(itemPanel);
        itemPanel.add(surroundingPanel,BorderLayout.NORTH);
        JScrollPane InventoryScroll = new JScrollPane(itemPanel);
        InventoryScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        questPanel.add(TextScroll);
        questPanel.add(InventoryScroll);
        add(questPanel);
        FrameArea.setText("Приветствую друг! Пока, что у меня нет внятного сюжета, поэтому давай приступим к делу.\n");
        FrameArea.append("Ты стоишь в пустоватой комнате, перед тобой стоит стол, так же ты видишь закрытую дверь, " +
                "что будешь делать?\n");
        surroundingPanel.add(jButton1);
        surroundingPanel.add(jButton2);
        itemPanel.add(jButton3);
        itemPanel.add(jButton4);
        itemPanel.add(jButton5);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        questPanel.setVisible(true);
        setVisible(true);
        this.setMinimumSize(new Dimension(400,400));
    }


    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        // Set cross-platform Java L&F (also called "Metal")

        MainFrame mainFrame = new MainFrame();
    }
}
