
package television;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    Television sonyTv;

    @BeforeEach
    void startWith() {
        sonyTv = new Television();
    }

    @Test
    public void testThatTvIsOff() {
        assertFalse(sonyTv.isOn());
    }

    @Test
    public void testThatTvCanBeTurnedOnIfItIsOff() {
        assertFalse(sonyTv.isOn());
        sonyTv.turnOn();
        assertTrue(sonyTv.isOn());

    }

    @Test
    public void testThatTvCanBeTurnedOffWhenOn() {
        assertFalse(sonyTv.isOn());
        sonyTv.turnOn();
        assertTrue(sonyTv.isOn());
        sonyTv.turnOff();
        assertFalse(sonyTv.isOn());
    }

    @Test
    public void testThatTvChannelCanBeSet() {
        sonyTv.turnOn();
        assertTrue(sonyTv.isOn());
        sonyTv.setTvChannel(23);
        assertEquals(23,sonyTv.getChannel());
    }

    @Test
    public void testThatTvChannelCantBeSetWhenTvIsOff() {
        assertFalse(sonyTv.isOn());
        sonyTv.setTvChannel(29);
        assertEquals(0,sonyTv.getChannel());
    }

    @Test
    public void testThatTvChannelCanBeIncreased(){
        sonyTv.turnOn();
        assertTrue(sonyTv.isOn());
        sonyTv.setTvChannel(1);
        sonyTv.increaseTvChannel();
        assertEquals(2,sonyTv.getChannel());

    }

    @Test
    public void testThatTvChannelCantBeIncreasedWhenTvIsOff(){
        sonyTv.turnOff();
        assertFalse(sonyTv.isOn());
        sonyTv.increaseTvChannel();
        assertEquals(0,sonyTv.getChannel());
    }

    @Test
    public void testThatTvChannelCanBeDecreased(){
        sonyTv.turnOn();
        assertTrue(sonyTv.isOn());
        sonyTv.increaseTvChannel();
        sonyTv.increaseTvChannel();
        sonyTv.decreaseTvChannel();
        assertEquals(1,sonyTv.getChannel());
    }
    @Test
    public void testThatTvChannelCannotExceedTwentyFive() {
        sonyTv.turnOn();
        assertTrue(sonyTv.isOn());
        for (int i = 0; i < 25; i++) {
            sonyTv.increaseTvChannel();
        }
        sonyTv.increaseTvChannel();
        assertEquals(0, sonyTv.getChannel());


    }

    @Test
    public void testThatTvChannelDecrementCannotGoBelowZero() {
        sonyTv.turnOn();
        for (int i = 0; i < 25; i++) {
            sonyTv.increaseTvChannel();
        }
        for (int i = 0; i < 25; i--) {
            sonyTv.decreaseTvChannel();
        }
        assertEquals(0, sonyTv.getChannel());

    }

    @Test
    public void testThatTvVolumeCanIncrease(){
        sonyTv.turnOn();
        assertTrue(sonyTv.isOn());
        sonyTv.increaseVolume();
        sonyTv.increaseVolume();
        assertEquals(2,sonyTv.getVolume());
    }
    @Test
    public void testThatTvVolumeCannotIncreaseMoreThanThirty(){
        sonyTv.turnOn();
        assertTrue(sonyTv.isOn());
        for (int i = 0; i <30 ; i++) {
            sonyTv.increaseVolume();
        }
        assertEquals(30,sonyTv.getVolume());
    }

    @Test
    public void testThatTvVolumeCanDecrease(){
        sonyTv.turnOn();
        assertTrue(sonyTv.isOn());
        sonyTv.increaseVolume();
        sonyTv.increaseVolume();
        sonyTv.decreaseVolume();
        assertEquals(1,sonyTv.getVolume());
    }
    @Test
    public void testThatTvVolumeCannotDecreaseBeyondZero(){
        sonyTv.turnOn();
        assertTrue(sonyTv.isOn());
        for (int i = 0; i < 30; i++) {
            sonyTv.increaseVolume();
        }
        for (int i = 0; i < 30; i--) {
            sonyTv.decreaseVolume();
        }
        assertEquals(0,sonyTv.getVolume());
    }

    @Test
    public void testThatTvVolumeCanBeMuted(){
        sonyTv.turnOn();
        assertTrue(sonyTv.isOn());
        for (int i = 0; i < 30; i++) {
            sonyTv.increaseVolume();
        }
        sonyTv.muteControl();
        assertEquals(0,sonyTv.getVolume());


    }

    @Test
    public void testThatTvVolumeCanBeUnMuted(){
        sonyTv.turnOn();
        assertTrue(sonyTv.isOn());
        sonyTv.increaseVolume();
        sonyTv.increaseVolume();
        sonyTv.increaseVolume();
        sonyTv.muteControl();
        assertEquals(0,sonyTv.getVolume());
        sonyTv.muteControl();
        assertEquals(3,sonyTv.getVolume());
    }
//    @Test
//    public void testThatTvVolumeCanBeMuted(){
//        sonyTv.turnOn();
//        //given that my tv is on
//        sonyTv.setVolume(10);
//        for (int i = 0; i < 30; i++) {
//            sonyTv.increaseVolume();
//        }
//        sonyTv.muteTvVolume();
//        assertEquals(0,sonyTv.decreaseVolume());
//
//    }
//
//    @Test
//    public void testThatTvCanBeUnmuted(){
//        sonyTv.turnOn();
//        sonyTv.setVolume(10);
//        for (int i = 0; i < 30; i++) {
//            sonyTv.increaseVolume();
//        }
//        sonyTv.muteTvVolume();
//        assertEquals(0,sonyTv.decreaseVolume());

        //given that my tv is on
        //when i set volume at any level check
        //and i mute it ,it is at zero
        //and i unmute it,
        // check that it will go back to the exact volume it was

    }





