import javax.swing.*;
import java.lang.reflect.InvocationTargetException;
import java.awt.*;

public class Graphics extends JFrame {

    public static void main(String[] args) throws InvocationTargetException, InterruptedException {
        /*
        Runnable initFrame = new Runnable() {
            @Override
            public void run() {
                new Graphics();
            }
        };
        SwingUtilities.invokeAndWait(initFrame);\

         */

        VentanaPrincipal frame= new VentanaPrincipal();
        //new Graphics();
        //cheking
    }

    /*
    public Graphics() {

        super("Hello App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setVisible(true);

        JLabel nameLabel = new JLabel();
        nameLabel.setText("Your Name");
        nameLabel.setBounds(40, 20, 100, 30);
        add(nameLabel);

        JTextField nameTextField = new JTextField();
        nameTextField.setBounds(160,20, 100,30);
        add(nameTextField);

        JPanel greenPanel = new JPanel();
        greenPanel.setBounds(40,150,220,70);
        greenPanel.setLayout(new BorderLayout());
        greenPanel.setBackground(Color.GREEN);
        add(greenPanel);

        JLabel helloLabel = new JLabel("Hello");
        helloLabel.setBounds(50,20, 100,30);
        helloLabel.setHorizontalAlignment(SwingConstants.CENTER);
        helloLabel.setVerticalAlignment(SwingConstants.CENTER);

        Font font = new Font("Courier", Font.BOLD,12);
        helloLabel.setFont(font);
        helloLabel.setFont(helloLabel.getFont().deriveFont(16f));

        greenPanel.add(helloLabel); // adding label to the panel


        /*
        super("Game of life");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(720, 800);


        JPanel jPanelUp = new JPanel(new GridBagLayout());
        jPanelUp.setBounds(0, 80, 720, 720);
        //jPanelUp.setLayout(new BorderLayout());
        //jPanelUp.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanelUp.setBackground(Color.BLUE);


        /*
        JLabel jLabel = new JLabel("Generation");
        jLabel.setName("GenerationLabel");

        //jLabel.setHorizontalAlignment(SwingConstants.LEFT);
        //jLabel.setVerticalAlignment(SwingConstants.LEFT);

        jPanelUp.add(jLabel);

        JLabel jLabel2 = new JLabel("Alive: ");
        jLabel2.setName("AliveLabel");
        jPanelUp.add(jLabel2);
        //jLabel2.setHorizontalAlignment(SwingConstants.LEFT);
        //jLabel.setVerticalAlignment(SwingConstants.CENTER);

         ---


        JPanel jPanelDown = new JPanel(new GridBagLayout());
        jPanelDown.setBounds(0, 0, 720, 80);
        //jPanelDown.setLayout(new BorderLayout());
        jPanelDown.setBackground(Color.RED);
        //jPanelDown.add(jLabel2);
        //jPanelDown.setBorder(BorderFactory.createLineBorder(Color.black));

        add(jPanelUp);
        add(jPanelDown);

        //setLayout(new FlowLayout());
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        setLocationRelativeTo(null);
        setVisible(true);

    }
    */


}
