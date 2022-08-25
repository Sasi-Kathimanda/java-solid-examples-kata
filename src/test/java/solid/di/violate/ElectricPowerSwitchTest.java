package solid.di.violate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ElectricPowerSwitchTest {
    ElectricPowerSwitch sut;

    @BeforeEach
    void setUp() {
        sut = new ElectricPowerSwitch(true, new LightBulb());
    }

    @Test
    void pressShouldTurnONWhenSwitchIsOFF() {
        //given
        assertTrue(sut.isOn());
        //when
        var actual = sut.press();
        //then
        assertFalse(sut.isOn());
        assertEquals("bulb is turned OFF", actual);
    }

    @Test
    void pressShouldTurnOFFWhenSwitchIsON() {
        //given
        sut = new ElectricPowerSwitch(false, new LightBulb());
        assertFalse(sut.isOn());
        //when
        var actual = sut.press();
        //then
        assertTrue(sut.isOn());
        assertEquals("bulb is turned ON", actual);
    }
}