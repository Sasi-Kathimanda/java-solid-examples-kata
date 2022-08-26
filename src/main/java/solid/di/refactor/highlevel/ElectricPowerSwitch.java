package solid.di.refactor.highlevel;

import solid.di.refactor.Switch;
import solid.di.refactor.Switchable;

public class ElectricPowerSwitch implements Switch {
    private final boolean isOn;
    private final Switchable client;

    public ElectricPowerSwitch(boolean isOn, Switchable client) {
        this.isOn = isOn;
        this.client = client;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public String press() {
        if (!isOn()) {
            return client.turnON();
        } else {
            return null;
        }
    }
}
