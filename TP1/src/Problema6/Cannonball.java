package Problema6;
import java.util.ArrayList;

public class Cannonball {
    private double x;
    private double y;
    private double vx;
    private double vy;

    public Cannonball(double x) {
        this.x = x;
        this.y = 0;
        this.vx = 0;
        this.vy = 0;
    }

    public void move(double deltaSec) {
        double dx = this.vx * deltaSec;
        double dy = this.vy * deltaSec;
        this.x += dx;
        this.y += dy;
        this.vy -= 9.81 * deltaSec;
    }

    public Point getLocation() {
        int x = (int) Math.round(this.x);
        int y = (int) Math.round(this.y);
        return new Point(x, y);
    }

    public ArrayList<Point> shoot(double alpha, double v, double deltaSec) {
        this.vx = v * Math.cos(Math.toRadians(alpha));
        this.vy = v * Math.sin(Math.toRadians(alpha));

        ArrayList<Point> locations = new ArrayList<>();
        locations.add(this.getLocation());

        while (this.y > 0) {
            this.move(deltaSec);
            locations.add(this.getLocation());
        }

        return locations;
    }
}

