package edu.ocp.refactor.kata;

/**
 * Created by sasi-kathimanda on 21/02/16.
 */
public class ConsoleLogger implements IMessageLogger {

    @Override
    public void Log(String message) {
        System.out.println(message+" writing to CONSOLE");
    }
}
