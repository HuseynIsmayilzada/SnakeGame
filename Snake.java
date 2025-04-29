import java.awt.*;
import java.util.ArrayList;

import static java.awt.Color.*;

public class Snake {
    private Color color = Color.CYAN;
    private ArrayList<Rectangle> body;
    private Direction direction = Direction.RIGHT;

    public Snake(int length) {
        body = new ArrayList<Rectangle>();
        for(int i = 0; i<length; i++) {
            body.add(new Rectangle(400-(10*i), 400, 10,10));
        }

    }

    public Snake() {
        this(1);
    }

    public void draw(Graphics2D win) {
        win.setColor(color);
         for(int i=0; i<body.size(); i++) {
             win.fill(body.get(i));
         }
    }

    public void move() {
        switch(direction) {
            case RIGHT:
                this.body.add(0, new Rectangle(this.body.get(0).x+10, this.body.get(0).y, 10, 10));
                this.body.remove(this.body.size()-1);
                break;
            case LEFT:
                this.body.add(0, new Rectangle(this.body.get(0).x-10, this.body.get(0).y, 10, 10));
                this.body.remove(this.body.size()-1);
                break;
            case UP:
                this.body.add(0, new Rectangle(this.body.get(0).x, this.body.get(0).y-10, 10, 10));
                this.body.remove(this.body.size()-1);
                break;
            case DOWN:
                this.body.add(0, new Rectangle(this.body.get(0).x, this.body.get(0).y+10, 10, 10));
                this.body.remove(this.body.size()-1);
                break;
            default:
                break;
        }
        //if (this.body.)
    }

    public void setDirection(Direction direction){
        switch (this.direction) {
            case RIGHT:
                if(direction!=Direction.LEFT) this.direction = direction;
                break;
            case LEFT:
                if(direction!=Direction.RIGHT) this.direction = direction;
                break;
            case UP:
                if(direction!=Direction.DOWN) this.direction = direction;
                break;
            case DOWN:
                if(direction!=Direction.UP) this.direction = direction;
                break;
        }
    }

    public static enum Direction {
        UP, DOWN, LEFT, RIGHT
    }
}
