package tp1.forme;

public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }
    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }



    public void setX(int x) {
        if (x < 0) {
            this.x = 0;
        } else {
            this.x = x;
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y < 0) {
            this.y = 0;
        } else {
            this.y = y;
        }
    }

    public void deplacer(int dx, int dy) {
        if (x + dx < 0) {
            x = 0;
        } else {
            this.x += dx;
        }
        if (y + dy < 0) {
            y = 0;
        } else {
            this.y += dy;
        }

    }
}
