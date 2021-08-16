package africa.semicolon.turtleGraphics;

import org.junit.jupiter.api.Test;

import static africa.semicolon.turtleGraphics.Direction.*;
import static africa.semicolon.turtleGraphics.PenPosition.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    @Test
    void turtleCanBeCreatedTest() {
        Turtle ijapa = new Turtle();
        assertNotNull(ijapa);
    }

    @Test
    void turtleHasAPenTest() {
        Turtle ijapa = new Turtle();
        Pen biro = new Pen();
        ijapa.setPen(biro);
        assertSame(biro, ijapa.getPen());
    }

    @Test
    void turtleHasPenOnCreation() {
        Pen biro = new Pen();
        Turtle ijapa = new Turtle();
        assertNotNull(ijapa.getPen());

    }

    @Test
    void penHAsPosition() {
        Pen biro = new Pen();
        assertNotNull(biro.getPosition());
    }

    @Test
    void penDefaultPositionOfPenISUp() {
        Pen biro = new Pen();
        assertSame(UP, biro.getPosition());
    }

    @Test
    void turtleCanTurnPenDown() {
        //given
        Turtle abstractTurtle = new Turtle();
        //when
        abstractTurtle.penDown();
        //assert
        assertSame(DOWN, abstractTurtle.getPenPosition());
    }

    @Test
    void turtleCanTurnPenUp() {
        //given
        Turtle ijapa = new Turtle();
        ijapa.penDown();
        assertSame(DOWN, ijapa.getPenPosition());
        //when
        ijapa.penUp();
        //assert
        assertSame(UP, ijapa.getPenPosition());
    }

    @Test
    void turtleCanTurnRightWhenFacingEast() {
        //given
        Turtle ijapa = new Turtle();
        assertSame(EAST, ijapa.getDirection());
        //
        ijapa.turnRight();
        //assert
        assertSame(Direction.SOUTH, ijapa.getDirection());
    }

    @Test
    void turtleCanTurnRightWhenFacingSouth() {
        //given
        Turtle ijapa = new Turtle();
        ijapa.turnRight();
        assertSame(Direction.SOUTH, ijapa.getDirection());
        //
        ijapa.turnRight();
        //assert
        assertSame(Direction.WEST, ijapa.getDirection());
    }
    //todo facing west and facing north;

    @Test
    void turtleCanTurnRightWhenFacingWest() {
        Turtle ijapa = new Turtle();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(Direction.WEST, ijapa.getDirection());
        ijapa.turnRight();
        assertSame(Direction.NORTH, ijapa.getDirection());
    }

    @Test
    void turtleCanTurnRightWhenFacingNorth() {
        Turtle ijapa = new Turtle();
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(Direction.NORTH, ijapa.getDirection());
        ijapa.turnRight();
        assertSame(Direction.EAST, ijapa.getDirection());
    }


    @Test
    void turtleCanTurnLeftWhileFacingEast() {
        Turtle ijapa = new Turtle();
        assertSame(EAST, ijapa.getDirection());
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingNorth() {
        Turtle ijapa = new Turtle();
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getDirection());
        ijapa.turnLeft();
        assertSame(WEST, ijapa.getDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingWest() {
        Turtle ijapa = new Turtle();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(WEST, ijapa.getDirection());
        ijapa.turnLeft();
        assertSame(SOUTH, ijapa.getDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingSouth() {
        Turtle ijapa = new Turtle();
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(SOUTH, ijapa.getDirection());
        ijapa.turnLeft();
        assertSame(EAST, ijapa.getDirection());
    }

    @Test
    void turtleCanMoveForwardWhileFacingEastTest() {
        Turtle ijapa = new Turtle();
        TurtlePosition position = ijapa.getTurtlePosition();
        assertEquals(0, position.getColumnPosition());
        assertEquals(0, position.getRowPosition());
        // when
        ijapa.move(5);
        //assert
        TurtlePosition newPosition = ijapa.getTurtlePosition();
        assertEquals(5, newPosition.getColumnPosition());
        assertEquals(0, newPosition.getRowPosition());
    }

    @Test
    void turtleCanMoveForwardWhileFacingSouthTest() {
        Turtle ijapa = new Turtle();
        TurtlePosition position = ijapa.getTurtlePosition();
        assertEquals(0, position.getColumnPosition());
        assertEquals(0, position.getRowPosition());
        ijapa.turnRight();
        // when
        ijapa.move(5);
        //assert
        TurtlePosition newPosition = ijapa.getTurtlePosition();
        assertEquals(0, newPosition.getColumnPosition());
        assertEquals(5, newPosition.getRowPosition());

    }

    @Test
    void turtleCanMoveForwardWhileFacingWestTest() {
        Turtle ijapa = new Turtle();
        assertSame(EAST, ijapa.getDirection());
        ijapa.move(5);
        ijapa.turnLeft();
        ijapa.turnLeft();

        TurtlePosition position = ijapa.getTurtlePosition();
        assertEquals(5, position.getColumnPosition());
        assertEquals(0, position.getRowPosition());
        assertSame(WEST, ijapa.getDirection());

        //when
        ijapa.move(5);
        //assert
        TurtlePosition newPosition = ijapa.getTurtlePosition();
        assertEquals(0, newPosition.getColumnPosition());
        assertEquals(0, newPosition.getRowPosition());
    }

    @Test
    public void turtleCanWriteEastWardWhenPenIsDown(){
        //given
        Sketchpad sketchpad = new Sketchpad(20,20);
        Turtle ijapa = new Turtle();
        ijapa.penDown();
        //when
        ijapa.move(5, sketchpad);

        assertEquals(1,sketchpad.getFloor()[0][0]);
        assertEquals(1,sketchpad.getFloor()[0][1]);
        assertEquals(1,sketchpad.getFloor()[0][2]);
        assertEquals(1,sketchpad.getFloor()[0][3]);
        assertEquals(1,sketchpad.getFloor()[0][4]);
        assertEquals(0,sketchpad.getFloor()[0][5]);



        TurtlePosition position = ijapa.getTurtlePosition();
        assertEquals(4, position.getColumnPosition());
        assertEquals(0, position.getRowPosition());


    }
}


