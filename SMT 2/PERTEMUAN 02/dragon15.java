public class dragon15 {
    int x, y, width, height;

    // membuat konstruktor
    public dragon15(int w, int h) {
        width = w;
        height = h;
    }

    void moveLeft() {
        if (x > 0 && x <= width) {
            x--;
        } else {
            detectCollision();
        }
    }

    void moveRight() {
        if (x >= 0 && x < width) {
            x++;
        } else {
            detectCollision();
        }
    }

    void moveUp() {
        if (y > 0 && y <= height) {
            y--;
        } else {
            detectCollision();
        }
    }

    void moveDown() {
        if (y >= 0 && y < height) {
            y++;
        } else {
            detectCollision();
        }
    }

    void detectCollision() {
        if (x < 0 || x > width || y < 0 || y > height) {
            System.out.println("Game Over");
            System.exit(0);
        }
    }

    void printPosition() {
        System.out.printf("x : %d\ny : %d", x, y);
    }
}