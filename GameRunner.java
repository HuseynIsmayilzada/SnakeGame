import utilities.GDV5;

import java.awt.*;
import java.awt.event.KeyEvent;

public class GameRunner extends GDV5 {

    private Snake snake = new Snake(20);

    @Override
    public void update() {
        if (KeysPressed[KeyEvent.VK_UP]) {
            snake.setDirection(Snake.Direction.UP);
        }
        if (KeysPressed[KeyEvent.VK_DOWN]) {
            snake.setDirection(Snake.Direction.DOWN);
        }
        if (KeysPressed[KeyEvent.VK_LEFT]) {
            snake.setDirection(Snake.Direction.LEFT);
        }
        if (KeysPressed[KeyEvent.VK_RIGHT]) {
            snake.setDirection(Snake.Direction.RIGHT);
        }

        snake.move();
    }


    @Override
    public void draw(Graphics2D win) {
        snake.draw(win);
    }

    public static void main(String[] args) {
        GameRunner game = new GameRunner();
        game.start();
    }
}
