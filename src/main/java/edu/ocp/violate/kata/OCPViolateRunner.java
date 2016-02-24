package edu.ocp.violate.kata;

/**
 * Created by sasi-kathimanda on 21/02/16.
 */
public class OCPViolateRunner {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.Log("SASI",LogType.CONSOLE);
        logger.Log("SASI",LogType.FILE);
    }
}
