package edu.ocp.refactor.kata;

import edu.ocp.violate.kata.*;

/**
 * Created by sasi-kathimanda on 21/02/16.
 */
public class OCPRefactorRunner {
    public static void main(String[] args) {

        Logger consoleLogger = new Logger(new ConsoleLogger());
        consoleLogger.Log("SASI");

        Logger fileLogger = new Logger(new FileLogger());
        fileLogger.Log("SASI");
    }
}
