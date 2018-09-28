package bridge.loggerBlinovRomanchick;

public class BridgeClient {

    public static void main(String[] args) {
        LoggerImplementor loggerImplementor = new SingleThreadedLogger();
        Logger logger = new ConsoleLogger(loggerImplementor);
        logger.log();
        loggerImplementor = new MultiThreadedLogger();
        logger.setLoggerImplementor(loggerImplementor);
        logger.log();
        new FileLogger(loggerImplementor).log();
    }
}
