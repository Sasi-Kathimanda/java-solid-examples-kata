package solid.di.refactor.highlevel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solid.di.refactor.lowlevel.Fan;
import solid.di.refactor.lowlevel.LightBulb;

class ElectricPowerSwitchTest {
    ElectricPowerSwitch sut;

    @BeforeEach
    void setUp() {
    }

    @Test
    void pressShouldTurnOnALightBulb() {
        //given
        sut = new ElectricPowerSwitch(false, new LightBulb());
        //when
        Assertions.assertFalse(sut.isOn());
        var actual = sut.press();
        //then
        Assertions.assertEquals("LightBulb turned ON", actual);
    }

    @Test
    void pressShouldTurnOFFALightBulb() {
        //given
        sut = new ElectricPowerSwitch(true, new LightBulb());
        //when
        Assertions.assertTrue(sut.isOn());
        var actual = sut.press();
        //then
        Assertions.assertEquals("LightBulb turned OFF", actual);
    }

    @Test
    void pressShouldTurnONAFan() {
        //given
        sut = new ElectricPowerSwitch(false, new Fan());
        //when
        Assertions.assertFalse(sut.isOn());
        var actual = sut.press();
        //then
        Assertions.assertEquals("Fan turned ON", actual);
    }

    @Test
    void pressShouldTurnOFFAFan() {
        //given
        sut = new ElectricPowerSwitch(true, new Fan());
        //when
        Assertions.assertTrue(sut.isOn());
        var actual = sut.press();
        //then
        Assertions.assertEquals("Fan turned OFF", actual);
    }
}