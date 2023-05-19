import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Saper.Box;
import Saper.Coord;
import Saper.Game;
import Saper.Ranges;

public class Sapering extends JFrame {

    private Game game;
    private JPanel panel;
    private JLabel label;
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
        initLabel();
        initPanel();
        initFrame();
    }

    private void initLabel()
    {
        label = new JLabel("Приветствуем в замечательное игре");
        add (label,BorderLayout.SOUTH);
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

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e)
            {
                int x = e.getX() / ImageSize;
                int y = e.getY() / ImageSize;
                Coord coord = new Coord(x,y);
                if (e.getButton() == MouseEvent.BUTTON1)
                    game.pressLeftButton (coord);
                if (e.getButton() == MouseEvent.BUTTON3)
                    game.pressRightButton (coord);
                if (e.getButton() == MouseEvent.BUTTON2)
                    game.start ();
                label.setText(getMessage());
                panel.repaint();
            }
        });
        panel.setPreferredSize(new Dimension(
                Ranges.getSize().x * ImageSize,
                Ranges.getSize().y * ImageSize));
        add (panel);
    }

    private String getMessage()
    {
        switch (game.getState())
        {
            case PLAYED : return "Давайте думать";
            case BOMBDED: return "Вы проиграли :(";
            case WINNER: return "Ура, победа!";
            default: return "Приветствуем в замечательное игре";
        }
    }
    private void initFrame()
    {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Saper");
        setResizable(false);
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
        setIconImage(getImage("icon"));
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
