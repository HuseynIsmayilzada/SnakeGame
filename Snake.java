import java.awt.*;

public class Snake {
    private Rectangle snakeBody[];
    private enum direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public Snake(int size) {
        snakeBody = new Rectangle[size];
    }

    public void draw(Graphics2D win) {
        for (int i = 0; i < snakeBody.length; i++) {
            win.draw(snakeBody[i]);
        }
    }

    public void update() {

    }
}
