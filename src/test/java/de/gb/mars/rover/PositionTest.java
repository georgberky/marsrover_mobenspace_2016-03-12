package de.gb.mars.rover;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PositionTest {

    @Test
    public void newPosition_isZeroZero_initially() {
        Position position = new Position();
        assertEquals(new Position(0, 0), position);
    }

    @Test
    public void differentPositionsAreNotEqual() {
        Position position = new Position();
        assertNotEquals(new Position(1, 0), position);
    }
}
