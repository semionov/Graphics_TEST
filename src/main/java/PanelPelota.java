import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class PanelPelota extends JPanel {

    // Variables declaration - do not modify
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration

    public PanelPelota() {
        initPanel();
    }


    private void initPanel() {
        this.setBackground(Color.red);
        this.setVisible(false);
    }


    @Override
    public void paintComponent(Graphics g)
    {

        super.paintComponents(g);

        Graphics2D graficos2D =(Graphics2D)g;
        //Pelota pelota = new Pelota();
        graficos2D.drawLine(200, 200, 500, 500);
    }

}
