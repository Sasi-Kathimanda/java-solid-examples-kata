package edu.ocp.violate.kata;

public class Logger {
    public String Log(String message, LogType logType) {

        if (logType.name().equals("CONSOLE")) {
            return String.format("%s writing to CONSOLE", message);
        } else {
            return String.format("%s writing to FILE", message);
        }
    }
}
