import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


/**
 * Created by vadim on 21.12.15.
 */
public class MainFrame extends JFrame {
    private ArrayList<Item> items = new ArrayList<Item>();
    private ArrayList<Integer> choices = new ArrayList<Integer>();
    JTextArea FrameArea = new JTextArea();
    JPanel questPanel = new JPanel();
    ItemPanel itemPanel = new ItemPanel();
    ImagePanel imagePanel = new ImagePanel("retro_fon.png");
    JButton choice1 = new JButton();
    JButton choice2 = new JButton();
    JButton choice3 = new JButton();
    public MainFrame() {
        questPanel.setLayout(new GridLayout(0,2));
        //this.add(imagePanel);//TODO Fix background picture

        questPanel.setOpaque(false);
        FrameArea.setLineWrap(true);
        FrameArea.setOpaque(true);
        FrameArea.setWrapStyleWord(true);
        FrameArea.setEditable(false);
        FrameArea.setMinimumSize( new Dimension(450,450));
        questPanel.add(FrameArea);
        itemPanel.setLayout(new BorderLayout());
        JScrollPane TextScroll = new JScrollPane(FrameArea);
        TextScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);


        questPanel.add(itemPanel);
        JScrollPane InventoryScroll = new JScrollPane(itemPanel);
        InventoryScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        questPanel.add(TextScroll);
        questPanel.add(InventoryScroll);
        add(questPanel);

        itemPanel.setLayout(new GridLayout(3,0));
        itemPanel.add(choice1);
        itemPanel.add(choice2);
        itemPanel.add(choice3);
        choice1.setText("Начать повествование");
        choice2.setVisible(false);
        choice3.setVisible(false);
        choice1.addActionListener(start);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        this.setMinimumSize(new Dimension(900,900));
    }


    ActionListener start = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            choice1.setText("Купим таблички с подсказками.");
            choice2.setText("Купим оружие, снаряжение, запасы");
            choice3.setText("Оставим деньги на иные цели");
            choice2.setVisible(true);
            choice3.setVisible(true);
            FrameArea.setText("Я был зол очень зол, то ли на себя, то ли на весь мир, уже не помню. В голове была каша. " +
                    "Но если решил, то надо делать. Тем более, когда так много болтаешь. Ну не умею я держать язык за зубами. Я остановился.\n" +
                    " Городская стена была уже давно позади, открыл узелок за спиной, проверил его содержимое." +
                    " Немного денег, припасы и одежда про запас.\n" +
                    " Уйдя из города, так и не ставшим мне родным, я отправился на поиски судьбы. Что именно я ищу? Сложно сказать," +
                    " что столь рьяно тащило меня вон из былой жизни.\n" +
                    " Мирской жених Иштар. Первый муж на всей тверди земной. Неплохо звучит. Слышал я про эту вавилонскую башню," +
                    " ещё с детских сказок нам рассказывали эту историю. \n" +
                    " Восход на башню, отгадка трёх таинств и союз с богиней. Верю ли я в эту чепуху? Вряд ли, но отвергать вовсе тоже не собираюсь.\n " +
                    " Ходят слухи, на всех рынках и алхимических цехах можно купить таблички с подсказками, однако я был совсем безоружен." +
                    " Но денег мне хватит только на что-то одно…\n");
            choice1.removeActionListener(start);
            choice1.addActionListener(S1A1);
            choice2.addActionListener(S1A2);
            choice3.addActionListener(S1A3);
        }
    };
    ActionListener S1A1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            choice1.setText("Купить самое дешевое и узнать информацию.");
            choice2.setText("Отказаться.");
            choice3.setVisible(false);
            FrameArea.setText("Я решил зайти в первый же крупный город. Расслабиться, послушать что говорят.\n" +
                    " Зайдя в кабак, я спросил хозяина о последних слухах в округе. \n" +
                    " От него я узнал что город кишит такими лазутчиками вроде меня, и что он с удовольствием выставит меня вон," +
                    " если я ничего не закажу.  \n");
            choices.add(1);
            choice1.removeActionListener(S1A1);
            choice2.removeActionListener(S1A2);
            choice3.removeActionListener(S1A3);
            choice1.addActionListener(S2A1);
            choice2.addActionListener(S2A2);
        }
    };
    ActionListener S1A2 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            choice1.setText("Купить самое дешевое и узнать информацию.");
            choice2.setText("Отказаться.");
            choice3.setVisible(false);
            FrameArea.setText("Я решил зайти в первый же крупный город. Расслабиться, послушать что говорят.\n" +
                    " Зайдя в кабак, я спросил хозяина о последних слухах в округе. \n" +
                    " От него я узнал что город кишит такими лазутчиками вроде меня, и что он с удовольствием выставит меня вон," +
                    " если я ничего не закажу.  \n");
            choices.add(2);
            choice1.removeActionListener(S1A1);
            choice2.removeActionListener(S1A2);
            choice3.removeActionListener(S1A3);
            choice1.addActionListener(S2A1);
            choice2.addActionListener(S2A2);
        }
    };
    ActionListener S1A3 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            choice1.setText("Купить самое дешевое и узнать информацию.");
            choice2.setText("Отказаться.");
            choice3.setVisible(false);
            FrameArea.setText("Я решил зайти в первый же крупный город. Расслабиться, послушать что говорят.\n" +
                    " Зайдя в кабак, я спросил хозяина о последних слухах в округе. \n" +
                    " От него я узнал что город кишит такими лазутчиками вроде меня, и что он с удовольствием выставит меня вон," +
                    " если я ничего не закажу.  \n");
            choices.add(3);
            choice1.removeActionListener(S1A1);
            choice2.removeActionListener(S1A2);
            choice3.removeActionListener(S1A3);
            choice1.addActionListener(S2A1);
            choice2.addActionListener(S2A2);
        }
    };
    ActionListener S2A1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

           FrameArea.setText("Пришлось согласиться на самую дешевую брагу от которой я быстро осоловел. Разговор пошёл лучше.\n" +
                   " По словам бармена в окрестностях буйствовала банда язычников сектантов, от их рук постоянно появляются новые жертвы.\n");
            choices.add(1);
        }
    };
    ActionListener S2A2 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            choice1.setText("");
            FrameArea.setText("я побродил меж столиков выпрашивая информацию. Но так ничего ценного и не узнал");
            choices.add(2);
            choice1.removeActionListener(S2A1);
            choice2.removeActionListener(S2A2);
        }
    };
    ActionListener S3A1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(choices.get(1) == 1){
                FrameArea.setText("Я был достаточно весел и пьян поэтому решил остаться до утра, пьяный – я не боец. \n" +
                        "   Совершенно незаметно ко мне подсел щуплого вида парнишка, чуть младше меня. \n" +
                        "  -Ты тоже, её ищешь?\n" +
                        " -Кого ? – с наглым видом ответил я.\n" +
                        "  -Башню! Я знаю. Я тоже её ищу. Может…? – он не договорил. – В двоё легче будет.\n" +
                        " И тут я задумался\n");
            }else{
                FrameArea.setText("Я был достаточно уставшим и растерянным, поэтому решил остаться до утра \n" +
                        "   Совершенно незаметно ко мне подсел щуплого вида парнишка, чуть младше меня. \n" +
                        "  -Ты тоже, её ищешь?\n" +
                        " -Кого ? – с наглым видом ответил я.\n" +
                        "  -Башню! Я знаю. Я тоже её ищу. Может…? – он не договорил. – В двоё легче будет.\n" +
                        " И тут я задумался\n");
            }

        }
    };
    ActionListener S3A2 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(choices.get(1) == 1){
                FrameArea.setText("Я был достаточно весел и пьян поэтому решил остаться до утра, пьяный – я не боец. \n" +
                        "   Совершенно незаметно ко мне подсел щуплого вида парнишка, чуть младше меня. \n" +
                        "  -Ты тоже, её ищешь?\n" +
                        " -Кого ? – с наглым видом ответил я.\n" +
                        "  -Башню! Я знаю. Я тоже её ищу. Может…? – он не договорил. – В двоё легче будет.\n" +
                        " И тут я задумался\n");

            }else{
                FrameArea.setText("Я был достаточно уставшим и растерянным, поэтому решил остаться до утра \n" +
                        "   Совершенно незаметно ко мне подсел щуплого вида парнишка, чуть младше меня. \n" +
                        "  -Ты тоже, её ищешь?\n" +
                        " -Кого ? – с наглым видом ответил я.\n" +
                        "  -Башню! Я знаю. Я тоже её ищу. Может…? – он не договорил. – В двоё легче будет.\n" +
                        " И тут я задумался\n");
            }

        }
    }; ActionListener S3A3 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(choices.get(1) == 1){
                FrameArea.setText("Я был достаточно весел и пьян поэтому решил остаться до утра, пьяный – я не боец. \n" +
                        "   Совершенно незаметно ко мне подсел щуплого вида парнишка, чуть младше меня. \n" +
                        "  -Ты тоже, её ищешь?\n" +
                        " -Кого ? – с наглым видом ответил я.\n" +
                        "  -Башню! Я знаю. Я тоже её ищу. Может…? – он не договорил. – В двоё легче будет.\n" +
                        " И тут я задумался\n");

            }else{
                FrameArea.setText("Я был достаточно уставшим и растерянным, поэтому решил остаться до утра \n" +
                        "   Совершенно незаметно ко мне подсел щуплого вида парнишка, чуть младше меня. \n" +
                        "  -Ты тоже, её ищешь?\n" +
                        " -Кого ? – с наглым видом ответил я.\n" +
                        "  -Башню! Я знаю. Я тоже её ищу. Может…? – он не договорил. – В двоё легче будет.\n" +
                        " И тут я задумался\n");
            }
        }
    };
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        // Set cross-platform Java L&F (also called "Metal")

        MainFrame mainFrame = new MainFrame();
    }
}
