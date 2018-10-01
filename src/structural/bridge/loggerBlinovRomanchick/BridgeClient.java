package structural.bridge.loggerBlinovRomanchick;

public final class BridgeClient {

    public static void main(final String[] args) {
        LoggerImplementor loggerImplementor = new SingleThreadedLogger();
        final Logger logger = new ConsoleLogger(loggerImplementor);
        logger.log();
        loggerImplementor = new MultiThreadedLogger();
        logger.setLoggerImplementor(loggerImplementor);
        logger.log();
        new FileLogger(loggerImplementor).log();
    }
}
