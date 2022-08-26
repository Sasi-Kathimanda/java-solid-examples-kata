package solid.di.refactor.highlevel;

import solid.di.refactor.Switchable;

public class Fan implements Switchable {
    @Override
    public String turnON() {
        return "Fan turned ON";
    }

    @Override
    public String turnOFF() {
        return null;
    }
}