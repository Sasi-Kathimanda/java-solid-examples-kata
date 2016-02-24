package edu.ocp.violate.kata;

/**
 * Created by sasi-kathimanda on 21/02/16.
 */
public class Logger {
    public void Log(String message, LogType logType) {

        if (logType.name().equals("CONSOLE")) {
            System.out.println(message + " writing to CONSOLE");
        } else {
            System.out.println(message + " writing to FILE");
        }
    }
}
