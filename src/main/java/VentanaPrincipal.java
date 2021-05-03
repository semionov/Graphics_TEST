import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaPrincipal extends javax.swing.JFrame {

    PanelPelota panelPelota;
    JButton button;

    public VentanaPrincipal() {

        initFrame();
        initComponents();
        addComponentsToContentPane();
        addListeners();


        this.pack();
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    private void initFrame()
    {
        this.setTitle("VentanaPrincipal");
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().setBackground(Color.red);
        //this.getContentPane().add(new JButton("Left"), BorderLayout.WEST);
        //this.getContentPane().add(new JButton("Center"), BorderLayout.CENTER);
    }

    private void initComponents() {

        panelPelota= new PanelPelota();

        // Button with text "Register"
        button = new JButton("Tocame");
    }

    private void addComponentsToContentPane() {
        this.getContentPane().add(panelPelota,BorderLayout.CENTER);
        this.getContentPane().add(button,BorderLayout.SOUTH);
    }

    private void addListeners() {
        // add a listener to button
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (!panelPelota.isVisible()) panelPelota.setVisible(true);
                else panelPelota.setVisible(false);
            }
        });

    }

//  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
//      panelPelota.setVisible(true);
//  }
//
}
