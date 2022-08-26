package solid.di.refactor.lowlevel;

import solid.di.refactor.Switchable;

public class LightBulb implements Switchable {
    @Override
    public String turnON() {
        return "LightBulb turned ON";
    }

    @Override
    public String turOFF() {
        return "LightBulb turned OFF";
    }
}
