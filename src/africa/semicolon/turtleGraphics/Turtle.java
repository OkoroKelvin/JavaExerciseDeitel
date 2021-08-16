package africa.semicolon.turtleGraphics;

import static africa.semicolon.turtleGraphics.Direction.*;
import static africa.semicolon.turtleGraphics.PenPosition.DOWN;
import static africa.semicolon.turtleGraphics.PenPosition.UP;

public class Turtle {
    private Pen pen;
    private Direction currentDirection;
    private TurtlePosition myPosition;

    public Turtle() {
        pen = new Pen();
        currentDirection = Direction.EAST;
        myPosition = new TurtlePosition();
    }

    public void setPen(Pen biro) {
        pen = biro;
    }

    public Pen getPen() {
        return pen;
    }

    public void penDown() {
        pen.setPosition(DOWN);
    }

    public PenPosition getPenPosition() {
        return pen.getPosition();
    }

    public void penUp() {
        pen.setPosition(UP);
    }

    public Direction getDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if(currentDirection == WEST) currentDirection = NORTH;

        else if(currentDirection == NORTH) currentDirection = EAST;

        else if(currentDirection == EAST) currentDirection = SOUTH;

        else if(currentDirection == SOUTH) currentDirection = WEST;
    }


    public void turnLeft() {
        if(currentDirection == EAST) currentDirection = NORTH;
        else if (currentDirection == NORTH) currentDirection = WEST;
        else if (currentDirection == WEST) currentDirection = SOUTH;
        else if (currentDirection == SOUTH) currentDirection = EAST;



    }

    public TurtlePosition getTurtlePosition() {
        return myPosition;
    }

    public void move(int numberOfSteps) {
        if(currentDirection == EAST) {
            myPosition.increaseColumnPositionBy(numberOfSteps);
        } else if(currentDirection == WEST){ myPosition.decreaseColumnPositionBy(numberOfSteps);
        }else if(currentDirection == SOUTH){
            myPosition.increaseRowPositionBy(numberOfSteps);
        }else if(currentDirection == NORTH){
            myPosition.decreaseColumnPositionBy(numberOfSteps);
        }
    }


    public void move(int numberOfSteps, Sketchpad sketchpad) {
        int columnPosition = myPosition.getColumnPosition();
        int rowPosition = myPosition.getRowPosition();
        if(pen.getPosition().equals(DOWN)){
            switch (currentDirection){
                case EAST -> {
                    for(int i = columnPosition;i < columnPosition + numberOfSteps ; i++) {
                        sketchpad.getFloor()[rowPosition][i] = 1;
                    }
                }
            }
        }
        move(numberOfSteps);
    }
}
