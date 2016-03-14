package de.gb.mars.rover;

public class Rover {

    private Direction direction;

    private int yPosition = 0;

    public Rover(Direction direction) {
        this.direction = direction;
    }

    public Direction getCurrentDirection() {
        return direction;
    }

    public int getXPosition() {
        return 0;
    }

    public int getYPosition() {
        return yPosition;
    }

    public void moveForward() {
        yPosition = 1;
    }

    public Position getPosition() {
        return new Position(0, yPosition);
    }
}
