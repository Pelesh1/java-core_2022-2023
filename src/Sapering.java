import javax.swing.*;
import java.awt.*;

public class Sapering extends JFrame {

    private JPanel panel;
    private final int COLS = 15;
    private final int ROWS = 1;
    private final int ImageSize=50;
    public static void main(String[] args) {
        new Sapering();
    }

    private Sapering(){
        initPanel();
        initFrame();
    }

    private void initPanel(){
        panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(getImage("bomb"),0, 0,this);
                g.drawImage(getImage("num1"),ImageSize, 0,this);
            }
        };
        panel.setPreferredSize(new Dimension(COLS*ImageSize, ROWS * ImageSize));
        add (panel);
    }
    private void initFrame(){
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Saper");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    private Image getImage(String name)
    {
        String filename = "img/" + name.toLowerCase() + ".png";
        ImageIcon icon = new ImageIcon(getClass().getResource(filename));
        return icon.getImage();
    }
}
