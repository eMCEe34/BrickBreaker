package minitennis;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Bricks {
    private static final int WIDTH = 60;
    private static final int HEIGHT = 20;
    private static final int Y = 30;
    int x = 0;
    private Main game;

    public Bricks(Main game){
        this.game = game;
    }

    public void paint (Graphics2D g){
        g.fillRect(x,Y,WIDTH,HEIGHT);
    }

    public Rectangle getBounds(){
        return new Rectangle(x,Y,WIDTH,HEIGHT);
    }
}
