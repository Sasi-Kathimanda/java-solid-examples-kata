package edu.ocp.refactor.kata;

public class ConsoleLogger implements IMessageLogger {

    @Override
    public String Log(String message) {
        return String.format("%s writing to CONSOLE", message);
    }
}
