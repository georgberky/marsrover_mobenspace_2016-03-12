package de.gb.mars.rover;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RoverTest {

    @Test
    public void canCreateRover() {
        Rover rover = new Rover(Direction.NORTH);

        assertEquals(Direction.NORTH, rover.getCurrentDirection());
    }

    @Test
    public void canCreateRoverFacingSouth() {
        Rover rover = new Rover(Direction.SOUTH);
        assertEquals(Direction.SOUTH, rover.getCurrentDirection());
    }

//    @Test
//    public void robotXPosition_should_be_zero_initially(){
//        Rover rover = new Rover(Direction.SOUTH);
//        assertEquals(0, rover.getXPosition());
//    }
//
//    @Test
//    public void robotYPosition_should_be_zero_initially(){
//        Rover rover = new Rover(Direction.SOUTH);
//        assertEquals(0, rover.getYPosition());
//    }

    @Test
    public void robotXYPosition_should_be_zero_initially(){
        Rover rover = new Rover(Direction.SOUTH);
        assertEquals(new Position(0,0), rover.getPosition());
    }


    @Test
    public void robotYPosition_isIncremented_whenMovingForwardNorth(){
        Rover rover = new Rover(Direction.NORTH);

        rover.moveForward();

        assertEquals(1, rover.getYPosition());
    }

    @Test
    public void robotXYPosition_isIncremented_whenMovingForwardNorth(){
        Rover rover = new Rover(Direction.NORTH);

        rover.moveForward();

        assertEquals(new Position(0, 1), rover.getPosition());
    }


    @Test
    public void robotXPosition_isUnchanged_whenMovingForwardNorth(){
        Rover rover = new Rover(Direction.NORTH);

        rover.moveForward();

        assertEquals(0, rover.getXPosition());
    }



}
