package africa.semicolon.chapterThree;

/*
ClassName: Bike
Requirements:
1. The Bike can be turned On and Off.
2. The Bike can accelerate or decelerate only when its on
3. The Bike is automatic, that is, the gear changes as it accelerates or decelerates.
4. The Bike Speed increases based on the gear Number.
5. The Bike is allowed to set Speed Only for testing to Stimulate accleration/decelearation.
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import javax.sound.midi.Soundbank;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BikeTest {
    private Bike okada;

    @BeforeEach
    public void startEachTestWithThis() {
        okada = new Bike();
    }

    @Test
    public void testThatSpeedCanBeSetWhenBikeIsOn() {
        okada.setOn(true);
        assertTrue(okada.isOn());
        assertEquals(true, okada.isOn());
        okada.setSpeedInKmPerHour(15);
        assertEquals(15, okada.getSpeedInKmPerHour());
    }

    @Test
    public void BikeSpeedCannotBeSetWhenBikeIsOff() {
        okada.setOn(false);
        assertFalse(okada.isOn());
        okada.setSpeedInKmPerHour(45);
        assertEquals(0, okada.getSpeedInKmPerHour());
    }

    @Test
    public void testThatSetOnChangesTheGearNumberToOne() {
        assertEquals(0, okada.getCurrentGearNumber());
        okada.setOn(true);
        assertEquals(1, okada.getCurrentGearNumber());
    }

    @Test
    public void testThatBikeCanAccelerateOnGearOne() {
        okada.setOn(true);
        assertEquals(1, okada.getCurrentGearNumber());
        okada.speedUp();
        okada.speedUp();
        assertEquals(2,okada.getSpeedInKmPerHour());
        okada.speedUp();
        okada.speedUp();
        assertEquals(4,okada.getSpeedInKmPerHour());
        assertEquals(1,okada.getCurrentGearNumber());
        okada.setSpeedInKmPerHour(15);
        okada.speedUp();
        okada.speedUp();
        assertEquals(17,okada.getSpeedInKmPerHour());
    }

    @Test
    public void testThatBikeChangesGearAutomaticallyAtAcceleration(){
        okada.setOn(true);
        okada.setSpeedInKmPerHour(15);
        okada.speedUp();
        assertEquals(1,okada.getCurrentGearNumber());
        okada.setSpeedInKmPerHour(20);
        okada.speedUp();
        assertEquals(2,okada.getCurrentGearNumber());
        okada.setSpeedInKmPerHour(35);
        okada.speedUp();
        assertEquals(3, okada.getCurrentGearNumber());
    }
    @Test
    public void testThatBikeCanChangeGearInDeceleration(){
        okada.setOn(true);
        okada.setSpeedInKmPerHour(35);
        okada.speedUp();
        assertEquals(38, okada.getSpeedInKmPerHour());
        assertEquals(3, okada.getCurrentGearNumber());
        okada.decreaseSpeed();
        assertEquals(35,okada.getSpeedInKmPerHour());
        assertEquals(3, okada.getCurrentGearNumber());
        okada.decreaseSpeed();
        okada.decreaseSpeed();
        okada.decreaseSpeed();
        assertEquals(2,okada.getCurrentGearNumber());
        assertEquals(29, okada.getSpeedInKmPerHour());
        okada.decreaseSpeed();
    }

}