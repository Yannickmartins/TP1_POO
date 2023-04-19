package Problema0;

public class Robot {
    public enum Direction {
        NORTH, EAST, SOUTH, WEST;

        public Direction turnLeft() {
            switch (this) {
                case NORTH:
                    return WEST;
                case EAST:
                    return NORTH;
                case SOUTH:
                    return EAST;
                case WEST:
                    return SOUTH;
                default:
                    throw new IllegalStateException();
            }
        }

        public Direction turnRight() {
            switch (this) {
                case NORTH:
                    return EAST;
                case EAST:
                    return SOUTH;
                case SOUTH:
                    return WEST;
                case WEST:
                    return NORTH;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        this.direction = this.direction.turnLeft();
    }

    public void turnRight() {
        this.direction = this.direction.turnRight();
    }

    public void move() {
        switch (this.direction) {
            case NORTH:
                this.y++;
                break;
            case EAST:
                this.x++;
                break;
            case SOUTH:
                this.y--;
                break;
            case WEST:
                this.x--;
                break;
            default:
                throw new IllegalStateException();
        }
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String getDirection() {
        switch (this.direction) {
            case NORTH:
                return "N";
            case EAST:
                return "E";
            case SOUTH:
                return "S";
            case WEST:
                return "W";
            default:
                throw new IllegalStateException();
        }
    }
}
