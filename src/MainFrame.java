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
        choice1.setMaximumSize(new Dimension(100,25));
        choice1.setPreferredSize(new Dimension(200,50));
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
            choice1.addActionListener(s1a1);
            choice2.addActionListener(s1a2);
            choice3.addActionListener(s1a3);
        }
    };

    ActionListener s1a1 = new ActionListener() {
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
            choice1.removeActionListener(s1a1);
            choice2.removeActionListener(s1a2);
            choice3.removeActionListener(s1a3);
            choice1.addActionListener(s2a1);
            choice2.addActionListener(s2a2);
        }
    };
    ActionListener s1a2 = new ActionListener() {
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
            choice1.removeActionListener(s1a1);
            choice2.removeActionListener(s1a2);
            choice3.removeActionListener(s1a3);
            choice1.addActionListener(s2a1);
            choice2.addActionListener(s2a2);
        }
    };
    ActionListener s1a3 = new ActionListener() {
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
            choice1.removeActionListener(s1a1);
            choice2.removeActionListener(s1a2);
            choice3.removeActionListener(s1a3);
            choice1.addActionListener(s2a1);
            choice2.addActionListener(s2a2);
        }
    };
    ActionListener s2a1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            choice1.setText("Сказать, о цели своих поисков.");
            choice2.setText("Соврать.");
            choice3.setText("Яростно, послать куда подальше.");
            FrameArea.setText("Пришлось согласиться на самую дешевую брагу от которой я быстро осоловел. Разговор пошёл лучше.\n" +
                   " По словам бармена в окрестностях буйствовала банда язычников сектантов, от их рук постоянно появляются новые жертвы.\n");
            FrameArea.append("Я был достаточно весел и пьян поэтому решил остаться до утра, пьяный – я не боец. \n" +
                    "   Совершенно незаметно ко мне подсел щуплого вида парнишка, чуть младше меня. \n" +
                    "  -Ты тоже, её ищешь?\n" +
                    " -Кого ? – с наглым видом ответил я.\n" +
                    "  -Башню! Я знаю. Я тоже её ищу. Может…? – он не договорил. – В двоё легче будет.\n" +
                    " И тут я задумался\n");
            choices.add(1);
            choice1.removeActionListener(s2a1);
            choice2.removeActionListener(s2a2);
            choice1.addActionListener(s3a1);
            choice2.addActionListener(s3a2);
            choice3.setVisible(true);
            choice3.addActionListener(s3a3);
        }
    };
    ActionListener s2a2 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            choice1.setText("Сказать, о цели своих поисков.");
            choice2.setText("Соврать.");
            choice3.setText("Яростно, послать куда подальше.");
            FrameArea.setText("я побродил меж столиков выпрашивая информацию. Но так ничего ценного и не узнал\n");
            FrameArea.append("Я был достаточно уставшим и растерянным, поэтому решил остаться до утра \n" +
                    "   Совершенно незаметно ко мне подсел щуплого вида парнишка, чуть младше меня. \n" +
                    "  -Ты тоже, её ищешь?\n" +
                    " -Кого ? – с наглым видом ответил я.\n" +
                    "  -Башню! Я знаю. Я тоже её ищу. Может…? – он не договорил. – В двоё легче будет.\n" +
                    " И тут я задумался\n");
            choices.add(2);
            choice1.removeActionListener(s2a1);
            choice2.removeActionListener(s2a2);
            choice1.addActionListener(s3a1);
            choice2.addActionListener(s3a2);
            choice3.setVisible(true);
            choice3.addActionListener(s3a3);
        }
    };
    ActionListener s3a1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            if(choices.get(1) == 1){
                FrameArea.setText("-Ну допустим, раскусил. – я икнул расплываясь в хмельной улыбке. – А тебе то что?\n" +
                        "      - Ну, я ж сказал, двоим легче будет и найти и пройти.\n" +
                        "      -А как награду будем делать, а умник?\n" +
                        "      -В принципе я готов отказаться от союза, и отдать это право тебе, а ты в свою очередь дашь мне мирские богатства. Ну? А может до конца дойдёт только один из нас?\n" +
                        "       -В принципе резонно, но это болтовня, чем докажешь?\n" +
                        "       Он достал маленький кортик и порезал руку:\n" +
                        "       -Клянусь союзом семи звёзд, в сказанном.\n" +
                        "       Ко как чиркнув по пальцу, я приложился к ладони,\n" +
                        "        -Клянусь союзом семи звёзд. Уже лучше. ");
            }else{
                FrameArea.setText("-Ну допустим, раскусил. – я икнул расплываясь в улыбке. – А тебе то что?\n" +
                        "      - Ну, я ж сказал, двоим легче будет и найти и пройти.\n" +
                        "      -А как награду будем делать, а умник?\n" +
                        "      -В принципе я готов отказаться от союза, и отдать это право тебе, а ты в свою очередь дашь мне мирские богатства. Ну? А может до конца дойдёт только один из нас?\n" +
                        "       -В принципе резонно, но это болтовня, чем докажешь?\n" +
                        "       Он достал маленький кортик и порезал руку:\n" +
                        "       -Клянусь союзом семи звёзд, в сказанном.\n" +
                        "       Ко как чиркнув по пальцу, я приложился к ладони,\n" +
                        "        -Клянусь союзом семи звёзд. Уже лучше. ");
            }
            if((choices.get(0) == 1) && (choices.get(1) == 1  )){
                FrameArea.append("Утро отозвалось звоном в голове. Тело болело. Я готов был плюнуть на цель своих поисков.\n" +
                        "Мы отправилсь вон из города. Где именно башня не было известно. " +
                        "С тех пор когда человечество её построило в Халдейском царстве начала творится всякая чертовщина:" +
                        " смешение языков, небесные кары, невиданные дары богов, всплывающие на стихийных рынках, райские плоды и пряности." +
                        " Смертоносные луки и мечи, плюющиеся огнем. Еще не один человек прошедший всё до конца не вернулся, " +
                        "а те, кто вернулись - не могли внятно рассказать, что было. \n" +
                        "Путь в халдейское царство лежал по Тунному тракту, опасной, но самой прямой дороги. ");
            }else if(choices.get(0) == 2 && choices.get(1) == 1){
                FrameArea.append("Я был бодр и готов ко всем препятствиям.\n" +
                        "Мы отправились вон из города. Где именно башня не было известно. " +
                        "С тех пор когда человечество её построило в Халдейском царстве начала творится всякая чертовщина:" +
                        " смешение языков, небесные кары, невиданные дары богов, всплывающие на стихийных рынках, райские плоды и пряности." +
                        " Смертоносные луки и мечи, плюющиеся огнем. Еще не один человек прошедший всё до конца не вернулся, " +
                        "а те, кто вернулись - не могли внятно рассказать, что было. \n" +
                        "Путь в халдейское царство лежал по Тунному тракту, опасной, но самой прямой дороги. ");
            }
            choice1.setText("Пойти по тракту.");
            choice2.setText("Пойти в обход.");
            choice3.setVisible(false);
            choice1.removeActionListener(s3a1);
            choice2.removeActionListener(s3a2);
            choice3.removeActionListener(s3a3);
            choice1.addActionListener(s5a1);
            choice2.addActionListener(s5a2);
            choices.add(1);
            choices.add(2);
        }
    };
    ActionListener s3a2 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            FrameArea.setText(" -Что? Что за бред ты несёшь? Какие ещё башни.\n" +
                        "       -Не ври я знаю, я тоже их ищу.\n" +
                        "        -Сумасшедший иди от сюда, я охрану позову.\n" +
                        "        -Даю последний шанс. Ты один, кидаешь вызов самому мирозданию, и отказываешься в помощи? ");
            choice1.setText("Настаивать на своём.");
            choice2.setText("Рассказать правду.");
            choice3.setVisible(false);
            choices.add(2);
            choice1.removeActionListener(s3a1);
            choice2.removeActionListener(s3a2);
            choice3.removeActionListener(s3a3);
            choice1.addActionListener(s4a1);
            choice2.addActionListener(s4a2);
            choice3.setVisible(false);
        }

    };
    ActionListener s3a3 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            FrameArea.setText(" -Что? Что за бред ты несёшь? Какие ещё башни.\n" +
                        "       -Не ври я знаю, я тоже их ищу.\n" +
                        "        -Сумасшедший иди от сюда, я охрану позову.\n" +
                        "        -Даю последний шанс. Ты один, кидаешь вызов самому мирозданию, и отказываешься от помощи?  ");
            choice1.setText("Настаивать на своём.");
            choice2.setText("Рассказать правду.");
            choice3.setVisible(false);
            choices.add(2);
            choice1.removeActionListener(s3a1);
            choice2.removeActionListener(s3a2);
            choice3.removeActionListener(s3a3);
            choice1.addActionListener(s4a1);
            choice2.addActionListener(s4a2);
            choice3.setVisible(false);
        }
    };
    ActionListener s4a1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            FrameArea.setText("-Да проваливай отсюда, окаянный!\n" +
                    "-Ну запомни, придёт война – попросишь хлеба!\n");

             if(choices.get(1) == 1 ){
                FrameArea.append("Утро отозвалось звоном в голове. Тело болело. Я готов был плюнуть на цель своих поисков.\n" +
                        "Я отправился вон из города. Где именно башня не было известно. " +
                        "С тех пор когда человечество её построило в Халдейском царстве начала творится всякая чертовщина:" +
                        " смешение языков, небесные кары, невиданные дары богов, всплывающие на стихийных рынках, райские плоды и пряности." +
                        " Смертоносные луки и мечи, плюющиеся огнем. Еще не один человек прошедший всё до конца не вернулся, " +
                        "а те, кто вернулись - не могли внятно рассказать, что было. \n" +
                        "Путь в халдейское царство лежал по Тунному тракту, опасной, но самой прямой дороги. ");
            }else if(choices.get(1) == 2 ){
                FrameArea.append("Я был бодр и готов ко всем препятствиям.\n" +
                        "Я отправился вон из города. Где именно башня не было известно. " +
                        "С тех пор когда человечество её построило в Халдейском царстве начала творится всякая чертовщина:" +
                        " смешение языков, небесные кары, невиданные дары богов, всплывающие на стихийных рынках, райские плоды и пряности." +
                        " Смертоносные луки и мечи, плюющиеся огнем. Еще не один человек прошедший всё до конца не вернулся, " +
                        "а те, кто вернулись - не могли внятно рассказать, что было. \n" +
                        "Путь в халдейское царство лежал по Тунному тракту, опасной, но самой прямой дороги. ");
            }
            choice1.setText("Пойти по тракту.");
            choice2.setText("Пойти в обход.");
            choice1.removeActionListener(s4a1);
            choice2.removeActionListener(s4a2);
            choice1.addActionListener(s5a1);
            choice2.addActionListener(s5a2);
            choices.add(1);
        }

    };
    ActionListener s4a2 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            FrameArea.setText(" -Ну допустим, раскусил. – я икнул расплываясь в хмельной улыбке. – А тебе то что?\n" +
                    "      - Ну, я ж сказал, двоим легче будет и найти и пройти.\n" +
                    "      -А как награду будем делать, а умник?\n" +
                    "      -В принципе я готов отказаться от союза, и отдать это право тебе, а ты в свою очередь дашь мне мирские богатства. Ну? А может до конца дойдёт только один из нас?\n" +
                    "       -В принципе резонно, но это болтовня, чем докажешь?\n" +
                    "       Он достал маленький кортик и порезал руку:\n" +
                    "       -Клянусь союзом семи звёзд, в сказанном.\n" +
                    "       Ко как чиркнув по пальцу, я приложился к ладони,\n" +
                    "        -Клянусь союзом семи звёзд. Уже лучше. \n ");
            if((choices.get(1) == 1) && (choices.get(2) == 1)){
                FrameArea.append("Утро отозвалось звоном в голове. Тело болело. Я готов был плюнуть на цель своих поисков.\n" +
                        "Мы отправилсь вон из города. Где именно башня не было известно. " +
                        "С тех пор когда человечество её построило в Халдейском царстве начала творится всякая чертовщина:" +
                        " смешение языков, небесные кары, невиданные дары богов, всплывающие на стихийных рынках, райские плоды и пряности." +
                        " Смертоносные луки и мечи, плюющиеся огнем. Еще не один человек прошедший всё до конца не вернулся, " +
                        "а те, кто вернулись - не могли внятно рассказать, что было. \n" +
                        "Путь в халдейское царство лежал по Тунному тракту, опасной, но самой прямой дороги. ");
            }else if(choices.get(1) == 2 && choices.get(2) == 1){
                FrameArea.append("Я был бодр и готов ко всем препятствиям.\n" +
                        "Мы отправились вон из города. Где именно башня не было известно. " +
                        "С тех пор когда человечество её построило в Халдейском царстве начала творится всякая чертовщина:" +
                        " смешение языков, небесные кары, невиданные дары богов, всплывающие на стихийных рынках, райские плоды и пряности." +
                        " Смертоносные луки и мечи, плюющиеся огнем. Еще не один человек прошедший всё до конца не вернулся, " +
                        "а те, кто вернулись - не могли внятно рассказать, что было. \n" +
                        "Путь в халдейское царство лежал по Тунному тракту, опасной, но самой прямой дороги. ");
            }
            choice1.setText("Пойти по тракту.");
            choice2.setText("Пойти в обход.");
            choice1.removeActionListener(s4a1);
            choice2.removeActionListener(s4a2);
            choice1.addActionListener(s5a1);
            choice2.addActionListener(s5a2);
            choices.add(2);
        }

    };
    ActionListener s5a1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if( choices.get(2) == 1){
                FrameArea.setText("Дорога шла и мы решил идти пока хватит сил, дорога пылила, но мы хотя бы не собьемся с курса.");
            }else if(choices.get(3) == 2 && choices.get(2) == 2){
                FrameArea.setText("Дорога шла и я решил идти пока хватит сил, дорога пылила, но я хотя бы не собьемся с курса");
            }
            choices.add(1);
            choice1.removeActionListener(s5a1);
            choice2.removeActionListener(s5a2);
        }
    };
    ActionListener s5a2 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            FrameArea.setText("Дорога пустыней была невыносима.");
            choices.add(2);
            choice1.removeActionListener(s5a1);
            choice2.removeActionListener(s5a2);
        }
    };
    ActionListener s6a1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    };
    ActionListener s6a2 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    };
    public static void main(String[] args) {

        MainFrame mainFrame = new MainFrame();
    }
}
