import javax.swing.*;
import java.awt.*;
import Saper.Box;
import Saper.Coord;
import Saper.Game;
import Saper.Ranges;

public class Sapering extends JFrame {

    private Game game;
    private JPanel panel;
    private final int COLS = 9;
    private final int ROWS = 9;

    private final int BOMBS = 10;
    private final int ImageSize=50;
    public static void main(String[] args) {
        new Sapering();
    }

    private Sapering(){
        game = new Game(COLS, ROWS, BOMBS);
        game.start();
        setImages();
        initPanel();
        initFrame();
    }

    private void initPanel(){
        panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (Coord coord: Ranges.getAllCoords())
                {
                    g.drawImage((Image) game.getBox(coord).image,
                            coord.x * ImageSize, coord.y * ImageSize,this);
                }
            }
        };
        panel.setPreferredSize(new Dimension(
                Ranges.getSize().x * ImageSize,
                Ranges.getSize().y * ImageSize));
        add (panel);
    }
    private void initFrame()
    {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Saper");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setIconImage(getImage("icon"));
        pack();
    }

    private void setImages()
    {
        for (Box box: Box.values())
            box.image = getImage(box.name());
    }

    private Image getImage(String name)
    {
        String filename = "img/" + name.toLowerCase() + ".png";
        ImageIcon icon = new ImageIcon(getClass().getResource(filename));
        return icon.getImage();
    }
}
